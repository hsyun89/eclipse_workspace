package day2;

public class WhileTest3 {

	public static void main(String[] args) {
//		System.out.println("main() ���� ����");
		System.out.printf("main() ���� ����\n");
		char munja = '��';
		while(munja<'��') {
//			System.out.println(munja);
//			System.out.printf("%c\n", munja);
			System.out.printf("%c  %d  %#x\n",munja, (int)munja, (int)munja);
			munja++;
		}
//		System.out.println("main() ���� ����");
		System.out.printf("main() ���� ����\n");
	}
}
