package day3;

public class ArrayTest5 {

	public static void main(String[] args) {
		int su = (int) (Math.random() * 6) + 5;
		int[] ary = new int[su];
		System.out.println("�迭�� ũ��: " + ary.length);
		for (int i = 0; i < ary.length; i++) {
			ary[i] = (int) (Math.random() * 45) + 1;
		}
		for (int data : ary)
			System.out.print(data + " ");
		// �ִ� : �ִ� = 00
		int max = ary[0];
		for (int data : ary) {
			if(max<data)
				max=data;
		}
		System.out.print("\n�ִ� = "+max);
		
	}

}
