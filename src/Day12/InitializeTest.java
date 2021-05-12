package Day12;

public class InitializeTest {
	public static void main(String []args) {
		TestA ta = new TestA();
		System.out.println(ta.getNum());
		System.out.println(TestA.getRes());
	}
}
/* ��ü ���� �ʱ�ȭ ����
 * 1. ���� ����� �⺻������ �ʱ�ȭ
 *    - num�� 0���� �ʱ�ȭ
 * 2. ����� �ʱ�ȭ
 *    - num�� 1�� �ʱ�ȭ
 * 3. �ʱ�ȭ ���
 *    - num�� 3���� �ʱ�ȭ
 * 4. ������ �ʱ�ȭ
 *    - num�� 2�� �ʱ�ȭ
 * - �⺻���� �ƴ� ������ �����ڿ��� �ʱ�ȭ����
 * Ŭ���� ����
 * 1. ���� ����� �⺻������ �ʱ�ȭ
 * 	  - res�� 0���� �ʱ�ȭ
 * 2. ����� �ʱ�ȭ
 *    - res�� 10���� �ʱ�ȭ
 * 3. �ʱ�ȭ ���
 * */
class TestA{
	private int num = 1;
	private static int res = 10;
	//�ʱ�ȭ ��� : ��ü����
	{
		num = 3;
	}
	//�ʱ�ȭ ��� : Ŭ���� ����
	static {
		res = 20;
	}
	public TestA() {
		num = 2;
	}
	public int getNum() {
		return num;
	}
	public static int getRes() {
		return res;
	}
}