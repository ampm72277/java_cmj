package Day3;

public class Test3_6 {

	public static void main(String[] args) {
		/* 1���� 10������ ¦������ ���� ���ϴ� ����
		 * */
		int i, sum = 0;
		for(i=2; i<=10; i+=2) {
			//sum += i;
			sum = sum + i;
		}
		System.out.println("1���� 10���� ¦���� �� : " + sum);
	}

}
