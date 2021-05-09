package Day7;

public class MethodEx4 {

	/* gcd1�� ���뼺�� ���Ƽ� �ּ� ����� lcm�� ���� �� ����� �� ������
	 * gcd2�� ���뼺�� ���Ƽ� �ּ� ����� lcm�� ���� �� ����� �� ����.
	 * */
	public static void main(String[] args) {
		//�ִ������� �̿��Ͽ� �ּ� ������� ���ϴ� �޼ҵ带 �ۼ��ϼ���.
		//�� ������ A, B�� �ϰ� �ִ� ������� G, �ּ� ������� L�̶�� ������
		//A = Ga, B=Gb�� ǥ���� �� �ְ�, L = G*a*b
		//L = A*B/G �� ��Ÿ�� �� �ִ�.
		System.out.println(gcd1(8,12));
		gcd2(8,12);
		System.out.println(lcm(8,12));
	}
	/* ��� : �� ������ �ִ� ������� �˷��ִ� �޼ҵ� 
	 * �Ű����� : �� ���� => int num1, int num2
	 * ����Ÿ�� : �ִ� ����� => ���� => int
	 * �޼ҵ�� : gcd1
	 * */
	public static int gcd1(int num1, int num2) {
		int res = 1;
		for(int i = 1; i<=num1; i+=1) {
			if(num1 % i == 0 && num2 % i == 0) {
				res = i;
			}
		}
		return res;
	}
	/* ��� : �� ������ �ִ� ������� ����ϴ� �޼ҵ� 
	 * �Ű����� : �� ���� => int num1, int num2
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : gcd2
	 * */
	public static void gcd2(int num1, int num2) {
		int res = 1;
		for(int i = 1; i<=num1; i+=1) {
			if(num1 % i == 0 && num2 % i == 0) {
				res = i;
			}
		}
		System.out.println(num1+"�� "+num2+"�� �ִ� ����� : " + res);
	}
	/* ��� : �� ������ �ּ� ������� �˷��ִ� �޼ҵ�
	 * �Ű����� : �� ���� => int num1, int num2 
	 * ����Ÿ�� : �ּ� ����� => ���� => int
	 * �޼ҵ�� : lcm 
	 * */
	public static int lcm(int num1, int num2) {
		int res = num1 * num2 / gcd1(num1, num2);
		return res;
	}
}
