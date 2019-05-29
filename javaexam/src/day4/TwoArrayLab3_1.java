package day4;

public class TwoArrayLab3_1 {

	public static void main(String[] args) {
		char play[][] = { { 'X', 'X', 'X', 'R', 'X', 'R' }, { 'R', 'X', 'X', 'X', 'X', 'X' },
				{ 'X', 'X', 'R', 'X', 'X', 'X' }, { 'R', 'X', 'X', 'F', 'X', 'X' }, { 'X', 'R', 'X', 'X', 'X', 'X' },
				{ 'X', 'R', 'X', 'R', 'X', 'R' } };

		int catchNum = 0;
		/*
		 * R�� �䳢�̰� F�� ����� ������ ��ġ�� ������ �ְ� ������ ��ġ���� �밢���� �������θ� �̵� �����ϴ�. ���� ���� 2���� �迭 �����Ϳ���
		 * �䳢�� ��� ��ڴ°�?
		 */
		int fPosi = 0;
		int fPosj = 0;

		// ����
		// ������ ��ġ�� ���ϴ� ��
		find: for (int i = 0; i < play.length; i++) {
			for (int j = 0; j < play[i].length; j++) {
				if (play[i][j] == 'F') {
					fPosi = i;
					fPosj = j;
					break find;
				}
			}			
		}

		System.out.println("������ ��ġ : (" + fPosi + "," + fPosj + ")");

		for (int i = 0; i < play[fPosi].length; i++) {
			if (play[fPosi][i] == 'R')
				catchNum++;
		} // ���η� ���

		for (int i = 0; i < play.length; i++) {
			if (play[i][fPosj] == 'R')
				catchNum++;
		} // ���η� ���

		//int i = fPosi;
		//int j = fPosj;

		for (int i = fPosi, j = fPosj;
			i < play.length && j < play[i].length; i++,j++) {
			if (play[i][j] == 'R')
				catchNum++;			
		} // ���ʴ밢�� �Ʒ���������

		int i = fPosi;
		int j = fPosj;

		while (i > -1 && j > -1) {
			if (play[i][j] == 'R')
				catchNum++;
			i--;
			j--;
		} // ���ʴ밢�� �� ��������

		i = fPosi;
		j = fPosj;

		while (i < play.length || j > 0) {
			if (play[i][j] == 'R')
				catchNum++;
			i++;
			j--;
		} // �����ʴ밢�� �Ʒ���������

		i = fPosi;
		j = fPosj;

		while (i > 0 || j < play.length) {
			if (play[i][j] == 'R')
				catchNum++;
			i--;
			j++;
		} // �����ʴ밢�� ����������
		System.out.printf("����� �䳢�� %d ���� ��´�.", catchNum);
	}
}
