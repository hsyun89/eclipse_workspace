package day6;


//�����Լ�
public class ProductTeset {
	public static void main(String[] args) {
		Product proArr[] = new Product[5];
		proArr[0] = new Product("apple", 5, 2000);
		proArr[1] = new Product("banana", 10, 3000);
		proArr[2] = new Product("kiwi", 15, 4000);
		proArr[3] = new Product("cherry", 6, 5000);
		proArr[4] = new Product();

//		for(int i=0;i<proArr.length;i++) {
//			System.out.println("��ǰ��\t"+proArr[i].getName()+"\t���\t"
//		+proArr[i].getBalance()+"\t����\t" + proArr[i].getPrice());
//		}

		// Ʈ����ų� �� ���
//		for(int i=0;i<proArr.length;i++) {
//			System.out.printf("��ǰ��\t%s\t���\t%d\t����\t%,d��\n",
//					proArr[i].getName(),proArr[i].getBalance(),proArr[i].getPrice());
//		}

		// �����Ʈ �� ���
		for (Product data : proArr) {
			System.out.printf("%s \t %d \t %,d��\n", data.getName(), data.getBalance(), data.getPrice());
		}

	}

}
