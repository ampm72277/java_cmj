package Day6;

public class VariableEx1 {
	static int num = 10;
	public static void main(String[] args) {
		/* �������� : �츮�� ���ݱ��� ����� �Ϲ� ����, Ư�� ���������� ��밡���� ����
		 * 	-����� ��ġ���� �ش� {}�� ������ ��밡��
		 * ������� : Ŭ���� �ȿ� �ִ� ������, �ش� Ŭ������ ��� ������ ��� ����
		 * */
		
		int i;
		for(i=1; i<=5 ; i+=1) {
			System.out.print("*");
		}
		System.out.println(i);
		for(int k=1; k<=5 ; k+=1) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println(num);
	}
	public static void test() {
		System.out.println(num);
	}
}
