package work;

public abstract class Plane {
	private String planeName;
	private int fuelSize;

	// ������
	Plane() {
	}

	Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	// ���ͼ���
	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize += fuelSize;
	}

	// ��������
	public void reFuel(int fuel) {
		fuelSize += fuel;
	}

	// �۽�Ʈ��Ʈ
	public abstract void flight(int distance);

}
