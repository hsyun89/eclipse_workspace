package day12;

import java.util.ArrayList;

public class CreateList {
	public ArrayList<Integer> convertList(int[] array) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = array.length - 1; i >= 0; i--) {
			list.add(array[i]);
		}
		return list;
	}
}
