package Day7;

public class MethodEx6 {

	public static void main(String[] args) {
		printLeftTriangle('*', 6);
		printRightTriangle('*', 6);
		
		/* ������ ���� ����ϴ� �޼ҵ带 ���弼��.
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		/* ������ ���� ����ϴ� �޼ҵ带 ���弼��
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * */
		/* ��� 		: �־��� ����(ch)�� �̿��Ͽ� �������� ���� �ﰢ�� ����ϴ� �޼ҵ�
		 * �Ű�����	: ����, n�� => char ch, int ��
		 * ����Ÿ�� 	: ���� => void
		 * �޼ҵ�� 	: printLeftTriangle
		 */
		
		
	}
	public static void printLeftTriangle(char ch, int n) {
		for(int i=1; i<=n; i+=1) {
			for(int k=1; k<=n-1; k+=1 ) {
			System.out.print(ch);
		}
			System.out.println();}
	}
		
		public static void printRightTriangle(char ch, int n) {
			for(int i=1; i<=n; i+=1) {
				for(int k=1; k<=n-1; k+=1 ) {
				System.out.print(" ");
			}
				for(int k =1; k<=1 ; k+=1) {
					System.out.print(ch);
				}
				System.out.println();}
		}
	}
		/* ��� : �־��� ���ڸ� �̿��Ͽ� n�� �ﰢ���� ����ϴµ�
		 * �־��� �ﰢ�� ������ �°� ����ϴ� �޼ҵ�
		 * 
		 * 
		 * */

