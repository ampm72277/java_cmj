package Day8;

import java.util.Scanner;

public class Test8_1 {

	/* 1~9������ ������ �Է¹޾� �� ���ڰ� ��� �Էµƴ��� ����ϴ� �ڵ带
	 * �ۼ��ϼ���.
	 * -1�� �ԷµǸ� �Է� �����ϰ� �� ���ڰ� ��� �Էµƴ��� ���
	 * ����
	 * �Է� : 1
	 * �Է� : 1
	 * �Է� : 9
	 * �Է� : 3
	 * �Է� : 2
	 * �Է� : -1
	 * 1 : 2��
	 * 2 : 1�� 
	 * 3 : 1��
	 * 4 : 0��
	 * 5 : 0��
	 * 6 : 0��
	 * 7 : 0��
	 * 8 : 0��
	 * 9 : 1��
	 * */
	public static void main(String[] args) {
		
		//�ݺ����� �̿��Ͽ� ������ �Է¹���
		int num;
		int [] arr = new int[10];
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("�Է�(1~9) : ");
			num = scan.nextInt();
			if(num < 1 || num > 9) {
				break;
			}
			arr[num] += 1;
		}
		for(int i = 1; i<arr.length ; i+=1 ) {
			System.out.println(i + " : " + arr[i] + "��");
		}
		scan.close();
	}
}