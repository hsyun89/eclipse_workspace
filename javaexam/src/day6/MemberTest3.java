package day6;

class Member3{
	String name;
	String account;
	String passwd;
	int birthYear;
	//������ �����
	Member3(){
		System.out.println("��ü ����");
	}
	// ������ �����ε�, �Ű����� ���
	Member3(String name, String account, String passwd, int birthYear){
		this.name=name;
		this.account = account;
		this.passwd = passwd;
		this.birthYear = birthYear;
	}
}

public class MemberTest3 {
	public static void main(String[] args) {
		Member3 objA[] = new Member3[3];
		objA[0] = new Member3("������","hsyun89","123123",891031);  //�����ڸ� ���� ��ü ����
		objA[1] = new Member3("��ī��","pikapika","888888",1);  //�����ڸ� ���� ��ü ����
		objA[2] = new Member3("������","liechuu","77777",1);  //�����ڸ� ���� ��ü ����

		for(int i=0;i<objA.length;i++) {
		System.out.printf("ȸ��%d : %s(%s, %s, %d)\n"
		,i+1,objA[i].name,objA[i].account,
		objA[i].passwd,objA[i].birthYear);
		}
		
	}
}
