package Day5;

public class Array4 {

	public static void main(String[] args) {
		/* 1~10������ ���� 3���� �������� �����Ͽ� �迭�� ������ ��
		 * ������ ������ �ߺ��Ǿ����� �ȵǾ����� Ȯ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * ���� : 
 		 * ���� : 3 8 2
		 * �ߺ����� ����
		 * ���� : 
		 * ���� : 2 8 8
		 * �ߺ�
		 * */
		int min = 1, max = 10;
		int [] arr = new int [3];
		int i, k;
		System.out.print("���� : ");
		
		for(i = 0; i<3; i++) {
			arr[i] = (int)(Math.random() * (max - min + 1) + min);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		if(arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
			System.out.println("�ߺ�");
		}else {
			System.out.println("�ߺ� �ƴ�");
		}
		boolean isDuplicated = false;
		for(i = 0; i < arr.length - 1 ; i += 1) {
			for( k = i + 1; k < arr.length; k +=1) {
				if(arr[i] == arr[k]) {
					isDuplicated = true;
				}
			}
		}
		if(isDuplicated) {
			System.out.println("�ߺ�");
		}else {
			System.out.println("�ߺ� �ƴ�");
		}
	}

}
