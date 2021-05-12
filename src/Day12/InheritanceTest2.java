package Day12;

public class InheritanceTest2 {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("010-1234-5678", "빨강", "아이폰10 ");
		sp.print();

	}

}
// 폰 클래스
class Phone{
	String num;
	String color;
	String model;
	public Phone(String num, String color, String model) {
		this.num = num;
		this.color = color;
		this.model = model;
	}
	public Phone(){		System.out.println("폰 기본 생성자입니다.");
} 
	public void print() {
		System.out.println("번호 : "+num);
		System.out.println("색상 : "+color);
		System.out.println("모델 : "+model);
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
// 스마트폰 클래스
class SmartPhone extends Phone{
	int camera; //카메라 화소
	public SmartPhone(String num, String color, String model) {
		//부모 클래스의 생성자가 없으면 super();가 생략되어 있음
		super(num,color,model);
		System.out.println("스마트폰 생성자입니다.");
		this.setNum(num);
		this.setColor(color);
		this.setModel(model);
	}
}