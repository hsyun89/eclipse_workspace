package emp;

public class Company {

	public static void main(String[] args) {
		Employee[] emp = new Employee[2];
		emp[0] = new Secretary("Duke", 1, "secretary", 800);
		emp[1] = new Sales("Tuxi", 2, "sales", 1200);
		printEmployee(emp, false); // ���� ���� ���

		// �μ��� ���� �μ�Ƽ�� ����
		for (int i = 0; i < emp.length; i++) {
//			if (emp[i] instanceof Sales)
//				((Sales) emp[i]).incentive(100);
//			else
//				((Secretary) emp[i]).incentive(100);
			((Bonus) emp[i]).incentive(100);  //�������̽��� ����ϸ� �� ���ϴ�!!
		}
		// �μ�Ƽ�� ����
		System.out.println("\n[�μ�Ƽ��100����]");

		// �������� ���
		printEmployee(emp, true);
	}

	public static void printEmployee(Employee[] emp, boolean isTax) {
		//���� �޴¹���
		if (isTax == true) {
			System.out.println("name\tdepartment\tsalary\ttax\textra pay\t");
			System.out.println("-----------------------------------------------");
			for (int i = 0; i < emp.length; i++) {
				System.out.print(emp[i].getName() + "\t");
				System.out.print(emp[i].getDepartment() + "\t");
				// �ٸ��߱�
				if (emp[i] instanceof Sales) {
					System.out.print("\t");
				}
				// �ٸ��߱�
				System.out.print(emp[i].getSalary() + "\t");
				System.out.print(emp[i].tax() + "\t");
				if (emp[i] instanceof Sales) {
					System.out.println(((Sales) emp[i]).getExtraPay());
				} else
					System.out.println();
			}
			//���� ���¹���
		} else {
			System.out.println("name\tdepartment\tsalary\textra pay\t");
			System.out.println("-----------------------------------------");
			for (int i = 0; i < emp.length; i++) {
				System.out.print(emp[i].getName() + "\t");
				System.out.print(emp[i].getDepartment() + "\t");
				// �ٸ��߱�
				if (emp[i] instanceof Sales) {
					System.out.print("\t");
				}
				// �ٸ��߱�
				System.out.print(emp[i].getSalary() + "\t");
				if (emp[i] instanceof Sales) {
					System.out.println(((Sales) emp[i]).getExtraPay());
				} else
					System.out.println();
			}
		}

	}

}
