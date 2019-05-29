package day6;

class Book {
	String title;
	String author;
	int price;
	//������
	Book() {
		//this()�� ���� Ŭ������ �ִ� �ٸ� �����ڸ� �Ű������� �°� ȣ��, #ù ��° �����̾�� ��.
		this("�ڹ��� ����", "���ü�", 30000);
		System.out.println("�ڹ��� ���� ��ü ����!!");

//		title="�ڹ��� ����";
//		author="���ü�";
//		price=30000;
	}
	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	String getBookInfo() {
		return "å�̸�\t" + title + "\t����\t" + author + "\t����\t" + price;
	}
}

public class BookTest {
	public static void main(String[] args) {
		Book bookArr[] = new Book[5];
		bookArr[0] = new Book("a", "b", 100);
		bookArr[1] = new Book("c", "d", 200);
		bookArr[2] = new Book("e", "f", 300);
		bookArr[3] = new Book("g", "h", 400);
		bookArr[4] = new Book();
//		b[4].title = "�ڹ��� ����";
//		b[4].author = "���ü�";
//		b[4].price = 30000;

//		for (int i = 0; i < bookArr.length; i++)
//			System.out.println(bookArr[i].getBookInfo());
		for(Book data : bookArr) {
			System.out.println(data.getBookInfo());
		}

	}

}
