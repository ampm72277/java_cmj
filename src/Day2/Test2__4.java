package Day2;

import java.util.Scanner;

public class Test2__4 {

	public static void main(String[] args) {
		/* �Է¹��� ���� num�� 3�� ������� �ƴ��� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * =>num�� 3�� ����̸� 3�� ������ ����ϰ�,
		 *   num�� 3�� ����� �ƴϸ� 3�� ����� �ƴ϶�� ���*/

		//�Է¹��� ���� => Scnanner scan ���
		
		System.out.println("���� ������ �Է��ϼ��� : ");
	
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num%3==0) {
			System.out.println(num+"�� 3�� ���");
		}else {
			System.out.println(num+"�� 3�� ����� �ƴ�");}
			

		scan.close();

		}

}