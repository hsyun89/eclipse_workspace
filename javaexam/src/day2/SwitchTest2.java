package day2;

public class SwitchTest2 {
	public static void main(String[] args){
		int grade = (int)(Math.random()*6)+1;
		System.out.println("����� �� =" + grade);
		switch(grade) {
		case 1 : 
		case 2 : 
		case 3 : System.out.println(grade+"�г��� ���г�");
			break;
		default : System.out.println(grade+"�г��� ���г�");
		}
	}
}
