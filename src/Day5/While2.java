package Day5;

public class While2 {

	public static void main(String[] args) {
		// while���� continue�� �̿��� ¦�� ��� ����
				int i = 1, num = 10;
				while(i <= num) {
					if(i % 2 != 0) {
						i += 1;
						continue;
					}
					System.out.print(i + " ");
					i += 1;
				}
				System.out.println();
				i = 0;
				while(++i <= num) {
					if(i % 2 != 0) {
						continue;
					}
					System.out.print(i + " ");
				}
			}

		}


