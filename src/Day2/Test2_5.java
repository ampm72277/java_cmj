package Day2;

import java.util.Scanner;

public class Test2_5 {

	public static void main(String[] args) {
		/* ������ �Է¹޾� 6�� ����̸� 6�� ������ ����ϰ�,
		 * 2�� ����̸� 2�ǹ����� ����ϰ� 3�ǹ���̸� 3�� ������ ����ϰ�
		 * 2, 3, 6�� ����� �ƴϸ� 2, 3, 6�� ����� �ƴմϴٶ�� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * ��, 6, 12�� ���� 6�� ����� ���� 6�� ����Դϴٶ�� �ϳ��� ��µǾ�� �մϴ�.
		 * */

		//������ �Է¹޾� =>Scanner.scan
		

		System.out.println("������ �Է��ϼ���. :");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num % 6 == 0) {
			System.out.println(num + "�� 6�� ���");
		}else if(num % 2 ==0 ) {
			System.out.println(num + "�� 2�� ���");
		}else if(num % 3 == 0) {
			System.out.println(num + "�� 3�� ���");
		}else{
			System.out.println(num + "�� 2, 3, 6�� ����� �ƴմϴ�.");
		}
		
		
		scan.close();
	}

}
