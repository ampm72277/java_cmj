package Day3;

public class Test3_3 {

	public static void main(String[] args) {
		/* ������ 2�ǹ��, 3�ǹ��, 6�ǹ��, 2,3,6�� ����� �ƴ��� �Ǻ��ϴ� 
		 * ������ ���� if���� �̿��Ͽ� �ۼ�
		 * */
		
		int i=9;
		
		if(i%2==0) {
			System.out.println("2�� ���");
		}
		else if(i%3==0) {
			System.out.println("3�� ���");
		}
		else if(i%6==0) {
			System.out.println("6�� ���");
		}
		else if(i%2==0 ||i%3==0|| i%6==0) {
			System.out.println("2,3,6�� ���");
		}
		
		else {System.out.println("2,3,6�� ����� �ƴϴ�");}

	}

}

