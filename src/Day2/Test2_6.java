package Day2;

import java.util.Scanner;

public class Test2_6 {

	public static void main(String[] args) {
		/*������ �Է� �޾� �Է¹��� ������ ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * A : 90�̻� 100����
		 *     ������ 90���� ũ�ų� ����, ������ 100���� �۰ų� ������ 
		 *     A��� ���
		 * B : 80�̻� 90�̸�
		 *     ������ 80���� ũ�ų� ����, ������ 90���� ������
		 *     B��� ���
		 * C : 70�̻� 80�̸�
		 * D : 60�̻� 70�̸�
		 * F : 0�̻� 60�̸�
		 * �߸��� ���� : 0�̸�, 100�ʰ�
		 * */
		
		System.out.println("������ �Է��ϼ���. : ");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num >= 90 && num <=100) {
			System.out.println("A");
		}else if(num >= 80 && num <90) {
			System.out.println("B");
		}else if(num >=70 && num <80) {
			System.out.println("C");
		}else if(num >=60 && num <70) {
			System.out.println("D");
		}else if(num >=0 && num <60) {
			System.out.println("F");
		}else {
			System.out.println(num + "�߸��� ����");
			}
		scan.close();

		
		
	}

}
