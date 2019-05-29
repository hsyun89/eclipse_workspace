package work;

public class PlaneTest {

	public static void main(String[] args) {
		// �Է�, ���� ������ ��ü�� �迭�� �ٷ��
		Plane list[] = new Plane[2];
		list[0] = new Airplane("L747", 1000);
		list[1] = new Cargoplane("C40", 1000);

		// �ʱⰪ ���
		printInfo(list);

		// 100����
		System.out.println("\n[100����]");
		for (int i = 0; i < list.length; i++) {
			list[i].flight(100);
		}
		printInfo(list);

		// 200����
		System.out.println("\n[200����]");
		for (int i = 0; i < list.length; i++) {
			list[i].reFuel(200);
		}
		printInfo(list);

	}
	//�迭 ��� �޼���
	public static void printInfo(Plane[] list) {
		System.out.println("Plane" + "\t" + "fuelSize");
		System.out.println("-----------------");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i].getPlaneName() + "\t");
			System.out.println(list[i].getFuelSize());
		}
	}
}
