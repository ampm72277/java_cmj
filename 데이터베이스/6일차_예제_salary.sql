create database if not exists company2;
use company2;

create table if not exists salary(
    sa_level char(2) not null,
    em_base_salary int not null default 0,
    em_add_salary int not null default 0,
    primary key(sa_level)
    );
    
create table if not exists employee(
	em_num int not null auto_increment,
    em_name varchar(15) not null,
    em_sa_level char(2) not null,
    em_year int not null default 1,
    em_salary int not null default 0,
    primary key(em_num),
    foreign key(em_sa_level) references salary(sa_level)
    );
    
create table if not exists payments(
	pa_num int not null auto_increment,
    pa_em_num int not null,
    pa_date datetime default current_timestamp,
    pa_price int not null,
    primary key(pa_num),
    foreign key(pa_em_num) references employee(em_num)
);    

insert into salary
	values('사원', 200, 10),('대리', 220, 15),('부장', 240, 20),('과장', 280, 25),
    ('전무', 300, 30),('이사', 305, 35);
    
insert into employee
	values(1, '홍길동', '사원', 2, 220);
-- 직원의 직급이 변경되는 경우 실행하는 프로시저
drop procedure if exists update_level;
delimiter //
create procedure update_level(
	in _name varchar(15)
    )
begin

end //
delimiter ;
call update_level();