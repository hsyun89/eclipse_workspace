package day8;

import java.util.Date;

import day5.MethodLab3; //��Ʈ��+����Ʈ+O �ڵ� ����Ʈ

//import day5.MethodLab3;
//import java.*;
//�θ�Ŭ����
class Multiplication {
	private int dan;
	private int number;

	Multiplication() {
	}

	Multiplication(int dan) {
		this.dan = dan;
	}

	Multiplication(int dan, int number) {
		this.dan = dan;
		this.number = number;
	}

	void printPart() {
		if (number == 0) {
			for (int n = 1; n <= 9; n++)
				System.out.print("\t" + dan + "*" + n + "=" + dan * n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}

//�ڽ� Ŭ����
class GuGuDanExpr extends Multiplication {
	GuGuDanExpr() {
	}

	GuGuDanExpr(int dan) {
		super(dan);
	}

	GuGuDanExpr(int dan, int number) {
		super(dan, number);
	}

	void printPart() {
		super.printPart();
	}

	public static void printAll() {
		for (int n = 1; n <= 9; n++) {
			for (int k = 1; k <= 9; k++) {
				System.out.print("\t" + k + "*" + k + "=" + k * n);
			}
			System.out.println();
		}
	}
}

//���� Ŭ����
public class GuGuDan {
	public static void main(String[] args) {
		int dan = MethodLab3.getRandom(1, 20); //import���
		int number = day5.MethodLab3.getRandom(1, 20); //�׳� �θ���

		GuGuDanExpr gugu = null;
		// 1�����
		if (dan < 10 && number < 10) {
			gugu = new GuGuDanExpr(dan, number);
			System.out.print(dan + " * " + number + " = ");
			gugu.printPart();
		}
		// 2�����
		else if (dan < 10 && number > 9) {
			gugu = new GuGuDanExpr(dan);
			System.out.print(dan + " �� : ");
			gugu.printPart();
		}
		// 3�����
		else {
//			GuGuDanExpr gugu=new GuGuDanExpr(dan);
			GuGuDanExpr.printAll(); // static
		}
		Date d = new Date();
		System.out.println("������ "+d.getDate()+"���Դϴ�.");
		System.out.println("������ "+d+"���Դϴ�.");
		System.out.println("������ "+d.getTime()+"���Դϴ�.");
	}
}
