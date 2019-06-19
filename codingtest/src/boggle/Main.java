package boggle;

public class Main {

	static int length = 0;

	public static void main(String[] args) {
//		String[][] input = new String[][] { 
//			 { "N", "N", "N", "N", "S" }
//			, { "N", "E", "E", "E", "N" }
//			, { "N", "E", "Y", "E", "N" }
//			, { "N", "E", "E", "E", "N" }
//			, { "N", "N", "N", "N", "N" } };
		String word = "BEAUTIFUL";
		// System.out.println(word.substring(1));
		length = word.length(); // 3
		System.out.println(hasWord(1, 4, word));
	}

	static boolean hasWord(int x, int y, String word) {
//		String[][] input = new String[][] { 
//			 { "N", "N", "N", "N", "S" }
//			, { "N", "E", "E", "E", "N" }
//			, { "N", "E", "Y", "E", "N" }
//			, { "N", "E", "E", "E", "N" }
//			, { "N", "N", "N", "N", "N" } };
		String[][] input = { { "T", "W", "I", "C", "E" }, { "I", "S", "C", "U", "B" }, { "L", "E", "M", "O", "E" },
				{ "U", "F", "M", "O", "A" }, { "S", "O", "I", "T", "U" } };
		// ù���ڰ� �ٸ��� false
		if (!input[x][y].equals(word.substring(0, 1))) {
			return false;
		} else {
			// �ִµ� ������ true
			if (word.length() == 1) {
				return true;
			}
			// �ִµ� �� ������ 8���� ���
			// �»�
			if (y != 0 && x != 0) {
				if (hasWord(x - 1, y - 1, word.substring(1)) == true) {
					return hasWord(x - 1, y - 1, word.substring(1));
				}
			}
			// ��
			if (x != 0) {
				if (hasWord(x - 1, y, word.substring(1)) == true)
					return hasWord(x - 1, y, word.substring(1));
			}
			// ���
			if (y != 4 && x != 0) {
				if (hasWord(x - 1, y + 1, word.substring(1)) == true)
					return hasWord(x - 1, y + 1, word.substring(1));
			}
			// ��
			if (y != 0) {
				if (hasWord(x, y - 1, word.substring(1)) == true)
					return hasWord(x, y - 1, word.substring(1));
			}
			// ��
			if (y != 4) {
				if (hasWord(x, y + 1, word.substring(1)) == true)
					return hasWord(x, y + 1, word.substring(1));
			}
			// ����
			if (y != 0 && x != 4) {
				if (hasWord(x + 1, y - 1, word.substring(1)) == true)
					return hasWord(x + 1, y - 1, word.substring(1));
			}
			// ��
			if (x != 4) {
				if (hasWord(x + 1, y, word.substring(1)) == true)
					return hasWord(x + 1, y, word.substring(1));
			}
			// ����
			if (x != 4 && y != 4) {
				if (hasWord(x + 1, y + 1, word.substring(1)) == true)
					return hasWord(x + 1, y + 1, word.substring(1));
			}
			return false;
		}
	}
}