package day4;

public class TwoArrayTess2 {

	public static void main(String[] args) {
		int nums[][] = {
				{10,20,30,40}
			,	{11,21,31,41}
			,	{12,22,32,42}
			,	{13,23,33,43}
		};
		
//		//2�� 3���� �����͸� ����� ����.
//		System.out.println(nums[1][2]);
//		
//		//3�ุ ���
//		final int hang=3;  //3��
//		for(int i=0;i<nums[hang-1].length;i++)
//			System.out.println(nums[hang-1][i]);
//		
//		for(int data:nums[2])
//			System.out.println(data);
//		
//		//4���� ���
//		final int yul=4; //4��
//		for(int i=0;i<nums[yul-1].length;i++)
//			System.out.println(nums[i][yul-1]);
		
		//���� �밢���� �ش��ϴ� �����͸� ����Ѵ�. for��
//		for(int i=0; i<nums[0].length; i++)
//			System.out.println(nums[i][i]);
		
		//������ �밢���� �ش��ϴ� �����͸� ����Ѵ�. for��
		for(int i=0; i<nums[0].length; i++)
		System.out.println(nums[i][3-i]);

	}
}
