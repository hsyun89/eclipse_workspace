package day1;
public class IfTest4 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*101); //0~100
		char grade;

		// if���� ����Ͽ�
		// 90~100 - "xx���� A���"
		// 80~89 - "xx���� B���"
		// 70~79 - "xx���� C���"
		// 60~69 - "xx���� D���"
		// 0~59 - "xx���� F���"
		
		if(score>=90)
			grade = 'A';
		else if(score>=80)
			grade = 'B';
		else if(score>=70)
			grade = 'C';
		else if(score>=60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println(score + "����" +grade+"���");
	}
}
