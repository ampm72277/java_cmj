package Day7;

public class MethodEx4 {

	public static void main(String[] args) {
		/* ��� 	  : �� ������ �ִ� ������� �˷��ִ� �޼ҵ�
		 * �Ű����� : �� ���� => int num1, int num2
		 * ����Ÿ�� : �ִ� ����� => ���� => int
		 * �޼ҵ�� : gcd1
		 * */
		System.out.println(gcd1(8,12));
		gcd2(8,12);
		System.out.println(lcm(8, 12));
	}

	public static int gcd1(int num1, int num2) {
		int res = 1;
		for(int i = 1 ; i <= num1 ; i += 1) {
			if(num1 % i == 0 && num2 % i == 0) {
				res = i;
			}
		}
		return res;
	}
	public static void gcd2(int num1, int num2) {
		int res = 1;
		for(int i = 1; i<=num1; i+=1) {
			if(num1 % i == 0 && num2 % i == 0) {
				res = i;
			}
		}
		System.out.println(num1+"�� "+num2+"�� �ִ� ����� : " + res);
	}
	public static int lcm(int num1, int num2) {
		int res = num1 * num2 / gcd1(num1, num2);
		return res;
	}
}
