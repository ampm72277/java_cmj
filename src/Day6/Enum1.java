package Day6;

import java.util.Scanner;

public class Enum1 {

	public static void main(String[] args) {
		//�������� ������� �ʰ� ������ �Է��ϰ� ����ϴ� ����
		int today;
		System.out.print("������ �Է��ϼ���(1:��, 2:ȭ, 3:��, 4:��, 5:��, 6:��, 7: ��:) ");
		Scanner scan = new Scanner(System.in);
		today = scan.nextInt();
		switch(today) {
		case 1: System.out.println("�������Դϴ�."); break;
		case 2: System.out.println("ȭ�����Դϴ�."); break;
		case 3: System.out.println("�������Դϴ�."); break;
		case 4: System.out.println("������Դϴ�."); break;
		case 5: System.out.println("�ݿ����Դϴ�."); break;
		case 6: System.out.println("������Դϴ�."); break;
		case 7: System.out.println("�Ͽ����Դϴ�."); break;

		}
		
		
		scan.close();

		
	}

}
