/*
1. Ŭ������ : MethodLab3

2. �����ؾ� �ϴ� �޼���
    public static int getRandom(int n) 
	1 ���� n ���� ������ ���� ����
    public static int getRandom(int n1, int n2) 
	n1 ���� n2 ������ ���� ����

3. main() �޼���
       getRandom(10) �� 5�� ȣ���ϰ� ���ϰ��� �ϳ��� �࿡ ���
	x, x, x, x, x

       getRandom(10, 20) �� 5�� ȣ���ϰ� ���ϰ��� �ϳ��� �࿡ ���
	x, x, x, x, x
 */
package day5;
public class MethodLab3 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			if(i == 5) {
				System.out.print(getRandom(10));
			}else {
				System.out.print(getRandom(10));
				System.out.print(", ");
			}
		}
		System.out.println();
		for(int i=1; i<=5; i++) {
			if(i == 5) {
				System.out.print(getRandom(10, 20));
			}else {
				System.out.print(getRandom(10, 20));
				System.out.print(", ");
			}
		}
	}
	public static int getRandom(int n) {
		int num = (int)(Math.random()*n)+1;
		return num;
	}		
	public static int getRandom(int n1, int n2) {
		int num = (int)(Math.random()*(n2-n1+1))+n1;
		return num;
	}
}
