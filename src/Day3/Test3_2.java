package Day3;

import java.util.Scanner;

public class Test3_2 {

	public static void main(String[] args) {
		/* 정수를 입력받아 입력받은 정수가 0, 양수, 음수인지 판별하는
		 * 코드를 작성하세요.
		 * => 입력받은 정수가 0과 같다면 0이라고 출력하고,
		 *    (정수가 0과 같지 않고)입력받은 정수가 0보다 크다면 양수라고 출력하고,
		 *    입력받은 정수가 0보다 작다면 음수라고 출력하세요. 
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		if(i==0) {
			System.out.println("는 0과 같다");
		}else if(i>=1) {
			System.out.println("는 양수");
		}else {
			System.out.println("는 음수");
		}
		
		scan.close();

	}

}
