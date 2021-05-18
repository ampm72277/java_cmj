package day15;

public class NumberFormatExceptionTest {

	public static void main(String[] args) {
		String numStr = "1234a";
		//문자열에 숫자가 아닌 a라는 문자가 있어 예외 발생
		int num = Integer.parseInt(numStr);
		System.out.println(num);

	}

}
