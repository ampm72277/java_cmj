package Day10;

import Day10.Point; //��������. ���� ��Ű���� �ִ� Ŭ�����̹Ƿ�

public class ClassEx3 {

	public static void main(String[] args) {
		//pt��� ��ü�� ���� �� ����
		// ��ü pt�� ���� ����
		//�Ϲݺ��� : Ÿ���� �⺻Ÿ������ �� ����
		//�������� : Ÿ���� �⺻Ÿ���� �ƴ� ����
		Point pt1 = null;
		Point pt2 = new Point();
		/* pt1.print();
		* ���� �߻� : ��ü�� �������� ���� ���¿��� �޼ҵ带 ȣ���߱� ����*/
		pt2.print();
		pt2.move(4, 5);
		pt2.print();	
		
		Point pt3 = new Point(1,2);
		pt3.print();
	}
}
