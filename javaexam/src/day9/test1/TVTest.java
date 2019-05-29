package day9.test1;

public class TVTest {

	public static void main(String[] args) {
		// �ʱⰪ
		SaleTV tv1 = new SaleTV(300000, "SALETV-1", 40, 1);
		RentalTV tv2 = new RentalTV(100000, "RENTALTV-1", 42, 1);
		// ä�ξ�
		tv1.channelUp();
		tv1.channelUp();
		// ä�� �ٿ�
		tv2.channelDown();
		tv2.channelDown();
		tv2.channelDown();
		
//		tv1.play();
//		tv1.sale();
//		System.out.println(tv1.toString());
		
		printAllTV(tv1);
		printAllTV(tv2);
		printRentalTV(tv2);
	}
	static void printAllTV(TV tv) {
		if(tv instanceof SaleTV) {  //�����ڽ� or ��Ż�ڽ� �Ǻ�
			System.out.println(tv.toString());
			((SaleTV) tv).play(); //�θ𿡴� ���°� ��� ���� ����ȯ�� �ʿ���
			((SaleTV) tv).sale();
		}
		else {
			System.out.println(tv.toString());
			((RentalTV) tv).play();
		}
	}
	static void printRentalTV(Rentable tv) {
		tv.rent();
	}
}

