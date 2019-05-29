package emp;

public class Sales extends Employee implements Bonus{
	public Sales() {
		
	}
	public Sales(String name, int number, String department, int salary) {
		super(name,number,department,salary);
	}
	//�������̵�
	public double tax() {
		return getSalary()*0.13;
	}
	@Override
	public void incentive(int pay) {
		setSalary((int)(getSalary()+1.2*pay));
	}
	//�߰�����
	public double getExtraPay() {
		return 0.03*getSalary();
	}
}
