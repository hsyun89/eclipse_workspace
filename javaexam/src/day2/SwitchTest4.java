package day2;
public class SwitchTest4 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*101); //0~100
		int devideScore = score/10;
		char grade =' ';
		
		// if���� ����Ͽ�
		// 90~100 - "xx���� A���"
		// 80~89 - "xx���� B���"
		// 70~79 - "xx���� C���"
		// 60~69 - "xx���� D���"
		// 0~59 - "xx���� F���" 
		
		switch(devideScore) {
		case 9: case 10:
			grade='A';break;
		case 8:
			grade='B';break;
		case 7:
			grade='C';break;
		case 6:
			grade='D';break;
		default:
			grade='F';
		}
		System.out.println(score + "����" +grade+"���");
	}
}
