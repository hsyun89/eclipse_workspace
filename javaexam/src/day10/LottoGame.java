package day10;

import java.util.Random;

class DuplicateException extends Exception {
	DuplicateException() {
		super("�ߺ��� �ζ� ��ȣ�� �߻��߽��ϴ�.");
	}
}

class LottoMachine {
	private int[] nums;

	public LottoMachine() {
		nums = new int[6];
	}

	public void createLottoNums() {
		Random rand = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rand.nextInt(20) + 1;
		}
	}

	public void checkLottoNums() /*throws DuplicateException*/{
		try {
			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[i] == nums[j]) {
						throw new DuplicateException();
					}
				}
			}
		} catch (DuplicateException e) {
			System.out.println("���� �߻� : " + e.getMessage());
			System.exit(-1);
//			e.printStackTrace();
		}
	}

	public int[] getNums() {
		return nums;
	}
}

public class LottoGame {
	public static void main(String[] args) {
		LottoMachine lotto1 = new LottoMachine();
		lotto1.createLottoNums();
		lotto1.checkLottoNums();
		// �ζ���� ���ڽ���Ʈ��
//		for(int data:lotto1.getNums()) {
//			System.out.print(data+"\t");
//		}
		// �ζ� ��� Ʈ����ų���
//		for (int i = 0; i < lotto1.getNums().length; i++) {
//			if (i == 0)
//				System.out.print(lotto1.getNums()[i]);
//			else
//				System.out.print(", " + lotto1.getNums()[i]);
//		}
		//��� �� ���� ����
		int[] arr1=lotto1.getNums();
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0)
				System.out.print(arr1[i]);
			else
				System.out.print(", " + arr1[i]);
		}

	}

}
