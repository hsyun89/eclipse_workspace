package day11;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapLab1 {

	public static void main(String[] args) {
		// ����
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		// �Է� ����1
//		while(map.size()<5) {
//		System.out.print("���� �Է��ϼ���");
//		String nation = sc.next();
//		System.out.print("�α����� �Է��ϼ��� ");
//		int people = sc.nextInt();
//        map.put(nation,people);
//		}
		// �Է� ����2
		while (map.size() < 5) {
			System.out.print("����� �α����� �Է��ϼ���");
			String nation = sc.next();
			int people = sc.nextInt();
			map.put(nation, people);
		}
		sc.close();
		// ���1
//		System.out.print("�Էµ� ������ : ");
//		int i = 0;
//		for (String key : map.keySet()) {
//			int value = map.get(key);
//			if (i == 0) {
//				System.out.print(key + "(" + value + ")");
//				i++;
//			} else
//				System.out.print(", " + key + "(" + value + ")");
			
			//���2
			System.out.print("�Էµ� ������ : ");
			int i = 0;
			Set<String> kset =map.keySet();
			System.out.println(kset.getClass().getName());
			for (String key : kset) {
				int value = map.get(key);
				if (i == 0) {
					System.out.print(key + "(" + value + ")");
					i++;
				} else
					System.out.print(", " + key + "(" + value + ")");
		}
	}
}
