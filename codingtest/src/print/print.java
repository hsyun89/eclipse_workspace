package print;

import java.util.LinkedList;

public class print {

	public static void main(String[] args) {
//		int[] priorities = new int[] { 2, 1, 3, 2 };
//		int location = 2;
//		int[] priorities = new int[] { 1, 1, 9, 1, 1, 1};
//		int location = 0;
		int[] priorities = new int[] { 1 };
		int location = 0;
//		int[] priorities = new int[] { 2, 1 };
//		int location = 1;
		System.out.println(solution(priorities, location));
		// return 1이 나와야함
	}

//구현
	public static int solution(int[] priorities, int location) {
		LinkedList<Integer> qu = new LinkedList<Integer>();
		LinkedList<Integer> loc = new LinkedList<Integer>();
		LinkedList<Integer> result = new LinkedList<Integer>();
		for (int i = 0; i < priorities.length; i++) {
			qu.add(priorities[i]); // 1,2
			loc.add(i); // 0,1
		}
//		if (priorities.length > 1) {
			while (qu.size() > 1) {
				int max = qu.get(0);
				int flag = 0;
				for (int i = 1; i < qu.size(); i++) {
					if (qu.get(i) > max) {
						// 나보다 큰놈이 있다면! flag=1
						flag = 1;
					}
				}
				// 나보다 큰놈이 있으므로 뒤로보내기
				if (flag == 1) {
					qu.add(qu.peek());
					loc.add(loc.peek());
					qu.remove();
					loc.remove();
				}
				// 나보다 큰놈이 없으므로 출력하기
				else {
					qu.remove();
					result.add(loc.poll());
				}
			}
			// 하나 남음
			result.add(loc.poll());
			
			int answer = 1;
			for (int i = 0; location != result.get(i); i++) {
				answer++;
			}
			return answer;
//		} else {
//			int answer = priorities[0];
//			return answer;
//		}
	}
}
