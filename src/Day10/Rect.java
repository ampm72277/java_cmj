package Day10;


public class Rect {
	//�ʺ� : width, ����, ���� : height, ����
	private int width, height;
	//�������� �� : leftUp, 
	private Point leftUp;
	//�����ʾƷ��� �� : rightDown, 
	private Point rightDown;
	
	/* ���	  : �簢���� ������ ����ϴ� �޼ҵ�
	 * �Ű����� : ����
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : print
	 * */
	public void print() {
		System.out.print("������ �� : ");
		leftUp.print();
		System.out.print("���������� : ");
		rightDown.print();
		System.out.println("�ʺ� : " + width);
		System.out.println("���� : " + height);
	}
	/* ���	  : �־��� ��ǥ�� �������� ���� �̵���Ű�� �޼ҵ�
	 * �Ű����� : 
	 * ����Ÿ�� : 
	 * �޼ҵ�� : move
	 * */
	
	/* �⺻ ������ : �������� ���� ��Ÿ���� ��ü�� ����, ������ ���� ���� ��Ÿ���� 
	 * 			   ��ü ���� */
	public Rect() {
		leftUp = new Point();
		rightDown = new Point();
	}
	/* ������   : �»����� �������� �־����� �ش� ���� �̿��� �簢���� �ǵ��� �ʱ�ȭ
	 * 			�»���, ������ �ʱ�ȭ, �ʺ�� ���̵� ����ؼ� �ʱ�ȭ 
	 * �Ű����� : 
	 * */
	public Rect(int left, int up, int right, int down) {
		leftUp = new Point(left,up);
		rightDown = new Point(right, down);
		width = right - left;
		height = up - down;
	}
	public Rect(Point lu, Point rd) {
		leftUp = lu;
		rightDown = rd;
		width = rightDown.getX() - leftUp.getX();
		height = leftUp.getY() - rightDown.getY();
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Point getLeftUp() {
		return leftUp;
	}
	public void setLeftUp(Point leftUp) {
		this.leftUp = leftUp;
	}
	public Point getRightDown() {
		return rightDown;
	}
	public void setRightDown(Point rightDown) {
		this.rightDown = rightDown;
	}
}