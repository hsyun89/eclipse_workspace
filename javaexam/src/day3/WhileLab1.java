package day3;

public class WhileLab1 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 5;

//		for��
		System.out.println("[for ���]");
		for (int i = 1; i <= num; i++)
			System.out.println(i + " -> " + i * i);

//		while��
		System.out.println("[while ���]");
		int k = 1;
		while (k <= num) {
			System.out.println(k + " -> " + k * k);
			k++;
		}
	}
}
