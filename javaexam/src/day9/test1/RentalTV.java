package day9.test1;

public class RentalTV extends TV implements Rentable {
	private int price;
	
	public RentalTV(){
		
	}
	public RentalTV(int price, String model, int size,int channel){
		super(model, size, channel);
		this.price=price;
	}
	public void play() {
		System.out.println("�뿩 TV ä�� "+getChannel()+"���� ���θ� �÷��� �մϴ�.");
	}
	public void rent() {
		System.out.printf("%s ���� ��ǰ�� �뿩�մϴ�. %,d �� ������ �ּ���.\n",getModel(),price);
	}
	public String toString() {
		return String.format("�뿩��ǰ���� : �𵨸�(%s), ����(%,d��), ũ��(%d)",getModel(),price,getSize());
	}
}

