package day6;

class Student2 {
	String name;
	String project;
	int age;

	void study() {
		System.out.println(name + " �л��� " + project + " �� �н��մϴ�.");
	}

	String getStudentInfo() {
		return "�̸�" +name+ "����"+age;  //printf������ ���ϰ��� �������� �ȵǴµ�!
	}
	}

public class StudentTest_1 {
	public static void main(String[] args) {
		Student2 st1 = new Student2();
		st1.name="�Ѹ�";
		st1.project="����";
		st1.age=10;
		st1.study();
		System.out.println(st1.getStudentInfo());
		Student2 st2 = new Student2();
		st2.name="��ũ";
		st2.project="����";
		st2.age=24;
		st2.study();
		System.out.println(st2.getStudentInfo());
		System.out.println(st1);
		System.out.println(st2);
		st1=st2;
		System.out.println("st1=st2 ������ ��");
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st1.name);
		System.out.println(st2.name);
	}
}
