package day5;

public class MethodTest5 {

	public static void main(String[] args) {
		int result = operate(10, 20);
		System.out.println("ȣ�� �����1 : " + result);
		System.out.println("ȣ�� �����2 : " + operate(100, 200));
		result = operate(11, 22) + 100;
		System.out.println("ȣ�� �����3 : " + result);
		System.out.println(getMyName());
		System.out.println(getMyName('@'));
		//System.out.println(getMyName('$','#'));
	}

	static int operate(int num1, int num2) {
		return num1 + num2;
	}
	//****�޼��� �����ε�**** 
	static String getMyName() {
		return "*������*";
	}
	static String getMyName(char deco) {
		return deco + "��ũ" + deco;
	}
}
