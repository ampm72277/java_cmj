package Day2;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/* ����, ����, ���� ������ �Է¹޾� ����غ�����.
		 * ��, ������ 0~100�� ������ �Ǽ�*/
		
		double kor, eng, math;
		System.out.println("����, ����, ���� ������ �Է��ϼ��� :  ");
		Scanner scan = new Scanner(System.in);
		
		kor = scan.nextDouble();
		eng = scan.nextDouble();
		math = scan.nextDouble();
		
		System.out.println("���� : " + kor + "��");
		System.out.println("���� : " + math + "��");
		System.out.println("���� : " + eng + "��");
		
		scan.close();
		
		
	

	}

}
