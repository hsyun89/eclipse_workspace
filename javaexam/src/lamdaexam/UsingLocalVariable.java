package lamdaexam;

public class UsingLocalVariable {
	void test_method(int arg) {  //arg�� final Ư���� ����
		int localVar = 40; 	//localVar�� final Ư���� ����
		
		//arg = 31;  		//final Ư�� ������ ���� �Ұ�
		//localVar = 41; 	//final Ư�� ������ ���� �Ұ�
        
		//���ٽ�
		MyFunctionalInterface5 fi= () -> {
			//���ú��� ���
			System.out.println("arg: " + arg); 
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method5();
	}
}

