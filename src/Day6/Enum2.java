package Day6;

import java.util.Scanner;

public class Enum2 {

	public static void main(String[] args) {
		//�������� ����ϰ� ������ �Է��ϰ� ����ϴ� ����
		Week1 today = Week1.MONDAY;
		System.out.print("������ �Է��ϼ���(1:��, 2:ȭ, 3:��, 4:��, 5:��, 6:��, 7:��) : ");
		Scanner scan = new Scanner(System.in);
		int itoday = scan.nextInt();
		today.setWeek(itoday);
		switch(today) {
		case MONDAY:	System.out.println("�������Դϴ�.");	break;
		case TUESDAY:	System.out.println("ȭ�����Դϴ�.");	break;
		case WEDNSEDAY:	System.out.println("�������Դϴ�.");	break;
		case THURSDAY:	System.out.println("������Դϴ�.");	break;
		case FRIDAY:	System.out.println("�ݿ����Դϴ�.");	break;
		case SATURDAY:	System.out.println("������Դϴ�.");	break;
		case SUNDAY:	System.out.println("�Ͽ����Դϴ�.");	break;
		}
		scan.close();
	}
}
enum Week1{ 
	MONDAY(1), 
	TUESDAY(2), 
	WEDNSEDAY(3), 
	THURSDAY(4), 
	FRIDAY(5), 
	SATURDAY(6), 
	SUNDAY(7);
	private int week;
	
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	Week1(int week){
		this.week = week;
	}
}