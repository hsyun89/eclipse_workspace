package day4;

public class LottoMachine1 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		int check = 0;

		for (int i = 0; true; i++) {
			int rNum = (int) (Math.random() * 45) + 1; // 1~45����
			check = 0; // üũ���� �ʱ�ȭ
			for (int j = 0; j < i; j++) {
				if (arr[j] == rNum) {
					check += 1; // ��ġ�� ��� üũ�� +1
					i--;
				}
			}
			if (check == 0) { // üũ�� 0�̶�� �迭�� ����, �ƴϸ� ����
				arr[i] = rNum;
			}
			if (arr[5] != 0) // 6�� ������ ���� ������
				break;
		}
		System.out.print("������ �ζ� ��ȣ - ");
		for (int i = 0; i < arr.length; i++) { // ��ǥ ��±�
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ", ");
		}
	}
}
