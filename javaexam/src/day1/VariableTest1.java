package day1;
public class VariableTest1 {
	public static void main(String[] args) {
		System.out.println(100);
		int num=1000; //���� ����
		System.out.println("���� ��: "+num);
		num=10+20;
		System.out.println("���� ��: "+num);
		char munja = 'A';
		System.out.print(munja);
		munja++;
		System.out.print(munja);
		munja+=1;
		System.out.print(munja);
		munja = (char)(munja+1); //munja = munja + 1
		System.out.println(munja);
	}
}
