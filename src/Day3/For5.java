package Day3;

public class For5 {

	public static void main(String[] args) {
		/* 1���� 5������ ���� ���ϴ� ����
		 * �ݺ�Ƚ�� : i�� 1���� 5���� 1������ 
		 * ��Ģ�� : sum = sum + i�� ����( sum += i)
		 * 		sum = 0
		 * i=1	sum = sum + 1
		 * i=2	sum = sum + 2
		 * i=3	sum = sum + 3
		 * i=4	sum = sum + 4
		 * i=5	sum = sum + 5
		 * */
		int i, sum=0;
		for(i=1; i<=5; i+=1) {
			sum += i;
			System.out.println(sum);
			
		}

	}

}
