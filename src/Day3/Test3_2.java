package Day3;

import java.util.Scanner;

public class Test3_2 {

	public static void main(String[] args) {
		/* ������ �Է¹޾� �Է¹��� ������ 0, ���, �������� �Ǻ��ϴ�
		 * �ڵ带 �ۼ��ϼ���.
		 * => �Է¹��� ������ 0�� ���ٸ� 0�̶�� ����ϰ�,
		 *    (������ 0�� ���� �ʰ�)�Է¹��� ������ 0���� ũ�ٸ� ������ ����ϰ�,
		 *    �Է¹��� ������ 0���� �۴ٸ� ������� ����ϼ���. 
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		if(i==0) {
			System.out.println("�� 0�� ����");
		}else if(i>=1) {
			System.out.println("�� ���");
		}else {
			System.out.println("�� ����");
		}
		
		scan.close();

	}

}
