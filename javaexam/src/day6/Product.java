package day6;

import java.io.Serializable;

public class Product implements Serializable {
	private String name;
	private int balance;
	private transient int price;  // ����ȭ�� �����ض�

	// ��ǰ�� �°�
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// ��� �°�
	public void setBalance(int balance) {
		if (balance < 0)
			return;
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	// ���� �°�
	public void setPrice(int price) {
		if (price < 0)
			return;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	// ������ ����
//	Product() {
//		name = "��ũ����";
//		balance = 5;
//		price = 10000;
//	}
	public Product() {
		this("��ũ����", 5, 10000);
	}

	// �ټ� �ڵ� ���� �ҽ�-�ټ�
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getBalance() {
//		return balance;
//	}
//
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}

	public Product(String name, int balance, int price) {
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
}