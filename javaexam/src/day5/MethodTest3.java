package day5;

public class MethodTest3 {

	public static void main(String[] args) {
		System.out.println("main() �������");
		printMyName(1,'*');
		System.out.println(1);
		printMyName(2,'@');
		System.out.println(2);
		printMyName(3,'#');
		System.out.println(3);
		System.out.println("main() ��������");
	}

	static void printMyName(int num, char deco) {
		for (int i = 1; i <= num; i++)
			System.out.println(deco + "������"+deco);
	}

}
