package mobile;


public class MobileTest {
	public static void main(String[] args) {
		Ltab tab1 = new Ltab("Ltab",500,"ABC-01");
		Otab tab2 = new Otab("Otab",1000,"XYZ-20");
		//�ʱⰪ���
		printTitle();
		printMobile(tab1);
		printMobile(tab2);
		//10�� ���� �� ���
		System.out.println("\n[10�� ����]");
		tab1.charge(10);
		tab2.charge(10);
		printTitle();
		printMobile(tab1);
		printMobile(tab2);
		//10�� ���� �� ���
		System.out.println("\n[5�� ��ȭ]");
		tab1.operate(5);
		tab2.operate(5);
		printTitle();
		printMobile(tab1);
		printMobile(tab2);
		
	}
	public static void printTitle() {
		System.out.println("Mobile"+"\t"+"Battery"+"\t"+"os");
		System.out.println("--------------------------");
	}
	public static void printMobile(Mobile mobile) {
		System.out.println(mobile.getMobileName()+"\t"+mobile.getBatterySize()+"\t"+mobile.getOsType());
	}

}
