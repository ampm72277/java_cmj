package Day5;

public class Array3 {

	public static void main(String[] args) {
		/* ���� num�� ����� �迭�� ������ �� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * ��, ����� ������ 10���� �Ѿ�� ��� �ִ� 10���� ����ϸ� �˴ϴ�.
		 * �ݺ�Ƚ�� 	: i�� 1���� num���� �۰ų� ���������� 1�� ����
		 * ��Ģ��		: num�� i�� �������� �� �������� 0�� ������
		 * 			  �迭 cnt������ i�� ���� ��
		 * 			  cnt�� 1 ���� ��
		 * 			  cnt�� 10�� ������ �ݺ��� ����
		 * �ݺ��� ���� �� : �迭�� �ִ� ���� 0�������� cnt�� ���  
		 * */
		int num = 12, i;
		int []arr = new int [10];
		int cnt = 0;
		for( i = 1 ; i <= num ; i += 1 ) {
			if(num % i == 0) {
				arr[cnt] = i;
				cnt += 1;
				if(cnt == 10) {
					break;
				}
			}
		}
		for( i = 0 ; i < cnt ; i += 1 ) {
			System.out.print(arr[i] + " ");
		}
	}

}
