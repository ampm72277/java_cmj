package Day5;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/* �Է¹��� ���ڰ� q�Ǵ� Q�̸� �����ϴ� ���� */
		char ch;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("�Է�(�����Ϸ��� q/Q �Է�) : ");
			ch = scan.next().charAt(0);
		}while(ch != 'q' && ch != 'Q');
		
		scan.close();
	}

}
