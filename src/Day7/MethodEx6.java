package Day7;

public class MethodEx6 {

	public static void main(String[] args) {
		/* ������ ���� ����ϴ� �޼ҵ带 ���弼��.
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
	
		/* ������ ���� ����ϴ� �޼ҵ带 ���弼��.
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * */
		printLeftTriangle('+', 6);
		printRightTriangle('+', 6);
		printTriangle('*', 5, TriangleShape.LEFT_TRIANGLE);
		printTriangle('*', 5, TriangleShape.RIGHT_TRIANGLE);
	}
	/* ��� : �־��� ���ڸ� �̿��Ͽ� �������� ���� �ﰢ���� n�� ����ϴ� �޼ҵ�
	 * �Ű����� : ����, n�� => char ch, int n
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : printLeftTriangle 
	 * */
	public static void printLeftTriangle(char ch, int n) {
		for(int i = 1; i<= n; i+=1) {
			for(int k = 1; k<= i; k+=1) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	/* ��� : �־��� ���ڸ� �̿��Ͽ� ���������� ���� �ﰢ���� n�� ����ϴ� �޼ҵ�
	 * �Ű����� : ����, n�� => char ch, int n
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : printRightTriangle 
	 * */
	public static void printRightTriangle(char ch, int n) {
		for(int i = 1; i<= n; i+=1) {
			for(int k = 1; k<= n - i; k+=1) {
				System.out.print(" ");
			}
			for(int k = 1; k<= i; k+=1) {
				
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	/* ��� : �־��� ���ڸ� �̿��Ͽ� n�� �ﰢ�� ����ϴµ� �־��� �ﰢ�� ������ �°�
	 *       ����ϴ� �޼ҵ� 
	 * �Ű����� : ����, n��, �ﰢ�� ���� => char ch, int n, TriangleShape shape
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : printTriangle */
	public static void printTriangle(char ch, int n, TriangleShape shape) {
		switch(shape) {
		case LEFT_TRIANGLE:
			printLeftTriangle(ch, n);
			break;
		case RIGHT_TRIANGLE:
			printRightTriangle(ch, n);
			break;
		}
	}
}
enum TriangleShape{LEFT_TRIANGLE, RIGHT_TRIANGLE}