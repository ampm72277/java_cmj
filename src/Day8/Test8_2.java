package Day8;

public class Test8_2 {

	public static void main(String[] args) {
		/* ������ ���� ��µǵ��� �ۼ��ϼ���.
		 * a
		 * ab
		 * abc
		 * abcd
		 * abcde
		 * ...
		 * abcdefg...xyz
		 * 
		 * abcd ...xyz ������
		 * *
		 * **
		 * ***
		 * **** ������ ȥ��
		 * */
		for(char i = 'a'; i <= 'z'; i += 1) {
			for(char k = 'a'; k <= i ; k += 1) {
				System.out.print(k);
			}
			System.out.println();
		}
		String str = "";
		for(char i = 'a'; i <= 'z'; i +=1) {
			str += i;
			System.out.println(str);
		}

	}

}
