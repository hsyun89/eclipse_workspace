package day7;

class SalaryExpr {
	private int bonus;

	public int getSalary(int grade) {
		if (grade == 1) {
			return bonus + 100;
		} else if (grade == 2) {
			return bonus + 90;
		} else if (grade == 3) {
			return bonus + 80;
		} else {
			return bonus + 70;
		}
	}

	SalaryExpr() {
		bonus = 0;//0�� �ȳ־ ȣ��� �ڵ����� 0���� �ʱ�ȭ��
	}
	SalaryExpr(int bonus) {
		this.bonus = bonus;
	}
}

public class SalaryExam {
	public static void main(String[] args) {
		int month = day5.MethodLab3.getRandom(1, 12);
		int grade = day5.MethodLab3.getRandom(1, 4);
		SalaryExpr se1=null;
		if (month % 2 == 0) {
			se1 = new SalaryExpr(100);
		} else {
			se1 = new SalaryExpr();
		}
		System.out.printf("%d �� %d ����� ������ %d �Դϴ�.", month, grade, se1.getSalary(grade));
	}
}
