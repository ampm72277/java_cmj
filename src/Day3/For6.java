package Day3;

import java.util.Scanner;

public class For6 {

	public static void main(String[] args) {
		/* ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * ����
		 * ������ �Է��ϼ��� : 6
		 * 1 2 3 6
		 * ���� : num
		 * �ݺ�Ƚ�� : i�� 1���� num���� 1�� ����
		 * 		�ʱ�ȭ : i�� 1����
		 * 		���ǽ� : i�� num����, i�� num���� �۰ų� ����
		 * 		������ : i�� 1�� ���� 
		 * ��Ģ�� : i�� num�� ����̸� i�� ���
		 *        => num�� i�� �������� �� �������� 0�� ���ٸ� i�� ���
		 * �ݺ��� ���� �� : ����
		 * */
		
		System.out.println("������ �Է��ϼ���. :");
		int i;
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(i=1 ; i<=num ; i+=1) {
			if(num%i==0) {
			System.out.print(i+" ");
			}
		}
		
		
		scan.close();

	}

}
