package randomName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomName {

	public static void main(String[] args) throws InterruptedException {
		List<String> list = new ArrayList<String>();
		list.add("���ٿ�");
		list.add("������");
		list.add("����");
		list.add("�����");
		list.add("����");
		list.add("��ҹ�");
		list.add("������");
		list.add("�ڰ�ȣ");
		list.add("������");
		list.add("������");
		list.add("������");
		list.add("������");
		list.add("�̰���");
		list.add("�̹ο�");
		list.add("�̿���");
		list.add("������");
		list.add("������");
		list.add("���¸�");
		list.add("ä������");
		list.add("�ֿ���");
		list.add("ȣ����");
		list.add("ȫ����");
		Collections.shuffle(list); // ����~
		list.add(20, "null");
		list.add(21, "�Ѽ���");

		System.out.println("----------------------��----------------------");
		for(int i =0; i<4; i++) {
			for(int j =0; j<6; j++) {
			System.out.print(list.get(i*6+j)+"\t");
			Thread.sleep(500);
//			if ((i*6+j)%2==1)
//				System.out.print(" | ");
			}
			System.out.println();
		}
		System.out.println("----------------------��----------------------");
	}
	
}

