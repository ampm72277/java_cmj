package Day7;

public class MethodEx6 {

	public static void main(String[] args) {
		printLeftTriangle('*', 6);
		printRightTriangle('*', 6);
		
		/* 다음과 같이 출력하는 메소드를 만드세요.
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		/* 다음과 같이 출력하는 메소드를 만드세요
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * */
		/* 기능 		: 주어진 문자(ch)를 이용하여 왼쪽으로 붙은 삼각형 출력하는 메소드
		 * 매개변수	: 문자, n줄 => char ch, int ㅜ
		 * 리턴타입 	: 없음 => void
		 * 메소드명 	: printLeftTriangle
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
		/* 기능 : 주어진 문자를 이용하여 n줄 삼각형을 출력하는데
		 * 주어진 삼각형 종류에 맞게 출력하는 메소드
		 * 
		 * 
		 * */

