package Day6;

public class MethodEx1 {

	public static void main(String[] args) {
		//�޼ҵ� ����
		//�޼ҵ��(��);
		System.out.println(add(1,2));
		add2(1,2);
		printMultiTable(8);
		printMultiTable(5);
		int num1 = 8, num2 = 12;
		int res = gcd(num1, num2);
		System.out.println(num1 + "�� " +num2+"�� �ִ� ����� : " + res);
	}
	/* ���    : �� ������ �־����� �� ������ ���� �˷��ִ� �޼ҵ� 
	 * �Ű����� : �� ���� => int num1, int num2
	 * ����Ÿ�� : ������ �� => ���� => int
	 * �޼ҵ�� : add
	 * */
	public static int add(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
	/* ���    : �� ������ �־����� �� ������ ���� �ֿܼ� ����ϴ� �޼ҵ� 
	 * �Ű����� : �� ���� => int num1, int num2
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : add2
	 * */
	public static void add2(int num1, int num2) {
		int res = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + res);
	}
	/* ���	  : �� ������ ��� �����ڰ� �־����� �� ������ ��� ���� ����� �˷��ִ� �޼ҵ�
	 * �Ű����� : �� ������ ��� ������=> int num1, char op, int num2
	 * ����Ÿ�� : ��� ���� ��� => �Ǽ� => double
	 * �޼ҵ�� : calculate 
	 * */
	public static double calculate(int num1, char op, int num2) {
		return 0.0;
	}
	/* ��� 	  : �� ������ �ִ� ������� �˷��ִ� �޼ҵ�
	 * �Ű����� : �� ���� => int num1, int num2
	 * ����Ÿ�� : �ִ� ����� => ���� => int
	 * �޼ҵ�� : gcd
	 * */
	public static int gcd(int num1, int num2) {
		int i, gcd = 1;
		for(i = 1 ; i <= num1 ; i += 1) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	/* ��� 	  : num���� ����ϴ� �޼ҵ�
	 * �Ű����� : ���� num => int num
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : printMultiTable
	 * */
	public static void printMultiTable(int num) {
		int i;
		System.out.println(num + "��");
		for(i=1 ; i<=9 ; i+=1 ) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
	}
}