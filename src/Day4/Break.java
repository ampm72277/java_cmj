package Day4;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=5; i+=1) {
			System.out.println("Hello");
			//if�� ���� break�� ������ �ݺ����� �� �ǹ̰� ��������.
			break;
		}
		for(i=1 ;  ; i+=1 ) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
		char ch;
		Scanner scan = new Scanner(System.in);
		for( ; ; ) {
			System.out.print("���ڸ� �Է��ϼ���(�����Ϸ��� q/Q �Է�) : ");
			ch = scan.next().charAt(0);
			if(ch == 'q' || ch == 'Q') {
				break;
			}
		}
		scan.close();
	}

}
