package day9.test1;

public class SaleTV extends TV {
	private int price;
	
	public SaleTV(){
		
	}
	public SaleTV(int price, String model, int size,int channel){
		super(model, size, channel);
		this.price=price;
	}
	
	public void play() {
		System.out.println("�Ǹ� TV ä�� "+getChannel()+"���� ���θ� �÷��� �մϴ�.");
	}
//	public void sale() {
//		System.out.println(getModel()+" ���� ��ǰ�� �뿩�մϴ�."+price+ " �� ������ �ּ���.");
//	}
	public void sale() {
	System.out.printf("%s ���� ��ǰ�� �Ǹ��մϴ�. %,d �� ������ �ּ���.\n",getModel(),price);
}
	public String toString() {
		return String.format("�ǸŻ�ǰ���� : �𵨸�(%s), ����(%,d��), ũ��(%d)",getModel(),price,getSize());
	}
}
