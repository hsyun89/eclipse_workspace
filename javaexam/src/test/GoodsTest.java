package test;

public class GoodsTest {
	public static void main(String[] args) {
		// "PRD-0001", "��ũ��ǻ��", 10000, 'N' ���� ��ü ����
		Goods prd1 = new Goods("PRD-0001", "��ũ��ǻ��", 10000, 'N');
		// "PRD-0002", "�ν���ǻ��", 20000 ���� ��ü ����
		Goods prd2 = new Goods("PRD-0002", "�ν���ǻ��", 20000);
		// ������ ��ü ���� getGoodsInfo()�� ȣ���ϰ� ���ϰ���� ����մϴ�.
		System.out.println(prd1.getGoodsInfo());
		System.out.println(prd2.getGoodsInfo());
	}
}
