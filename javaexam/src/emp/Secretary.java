package emp;

public class Secretary extends Employee implements Bonus {
	public Secretary() {
		
	}
	public Secretary(String name, int number, String department, int salary) {
		super(name,number,department,salary);
	}
	//�������̵�
	public double tax() {
		return getSalary()*0.1;
	}
	@Override
	public void incentive(int pay) {
		setSalary((int)(getSalary()+0.8*pay));
	}
}
