package Day3;

public class Test3_5 {

	public static void main(String[] args) {
		/* ���� �������ϼ��� ����ϴ� ������ switch������ �ۼ��ϼ���.
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 * */
		int month = 13;
		switch(month) {
		//month�� 1,3,5,7,8,10,12�� �� ���� ���๮�� ����
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println(month + "���� 28�ϱ��� �ֽ��ϴ�.");
			break;
		//month�� 4,6,9,11�� �� 11�� �ش��ϴ� ���๮�� ���๮�� ����
		//4,6,9�϶��� ���๮�� ����
		case 4: case 6: case 9: case 11:
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�.");
			break;
		default:
			System.out.println(month + "���� �ùٸ� ���� �ƴմϴ�.");
	}

}
