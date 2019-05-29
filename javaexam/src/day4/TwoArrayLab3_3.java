package day4;

public class TwoArrayLab3_3{

	public static void main(String[] args) {
		char play[][] = { 
				{ 'X', 'X', 'X', 'R', 'X', 'R'},
				{ 'R', 'X', 'X', 'X', 'X', 'X'},
				{ 'X', 'X', 'R', 'X', 'X', 'X'},
				{ 'R', 'X', 'X', 'F', 'X', 'X'},
				{ 'X', 'R', 'X', 'X', 'X', 'X'},
				{ 'X', 'R', 'X', 'R', 'X', 'R'},
				};
		
		int catchNum = 0;
		int fPosi = 0;
		int fPosj = 0;
		int len = play.length;
		
		// ������ ��ġ 
		label: for(int i = 0 ; i < len ; i++) {
			for(int j = 0 ; j < play[i].length ; j++) {
				if(play[i][j] == 'F') {
					fPosi = i + 1;
					fPosj = j + 1;
					break label;
				}
			}
		}
		 
		System.out.println("������ ��ġ : (" + fPosi + "," + fPosj+")");
		
		// �� �Ʒ�
		for(char[] i : play) {
			if(i[fPosj-1] == 'R') {
				catchNum++;
			}
		}
		
		// �� ��
		for(char i : play[fPosi-1]) {
			if(i == 'R') {
				catchNum++;
			}
		}
		
		// ������ �밢��
		for(int i = fPosi ; i < len ; i++) {
			if(play[i][len-i] == 'R' || play[len-i][i] == 'R') {
				catchNum++;
			}
		}
		
		// ���� �밢��
		for(int i = 0 ; i < len ; i++) {
			if(play[i][i] == 'R') {
				catchNum++;
			}
		}
		
		System.out.printf("����� �䳢�� %d ���� ��´�.", catchNum);		
	}
}


