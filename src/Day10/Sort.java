package Day10;

public class Sort {

	public static void main(String[] args) {
		/* �迭 ���� : ���� ����
		 *  - ���� ��ҿ� ���Ͽ� �����ϴ� ���
		 *  5 4 6 9 8 7 10 [0,1]
		 *  4 5 6 9 8 7 10 [1,2]
		 *  4 5 6 9 8 7 10 [2,3]
		 *  4 5 6 9 8 7 10 [3,4]
		 *  4 5 6 8 9 7 10 [4,5]
		 *  4 5 6 8 7 9 10 [5,6]
		 *  4 5 6 8 7 9 10 =>10�� Ȯ��
		 *  4 5 6 8 7 9 10 [0,1]
		 *  4 5 6 8 7 9 10 [1,2]
		 *  4 5 6 8 7 9 10 [2,3]
		 *  4 5 6 8 7 9 10 [3,4]
		 *  4 5 6 7 8 9 10 [4,5]
		 *  4 5 6 7 8 9 10 => 9�� Ȯ��
		 *  ���� �ݺ����� Ƚ��
		 *   - 0=>1=>2=>3=>4=>5(ū �ݺ�Ƚ���� i��)
		 *   - 6=>5=>4=>3=>2=>1
		 *    => 6 - i < arr.length - i
		 * */
		int [] arr= new int[] {5, 4, 6, 9, 8, 7, 10};
		printArray(arr);
		System.out.println();
		for(int i = 0; i < arr.length - 1; i+=1) {
			for(int k = 0; k < arr.length - 1 - i; k += 1) {
				if(arr[k] > arr[k+1]) {
					int tmp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = tmp;
				}
				printArray(arr);
				System.out.println();
			}
		}
		printArray(arr);
	}
	public static void printArray(int []arr) {
		for(int i = 0; i<arr.length; i+=1) {
			System.out.print(arr[i] + " ");
		}
	}
}