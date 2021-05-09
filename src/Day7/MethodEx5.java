package Day7;

public class MethodEx5 {

	public static void main(String[] args) {
		printChar1('*', 5);
		printChar1('*', 8);
		printChar1('-', 5);
		System.out.println(printChar2('*', 5));
		System.out.println(printChar2('*', 3) + printChar2('-', 2));
	}
	/* ��� 		: �־��� ����(ch)�� �־��� ������(count) �ݺ��Ͽ� ����ϴ� �޼ҵ�
	 * �Ű�����	: ����, ������(Ƚ��) => char ch, int count
	 * ����Ÿ�� 	: ���� => void
	 * �޼ҵ�� 	: printChar1
	 */
	
	
	
	public static void printChar1(char ch, int count) {
		for(int i=0; i<count; i+=1) {
			System.out.print(ch);
		}
		System.out.println();
	}

/* ��� : ch�� �־��� ������count �ݺ��Ͽ� �ϳ��� ���ڿ��� �˷��ִ� �޼ҵ�
 * �Ű�����: ����, Ƚ�� => char ch, int count
 * ����Ÿ�� : ���ڿ� => String
 * �޼ҵ�� : printChar2
 */
	public static String printChar2(char ch, int count) {
		String str = "";
		for(int i =0; i<count; i+=1) {
			str = str + ch;
		}
		return str;
	}
	}	