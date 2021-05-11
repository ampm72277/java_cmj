package Day10;
// 2���� ��ǥ ����� ���� ��Ÿ���� Ŭ���� : Point
// ������� : x��ǥ, y ��ǥ
// ��� �޼ҵ� : ��ǥ�� ����ϴ� ���, ��ǥ�� �̵���� ���
public class Point {
	private int x, y;

	// ��� 	  : ������� x,y��ǥ�� ����ϴ� ���
	// �Ű����� : ����(������� x,y�� �̿�)
	// ����Ÿ�� : ���� => void
	// �޼ҵ�� : print
	public void print() {
		//��������� ��� �޼ҵ忡�� ����ϴ� ��� ���� �������� �ʾƵ� ��.
		System.out.println("("+x+","+y+")");
	}
	
	// ���	  : ������ ��ǥ�� �̵��ϴ� �޼ҵ�
	// �Ű����� : ������ ��ǥ => int x1, int y1
	// ����Ÿ�� : ����
	// �޼ҵ�� : move
	public void move(int x1, int y1) {
		x = x1;
		y = y1;
			
		}
		
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	//�ʱ� x,y��ǥ�� x1, y1 �־����� �־��� x,y��ǥ�� ��������� �ʱ�ȭ�ϴ� ������
	public Point(int x1, int y1) {
		x = x1;
		y = y1;
	}
	public Point() {}
	
	
}
