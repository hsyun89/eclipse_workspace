package day3;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] ary = new int[8];
		int sum = 0;
		for (int data : ary)
			sum += data; // sum = sum + data;
		System.out.println("sum" + sum);

//		ary[0] = 11;
//		ary[1] = 12;
//		ary[2] = 13;
//		ary[3] = 14;
//		ary[4] = 15;

		for (int i = 0; i < ary.length; i++)
			ary[i] = 11 + i;

		for (int data : ary)
			sum += data; // sum = sum + data;
		System.out.println("sum" + sum);

//ary �迭�� �� ���Ұ��� ���� �� ��� �����Ѵ�.
//		for (int i = 0; i < ary.length; i++)
//			ary[i] = ary[i] * 2;
//		for (int i = 0; i < ary.length - 1; i++) {
//			System.out.print(ary[i] + ", ");
//		}
//		System.out.print(ary[ary.length - 1]);
//��� ���Ұ��� ����Ѵ�. ex) x, x, x, x, x

		for (int i = 0; i < ary.length; i++) {
			ary[i] *= 2;
			if (i == ary.length - 1)
				System.out.print(ary[i]);
			else
				System.out.print(ary[i] + ", ");
		}

	}

}
