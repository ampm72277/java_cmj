package Day6;

public class MethodEx2 {

	public static void main(String[] args) {
		int arr[] = new int[] {1, 2, 3, 4, 5};
		printArray(arr);
		iniArray(arr, 0);
		printArray(arr);
	}
	/* ���		: ���� �迭�� �ִ� ��� ���Ұ��� ����ϴ� �޼ҵ�
	 * �Ű����� 	: int arr[];
	 * ����Ÿ��	: ����
	 * �޼ҵ��	: printArray
	 * */
	public static void printArray(int arr[]) {
		/* ���� for��
		 * - �迭�̳� �÷��������ӿ�ũ
		 * - ��ü�� Ž��
		 * - ������ �ƴ� ���
		 * */
		for( int tmp : arr ) {
			System.out.print(tmp+" ");
		}
		System.out.println();
	}
	/* ���		: �迭�� ������ ������ ��� �ʱ�ȭ�ϴ� �޼ҵ�
	 * �Ű����� 	: �迭, ������ ���� => int []arr, int num
	 * ����Ÿ��	: 
	 * �޼ҵ��	: iniArray
	 * */	
	public static void iniArray(int []arr, int num) {
	if(arr==null) {
		return;
	}
	int i;
	for(i=0; i<arr.length; i+=1) {
		arr[i] = num;
		}
	}
}