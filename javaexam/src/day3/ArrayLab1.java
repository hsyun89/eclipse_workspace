package day3;

public class ArrayLab1 {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = new int[10];

		System.out.print("��� ������ �� : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] =(int) (Math.random() * 17) + 4; // 4~20����
			sum += arr[i];
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ",");
		}
		System.out.print("\n��� ������ �� : " + sum);
	}

}
