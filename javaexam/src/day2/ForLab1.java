package day2;

public class ForLab1 {
	public static void main(String[] args) {
		int evenNum = 0;
		int oddNum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				oddNum += i;
			else
				evenNum += i;
		}
		System.out.println("1���� 100������ ���ڵ� �߿���");
		System.out.println("¦���� ����" + evenNum +" �̰�\n" + "Ȧ���� ����" + oddNum+" �̴�.");
	}
}
