package Day6;

public class MethodEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 10, num2= 20;
		System.out.println(num1 + ", " + num2);
		swap(num1, num2);
		System.out.println(num1 + ", "+num2 );
	}
	/* ��� : �� ������ ���� �ٲٴ� �޼ҵ�
	 * �Ű����� : �� ���� => int num1, int num2
	 * ����Ÿ�� : ����=> void
	 * �޼ҵ�� : swap
	 * */
 public static void swap(int num1, int num2) {
	 int tmp = num1;
	 num1 = num2;
	 num2= tmp;
 }
}
