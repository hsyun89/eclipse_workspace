package day6;

import java.util.Scanner;

public class ScannerLab1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = 0;
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		String snum1 = sc.nextLine();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		String snum2 = sc.nextLine();
		System.out.print("������(+, -, *, /)�� �Է��ϼ��� :  ");
		String cal = sc.nextLine();
		sc.close();
		
		int num1=Integer.parseInt(snum1);
		int num2=Integer.parseInt(snum2);

		switch (cal) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		}
		System.out.printf("%d�� %d�� %s���� ����� %d�Դϴ� ", num1, num2, cal, result);

	}

}
