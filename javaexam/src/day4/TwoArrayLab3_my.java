package day4;

public class TwoArrayLab3_my {
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
		/*
		 * R�� �䳢�̰� F�� �����
		 * ������ ��ġ�� ������ �ְ� 
		 * ������ ��ġ���� �밢���� �������θ� �̵� �����ϴ�. 
		 * ���� ���� 2���� �迭 �����Ϳ���
		 * �䳢�� ��� ��ڴ°�?
		 */
		int fPosi = 0;
		int fPosj = 0;
		//������ġ �ǵ���
		HSY: for(int i =0; i<play.length;i++) {
			for(int j =0; j<play[i].length;j++) {
				if(play[i][j]=='F') {
					fPosi=i;
					fPosj=j;
					break HSY;
				}
			}
		}
		//���� �ǵ���
		for(int i=0;i<play[fPosi].length;i++) {
			if(play[fPosi][i]=='R')
				catchNum+=1;
		}
		//���� �ǵ���
		for(int i=0;i<play.length;i++) {
			if(play[i][fPosj]=='R')
				catchNum+=1;
		}
		//������ �ǵ�
		for(int i=1; true ;i++) {
		if(play[fPosi+i][fPosj+i]=='R') {
			catchNum+=1;
		}
		if(fPosi+i==5 || fPosj+i==5) {
			break;
		}
		}
		//����� �ǵ�
		for(int i=1; true ;i++) {
		if(play[fPosi-i][fPosj+i]=='R') {
			catchNum+=1;
		}
		if(fPosi-i==0 || fPosj+i==5) {
			break;
		}
		}
		//�»��� �ǵ�
		for(int i=1; true ;i++) {
		if(play[fPosi-i][fPosj-i]=='R') {
			catchNum+=1;
		}
		if(fPosi-i==0 || fPosj-i==0) {
			break;
		}
		}
		//������ �ǵ�
		for(int i=1; true ;i++) {
		if(play[fPosi+i][fPosj-i]=='R') {
			catchNum+=1;
		}
		if(fPosi+i==5 || fPosj-i==0) {
			break;
		}
		}
		
		
//		System.out.println(fPosj[3][3]);
		
		System.out.println("������ ��ġ : (" + fPosi + "," + fPosj+")");
		
		// ����	
		
		System.out.printf("����� �䳢�� %d ���� ��´�.", catchNum);		
	}
}


