package Day3;

public class Test3_3_1 {

	public static void main(String[] args) {
		/* ������ 2�ǹ��, 3�ǹ��, 6�ǹ��, 2,3,6�� ����� �ƴ��� �Ǻ��ϴ� 
		 * ������ ���� if���� �̿��Ͽ� �ۼ�
		 * */
		int num = 9;
		if(num % 2 == 0) {
			//2�� ����̸鼭 3�� ���
			if(num % 3 == 0) {
				System.out.println("6�� ���");
			}
			//2�� ��������� 3�� ����� �ƴ�
			else {
				System.out.println("2�� ���");
			}
		}
		else if(num % 3 == 0) {
			System.out.println("3�� ���");
		}
		else {
			System.out.println("2,3,6�� ����� �ƴ�");
		}

	}

}
