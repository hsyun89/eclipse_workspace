package day4;

public class LottoMachineInternet {
	public static void main(String[] args) {
		int[] numbers = new int[6]; // 6���� ������ ��� �迭 ����
		 
		// insertCur�� numbers �迭�� ���̸� ���� ���� ������ �ݺ��մϴ�.
		// �ߺ��� ����ٸ� �ݺ� Ƚ���� �þ �� �ֽ��ϴ�.
		for(int insertCur = 0; insertCur < numbers.length ; insertCur++){
		    // 1. ������ �� ����
		    // Math.random()�� �����ϴ� 0.0~0.999...�� ���� 45�� ����
		    // 0.0~44.xx�� ���� ����� �̸� ������ �ٲ۴�.
		    // ���⿡ 1�� ���ؼ� 1~45�� �ǵ��� �Ѵ�.
		    numbers[insertCur] = (int)(Math.random() * 45) + 1;
		 
		    // 2. �ߺ� �˻�
		    // �迭�� ���� ����(insertCur ��������)��
		    // ��� ������ ���� ���� ���� ���� �ִٸ� insertCur�� ������ �о�
		    // ���� �ݺ����� ���� ĭ�� �ٸ� ���� ������ �մϴ�.
		    for(int searchCur = 0; searchCur < insertCur; searchCur ++){
		        if(numbers[insertCur] == numbers[searchCur]){
		            insertCur--; // insertCur�� ������ �δ�
		            break; // ���� ���� �˻��� �ʿ䰡 �����Ƿ� �ߺ��˻� �ݺ��� �����ϴ�.
		        }
		    }
		}
		 
		// 3. ����ϱ�
		System.out.println("����� ��ȣ�� �Ʒ��� �����ϴ�:");
		for(int i = 0; i < numbers.length; i ++){
		    if(i > 0){
		        // �� ó�� ���Ұ� �ƴ϶�� �տ� ", "���ڿ� �߰�
		        // 1, 2, 3, ..., 6 �÷� ������ ��
		        System.out.print(", ");
		    }
		    System.out.print(numbers[i]);
		}
	}
}
