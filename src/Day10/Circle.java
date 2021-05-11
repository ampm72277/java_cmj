package Day10;

public class Circle {
	//�߽���ǥ(x��ǥ,y��ǥ) ������ radius
	//private int x, y, radius;
	private Point center = new Point();
	private int radius;
	
	/* ��� 	  : ���� �߽����� �̵��ϴ� �޼ҵ�
	 * �Ű����� : �̵��� �߽����� ��ġ => int x, int y
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : move
	 * */
	public void move(int x, int y) {
		//center�� x,y��ǥ�� �Ű����� x,y�� �̵���Ű�� �ڵ�
		center.move(x, y);
	}
	/* ���	  : ���� ������ ����ϴ� �޼ҵ�
	 * �Ű����� : ����
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : print 
	 * */
	public void print() {
		/* ������ ���� ��µǵ��� �ڵ带 �ۼ��ϼ���.
		 * �߽��� : (?,?)
		 * ������ : ?
		 * */
		System.out.print("�߽��� : ");
		center.print();
		System.out.println("������ : " + radius);
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	//�������� ���̸� �����ϴ� �޼ҵ�
	public void setRadius(int radius) {
		this.radius = radius;
	}
}