package Day6;

public class VariableEx1 {
	static int num = 10;
	public static void main(String[] args) {
		/* 지역변수 : 우리가 지금까지 사용한 일반 변수, 특정 지역에서만 사용가능한 변수
		 * 	-선언된 위치부터 해당 {}안 끝까지 사용가능
		 * 멤버변수 : 클래스 안에 있는 변수로, 해당 클래스에 모든 곳에서 사용 가능
		 * */
		
		int i;
		for(i=1; i<=5 ; i+=1) {
			System.out.print("*");
		}
		System.out.println(i);
		for(int k=1; k<=5 ; k+=1) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println(num);
	}
	public static void test() {
		System.out.println(num);
	}
}
