package Day10;

public class ClassEx6 {

	public static void main(String[] args) {
		
		Rect r1 = new Rect();
		r1.print();
		
		Rect r2 = new Rect(0, 10, 10, 0);
		r2.print();
		
		Point lu = new Point(0,20);
		Point rd = new Point(20,0);
		Rect r3 = new Rect(lu,rd);
		r3.print();
		lu.setX(-10);//점을 수정했더니 사각형의 점의 위치가 같이 수정되는 문제가 발생
		r3.print();
		
		lu.setX(-10);
		r3.print();
		r3.print();
		
		
	}
}