package Day10;

import java.util.Scanner;

public class ClassEx5 {

	public static void main(String[] args) {
		/* Circle Ŭ������ �̿��Ͽ� �� ��ü�� ������ �� �׽�Ʈ �ϴ� ���� */
		Circle c1 = new Circle();
		c1.print();
		//�߽����� 5,5�� �̵�
		c1.move(5, 5);
		//������ ���� ���� 5��
		c1.setRadius(5);
		c1.print();
		//Scanner��� Ŭ������ �̿��Ͽ� scan ��ü�� �����ϰ�,
		//new�� �̿��Ͽ� ��ü�� �����, ������� ��ü�� ���������
		//Scanner(System.in) �����ڸ� �̿��Ͽ� �ʱ�ȭ
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
	}

}