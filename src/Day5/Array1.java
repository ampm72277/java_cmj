package Day5;

public class Array1 {

	public static void main(String[] args) {
		/* �迭 ���� */
		int [] arr1;
		int arr2[];
		
		int arr3[] = new int[5];//�Ϲ������� ���� ���
		int arr4[] = {1,2,3,4};
		int arr5[] = new int[] {1,2,3,4};
		
		int []arr6 = new int[5];//�Ϲ������� ���� ���
		int []arr7 = {1,2,3,4};
		int []arr8 = new int[] {1,2,3,4};

		int []arr9, arr10;	//arr9 : �迭, arr10: �迭
		int arr11[], arr12;	//arr11: �迭, arr12: ����
		//�迭 arr6�� ù��° �� �ܼ� ���
		System.out.println(arr6[0]);
		//�迭 arr6�� �ι�°�� 10�� ����
		arr6[1] = 10;
		//�迭 arr6�� �ι�° �� �ܼ����
		System.out.println(arr6[1]);
	}

}
