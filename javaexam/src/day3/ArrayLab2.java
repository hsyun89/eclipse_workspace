package day3;

public class ArrayLab2 {

	public static void main(String[] args) {
		char[] arr = new char[] { 'J', 'a', 'v', 'a' };// �Է�
		for (int i = 0; i < arr.length; i++) {
			if ('A' <= arr[i] && arr[i] <= 'Z')// �빮���� ���
				arr[i] = (char) (arr[i] + 32);
			else// �ҹ����� ���
				arr[i] = (char) (arr[i] - 32);
		}
		System.out.print("��ȯ�� �迭 : ");// ���
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ",");
		}
	}

}
