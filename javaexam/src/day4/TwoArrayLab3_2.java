package day4;

public class TwoArrayLab3_2 {
	public static void main(String[] args) {
		char play[][] = { { 'X', 'X', 'X', 'R', 'X', 'R' }
						  , { 'R', 'X', 'X', 'X', 'X', 'X' }
						  , { 'X', 'X', 'R', 'X', 'X', 'X' }
						  , { 'R', 'X', 'X', 'F', 'X', 'X' }
						  , { 'X', 'R', 'X', 'X', 'X', 'X' }
						   ,{ 'X', 'R', 'X', 'R', 'X', 'R' } };

		int catchNum = 0;
		/*
		 * R�� �䳢�̰� F�� ����� ������ ��ġ�� ������ �ְ� ������ ��ġ���� �밢���� �������θ� �̵� �����ϴ�. ���� ���� 2���� �迭 �����Ϳ���
		 * �䳢�� ��� ��ڴ°�?
		 */
		int fPosi = 0;
		int fPosj = 0;

		for (int i = 0; i < play.length; i++) {
			for (int j = 0; j < play[i].length; j++) {
				if (play[i][j] == 'F') {
					fPosi = i + 1;
					fPosj = j + 1;
				}
			}
		}

		for (int i = 0; i < play.length; i++) {
			for (int j = 0; j < play[i].length; j++) {
				if ((i == fPosi-1 || j == fPosj-1 || 
					fPosi - fPosj == i-j || fPosi + fPosj -2 == i+j)
						&& play[i][j] == 'R')
					catchNum++;
			}
		}
		// ����

		System.out.println("������ ��ġ : (" + fPosi + "," + fPosj + ")");

		// ����

		System.out.printf("����� �䳢�� %d ���� ��´�.", catchNum);
	}
}
