package Day8;

public class Test8_4Java {

	public static void main(String[] args) {
		/* 2 1 4 3		1 2 3 4 	+1 -1 +1 -1
		 * 6 5 8 7 		5 6 7 8		+1 -1 +1 -1
		 * 10 9 12 11	9 10 11 12  +1 -1 +1 -1
		 */
	
		System.out.println("/n----------");
		for(int i =1 ; i<=12 ; i+=10) {
			System.out.println(i + " ");
			if(i % 2 == 1) {
				System.out.println();
			}
		}
		
		

	}

}
