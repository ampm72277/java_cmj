package Day5;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
/* 
���� �߱� ����
 - 1 ~ 9 ������ �ߺ����� ���� 3���� ������ �������� ����
 - B : ���ڴ� ������ ��ġ�� �ٸ� ���
 - S : ���ڵ� �ְ�, ��ġ�� ���� ���
 - O : ��ġ�ϴ� ���ڰ� �ϳ��� ���� ���
���� : 3 9 5
�Է� �ϼ��� : 1 2 3
1B
�Է� �ϼ��� : 4 5 6
1B
�Է��ϼ��� : 3 4 5
2S
�Է��ϼ��� : 3 5 9
1S2B
�Է��ϼ��� : 6 7 8
O
�Է��ϼ��� : 3 9 5
3S
�����Դϴ�.
*/
		int min = 1, max = 9;
		int i, r;
		int [] arr = new int[3];
		for( i = 0 ; i< arr.length ; i+=1 ) {
			r = (int)(Math.random() * (max - min + 1) + min);
			arr[i] = r;
		}

		for( i = 0 ; i < arr.length ; i += 1) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
