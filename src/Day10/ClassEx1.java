package Day10;

public class ClassEx1 {
	
public static void main(String[] args) {
	A a = new A();
	a.num = 10;//public�̱� ������ ������ �߻����� ����
	B b = new B();
	//protected : Ŭ���� B�� ClassEx1�� ���� ��Ű���� �ֱ� ������ ���� �߻����� ����
	b.num = 10;
	C c = new C();
	//����Ʈ : Ŭ���� C�� ClassEx1�� ���� ��Ű���� �ֱ� ������ ���� �߻����� ����
	c.num = 10;
	D d = new D();
	//d.num = 10;//���� �߻� : num�� ���������ڰ� private�̾
	d.setNum(10);
	System.out.println(d.getNum());
}
}