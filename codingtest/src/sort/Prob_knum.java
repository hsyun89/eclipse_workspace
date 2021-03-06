package sort;

import java.util.Arrays;


public class Prob_knum {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = new int[][] { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		for (int data : solution(array, commands))
			System.out.println(data);
	}

	public static int[] solution(int[] array, int[][] commands) {
//		LinkedList<Integer> list = new LinkedList<>();
		int[] answer = new int[commands.length];
		int start = 0;
		int end = 0;
		int index = 0;
		for (int i = 0; i < commands.length; i++) {
			start = commands[i][0];
			end = commands[i][1];
			index = commands[i][2];
			int[] arr = new int[commands[i][1] - commands[i][0] + 1];
			int k = 0;
			for (int j = start - 1; j < end; j++) {
				arr[k] = array[j];
				k++;
			}
			Arrays.sort(arr);
			answer[i] = arr[index - 1];
		}
		return answer;
	}

}
