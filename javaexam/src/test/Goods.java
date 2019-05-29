package test;

public class Goods {
	String prodId; // ��ǰ ���̵�
	String prodName; // ��ǰ �̸�
	int price; // ��ǰ ����
	char asYn; // AS ���� ����

	// ������ �� ���� �����Ͻÿ�.
	public Goods(String prodId, String prodName, int price) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}

	public Goods(String prodId, String prodName, int price, char asYn) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.asYn = asYn;
	}

	// getGoodsInfo() �޼��带 �����Ͻÿ�.
	public String getGoodsInfo() {
		String info;
		if (asYn == 'N') {
			info = ("��ǰID: " + prodId + ", ��ǰ��: " + prodName + ", ����: " + price + ", AS���ɿ��� : �Ұ�");
		} else {
			info = ("��ǰID: " + prodId + ", ��ǰ��: " + prodName + ", ����: " + price + ", AS���ɿ��� : ����");
		}
		return info;
	}

}
