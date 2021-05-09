package Day7;

import java.util.Scanner;

public class BaseballGame2 {

	public static void main(String[] args) {
		/* ���� �߱� ������ �޼ҵ带 �̿��Ͽ� �����ϼ���. 
		 * �տ��� ����� contains�� initRandomArray�� �̿��ϰ�
		 * �ʿ��ϸ� ���ο� �޼ҵ带 ���� �ۼ��غ�����. */
		
		//��ǻ�Ͱ� �������� �ߺ����� ���� ������ ����
		int []com = new int[3];
		int min = 1, max = 9;
		//�޼ҵ带 �̿��Ͽ� �迭�� �������� �� ���� ����(�ߺ� x)
		init(com, min, max);
		//�������� ������ ��ǻ�� ���� Ȯ��
		for(int tmp : com) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		//3S(���⶧)�� ������ �ݺ�
		int strike = 0, ball = 0;
		int []user = new int[3];
		Scanner scan = new Scanner(System.in);
		do {
			//���� �Է� : �ݺ����� Scanner �̿��Ͽ� ���� 3�� �Է�
			System.out.print("�Է� : ");
			for(int i = 0; i<user.length; i+=1) {
				user[i] = scan.nextInt();
			}
			//��Ʈ����ũ�� ���� ������ ��
			//�޼ҵ带 �̿��Ͽ� ��Ʈ����ũ ������ ��
			//�޼ҵ带 �̿��Ͽ� ���� ������ ��
			strike = getStrike(com, user);
			ball = getBall(com,user);
			
			//��Ʈ����ũ, ��, �ƿ��� ����
			//�޼ҵ带 �̿��Ͽ� ����
			printResult(ball, strike);
		}while(strike < 3);
		scan.close();
	}
	/* ���	  : �迭 arr�� 0�������� count������ Ȯ���Ͽ� ���� num�� �ִ��� ������ 
	 * 			�˷��ִ� �޼ҵ� 
	 * �Ű����� : �迭 arr, ���� count, ���� num => int[]arr, int count, int num
	 * ����Ÿ�� : �ִ��� ������=>boolean
	 * �޼ҵ�� : contains
	 * ����	  : [1,2,3,4,5] �迭���� ó������ 3���߿��� 5�� �ִ��� ������ Ȯ�� => X
	 * 			[1,2,3,4,5] �迭���� ó������ 5���߿��� 5�� �ִ��� ������ Ȯ�� => O
	 * */
	public static boolean contains(int[]arr, int count, int num) {
		for(int i = 0; i < count ; i += 1 ) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	/* ���	  : �迭 arr�� �־����� �־��� �迭�� min~max������ ������ ���� �����Ͽ�
	 * 			�ߺ����� �ʰ� �����ϴ� �޼ҵ�
	 * �Ű����� : �迭 arr, ���� ����(min~max)=> int[]arr, int min, int max
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : init
	 * */
	public static void init(int []arr, int min, int max) {
		int cnt = 0;//����� ������ ����
		while(cnt < arr.length) {
			int r = (int)(Math.random() * (max - min + 1) + min);
			//�迭 arr�� �ִ� ������ cnt���� r�� ��
			if(!contains(arr, cnt, r)) {
				arr[cnt] = r;
				cnt += 1;
			}
		}
	}
	/* ���	  : �迭 arr1�� �迭 arr2���� ���� ��ġ�� ���ڸ� ���Ͽ� ���� ������
	 * 			������ �˷��ִ� �޼ҵ�
	 * �Ű����� : �迭 arr1, �迭 arr2 => int []arr1, int []arr2
	 * ����Ÿ�� : ���� ������ ���� => ���� => int
	 * �޼ҵ�� : getStrike
	 * ����	  : [1 2 3] [3 4 5] => 0
	 * 			[1 2 3] [1 9 4] => 1
	 * */
	public static int getStrike(int []arr1, int []arr2) {
		int cnt = 0;
		for(int i=0; i<arr1.length; i +=1) {
			if(arr1[i] == arr2[i]) {
				cnt += 1;
			}
		}
		return cnt;
	}
	/* ���	  : �迭 arr1�� �迭 arr2���� ���� �ڸ��� �ƴ� ���� �߿��� ���� ������
	 * 			������ �˷��ִ� �޼ҵ�
	 * �Ű����� : �迭 arr1, �迭 arr2=>int []arr1, int [] arr2
	 * ����Ÿ�� : �����ڸ��� �ƴ� ���� �߿��� ���� ������ ���� => ���� =>int
	 * �޼ҵ�� : getBall
	 * ����	  : [1 2 3] [3 2 4] => 1 => ���� ������ ���� - ��Ʈ����ũ�Ǽ�
	 * 									2 - 1 = 1
	 * */
	public static int getBall(int []arr1, int[]arr2) {
		int cnt = 0;//���� ������ ����
		for(int i= 0; i<arr1.length; i+=1) {
			if(contains(arr2, arr2.length, arr1[i])) {
				cnt += 1;
			}
		}
		return cnt - getStrike(arr1, arr2);
	}
	/* ���	  : ball�� strike�� ���� ���� ����� ����ϴ� �޼ҵ� 
	 * �Ű����� : ball, strike => int ball, int strike
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : printResult
	 * */
	public static void printResult(int ball, int strike) {
		if(strike != 0) {
			System.out.print(strike + "S");
		}
		if(ball != 0) {
			System.out.print(ball + "B");
		}
		if(strike == 0 && ball == 0) {
			System.out.print("O");
		}
		System.out.println();
	}
}
