package eic;

public class Star {

	public static void main(String[] args) {
		/*     *		i=1	��=4 	*=1
		 *    ***		i=2	��=3 	*=3
		 *   *****		i=3	��=2 	*=5
		 *  *******		i=4	��=1 	*=7
		 * *********	i=5	��=0 	*=9
		 * 					��=5-i	*=2*i-1
		 * */
		int i,k;
		int num = 5;
		for(i = 1; i<=num; i+=1) {
			for(k = 1; k<=num-i; k+=1 ) {
				System.out.print(" "); 
			}
			for(k = 1; k<=2*i-1; k+=1 ) {
				System.out.print("*"); 
			}
			System.out.println();
		}
		System.out.println("=========");
		/* *********	i=1	��=0		*=9
		 *  *******		i=2	��=1		*=7
		 *   *****		i=3	��=2		*=5
		 *    ***		i=4	��=3		*=3
		 *     *		i=5	��=4		*=1
		 * 					��=i-1	*=2*(5-i) + 1
		 */
		for(i = 1; i<=num; i+=1) {
			for(k = 1; k<=i-1; k+=1 ) {
				System.out.print(" "); 
			}
			for(k = 1; k<=2*(5-i)+1; k+=1 ) {
				System.out.print("*"); 
			}
			System.out.println();
		}
	}

}
