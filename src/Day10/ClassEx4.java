package Day10;

import java.util.Scanner;

public class ClassEx4 {

	public static void main(String[] args) {
		/* �ֿܼ��� x��ǥ�� y��ǥ�� �Է¹޾� ���� �����, ������� ���� ��ġ��
		 * ����ϴ� ���� */
		Scanner scan = new Scanner(System.in);
		//�ֿܼ��� ������ �Է¹޾� ������ �����ϴ� �ڵ带 �ۼ��غ�����.
		System.out.print("��ǥ�� �Է����ּ���(x,y������) : ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		//�Է¹��� ��ǥ�� �̿��Ͽ� ���� ����
		Point pt = new Point();
		//���� : ������� pt�� x,y��ǥ��? (0,0) 
		pt.print();
		//pt�� �ʱⰪ�� �Է��� ���� 4,5�� �����ϴ� �ڵ带 �ۼ��ϼ���.
		//pt.setX(x);
		//pt.setY(y);
		
		pt.move(x, y);
		
		pt.print();
		
		scan.close();
	}

}
