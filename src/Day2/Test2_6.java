package Day2;

import java.util.Scanner;

public class Test2_6 {

	public static void main(String[] args) {
		/*성적을 입력 받아 입력받은 성적을 출력하는 코드를 작성하세요.
		 * A : 90이상 100이하
		 *     성적이 90보다 크거나 같고, 성적이 100보다 작거나 같으면 
		 *     A라고 출력
		 * B : 80이상 90미만
		 *     성적이 80보다 크거나 같고, 성적이 90보다 작으면
		 *     B라고 출력
		 * C : 70이상 80미만
		 * D : 60이상 70미만
		 * F : 0이상 60미만
		 * 잘못된 성적 : 0미만, 100초과
		 * */
		
		System.out.println("성적을 입력하세요. : ");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num >= 90 && num <=100) {
			System.out.println("A");
		}else if(num >= 80 && num <90) {
			System.out.println("B");
		}else if(num >=70 && num <80) {
			System.out.println("C");
		}else if(num >=60 && num <70) {
			System.out.println("D");
		}else if(num >=0 && num <60) {
			System.out.println("F");
		}else {
			System.out.println(num + "잘못된 성적");
			}
		scan.close();

		
		
	}

}
