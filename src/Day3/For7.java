package Day3;

import java.util.Scanner;

public class For7 {

	public static void main(String[] args) {
		/* �� ������ �ִ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * ��� : ����� �������� ��
		 * 6�� ��� : 1,2,3,6
		 * ����� : �������� �ִ� ���
		 * 8�� ��� : 1, 2, 4, 8
		 * 12�� ���: 1, 2, 3, 4, 6, 12
		 * 8�� 12�� ����� : 1, 2, 4
		 * �ִ� ����� : ����� �� ���� ū ��
		 * 8�� 12�� �ִ� ����� : 4
		 * �� ���� : num1=8, num2=12
		 * �ݺ�Ƚ�� : i�� 1���� num1���� 1�� ����
		 * ��Ģ�� : i�� num1�� ����̰� i�� num2�� ����̸�
		 *        i�� ���� gcd�� ����
		 *        =>num1�� i�� �������� �� �������� 0�� ����
		 *          num2�� i�� �������� �� �������� 0�� ���ٸ�
		 *          i�� ���� gcd�� ����
		 * �ݺ��� ���� �� : gcd�� ���
		 * */ 
		System.out.println("num1 :");
		System.out.println("num2 :");
		int i, gcd=1;
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		for(i=1 ; i<=num1 ; i+=1) {
			if(num1%i==0 && num2%i==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
		
		scan.close();

	}

}
