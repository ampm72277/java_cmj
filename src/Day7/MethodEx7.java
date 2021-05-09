 package Day7;

public class MethodEx7 {

	public static void main(String[] args) {
		int [] arr= new int[] {1,2,3,4,5};
		int num = 3;
		System.out.println(contains(arr, num, arr.length));
		System.out.println(contains(arr, num, 2));
		
		//initRandomArray(arr, 1, 9);
		arr = initRandomArray2(3, 1, 9);
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		
	}
	/* ��� : �迭�� �־�����, �־��� �迭���� 0�������� count������ Ȯ���Ͽ�
	 *       ���� num�� �ִ��� ������ Ȯ���ϴ� �޼ҵ�
	 * 		 (�迭�� ���� num�� �ִ��� �ߺ�üũ)
	 * �Ű����� : �迭([1,2,3,4,5], ���� num(7) => int []arr, int num
	 * 			���� => int count
	 * ����Ÿ�� : �ִ��� ������ => �� �Ǵ� ���� => boolean
	 * �޼ҵ�� : contains
	 *  */
	public static boolean contains(int []arr, int num, int count) {
		//����ó�� : �迭�� ũ�⺸�� count�� ū ���
		if(arr.length < count) {
			//���� ������ �迭�� ũ��� ����
			count = arr.length;
		}
		for(int i= 0; i < count; i +=1) {
			//�迭�� ���� num�� ���� ���� ���(�ߺ��� ���)
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	/* ��� : �迭�� �ߺ����� �ʴ� ������ ���� �����Ͽ� �����ϴ� �޼ҵ�
	 * �Ű����� : �迭, ������ ���� ����� ���� ���� 
	 * 			=> int [] arr, int min, int max
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : initRandomArray
	 * */
	public static void initRandomArray(int []arr, int min, int max) {
		//���� ó��1 : �迭�� ���� ���
		if(arr == null) {
			return;
		}
		//���� ó��2 : min�� max�� �ٲ� ���
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		//���� ó��3 : ���� ������ ������ �迭�� ũ�⺸�� ���� ���
		if(max - min + 1 < arr.length) {
			return ;
		}
		//�迭�� �������� ���� �����Ͽ� ����(�ߺ� ����)
		int cnt = 0; //�迭�� ����� ���� ����
		while(cnt < arr.length) {
			int r = (int)(Math.random() * (max - min + 1) + min);
			//�ߺ� üũ �� �ߺ����� ������ ����
			if(!contains(arr, r, cnt)){
				arr[cnt] = r;
				cnt+=1;
			}
		}
	}
	public static int[] initRandomArray2(int size, int min, int max) {
		int [] arr= new int[size];
		//���� ó��2 : min�� max�� �ٲ� ���
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		//�迭�� �������� ���� �����Ͽ� ����(�ߺ� ����)
		int cnt = 0; //�迭�� ����� ���� ����
		while(cnt < arr.length) {
			int r = (int)(Math.random() * (max - min + 1) + min);
			//�ߺ� üũ �� �ߺ����� ������ ����
			if(!contains(arr, r, cnt)){
				arr[cnt] = r;
				cnt+=1;
			}
		}
		return arr;
	}
}