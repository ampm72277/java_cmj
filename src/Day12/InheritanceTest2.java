package Day12;

public class InheritanceTest2 {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("010-1234-5678", "����", "������10 ");
		sp.print();

	}

}
// �� Ŭ����
class Phone{
	String num;
	String color;
	String model;
	public Phone(String num, String color, String model) {
		this.num = num;
		this.color = color;
		this.model = model;
	}
	public Phone(){		System.out.println("�� �⺻ �������Դϴ�.");
} 
	public void print() {
		System.out.println("��ȣ : "+num);
		System.out.println("���� : "+color);
		System.out.println("�� : "+model);
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
// ����Ʈ�� Ŭ����
class SmartPhone extends Phone{
	int camera; //ī�޶� ȭ��
	public SmartPhone(String num, String color, String model) {
		//�θ� Ŭ������ �����ڰ� ������ super();�� �����Ǿ� ����
		super(num,color,model);
		System.out.println("����Ʈ�� �������Դϴ�.");
		this.setNum(num);
		this.setColor(color);
		this.setModel(model);
	}
}