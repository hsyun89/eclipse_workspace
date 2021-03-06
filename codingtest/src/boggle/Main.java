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
		// 첫글자가 다르면 false
		if (!input[x][y].equals(word.substring(0, 1))) {
			return false;
		} else {
			// 있는데 마지막 true
			if (word.length() == 1) {
				return true;
			}
			// 있는데 더 있으면 8방향 재귀
			// 좌상
			if (y != 0 && x != 0) {
				if (hasWord(x - 1, y - 1, word.substring(1)) == true) {
					return hasWord(x - 1, y - 1, word.substring(1));
				}
			}
			// 상
			if (x != 0) {
				if (hasWord(x - 1, y, word.substring(1)) == true)
					return hasWord(x - 1, y, word.substring(1));
			}
			// 우상
			if (y != 4 && x != 0) {
				if (hasWord(x - 1, y + 1, word.substring(1)) == true)
					return hasWord(x - 1, y + 1, word.substring(1));
			}
			// 좌
			if (y != 0) {
				if (hasWord(x, y - 1, word.substring(1)) == true)
					return hasWord(x, y - 1, word.substring(1));
			}
			// 우
			if (y != 4) {
				if (hasWord(x, y + 1, word.substring(1)) == true)
					return hasWord(x, y + 1, word.substring(1));
			}
			// 좌하
			if (y != 0 && x != 4) {
				if (hasWord(x + 1, y - 1, word.substring(1)) == true)
					return hasWord(x + 1, y - 1, word.substring(1));
			}
			// 하
			if (x != 4) {
				if (hasWord(x + 1, y, word.substring(1)) == true)
					return hasWord(x + 1, y, word.substring(1));
			}
			// 우하
			if (x != 4 && y != 4) {
				if (hasWord(x + 1, y + 1, word.substring(1)) == true)
					return hasWord(x + 1, y + 1, word.substring(1));
			}
			return false;
		}
	}
}
