package day6;

import java.util.Scanner;

public class ScannerLab1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = 0;
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		System.out.print("������(+, -, *, /)�� �Է��ϼ��� :  ");
		String cal = sc.next();
		sc.close();

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
