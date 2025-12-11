package Colllection;

import java.util.*;

public class Collection_10 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		Collections.addAll(list, 10, 12, 23, 45, 67, 66, 89);

		LinkedList<Integer> list1 = new LinkedList<>();

		Collections.addAll(list1, 23, 45, 11, 56, 87);

		Vector<Object> list3 = new Vector<Object>();

		Collections.addAll(list3, "Omkar", 10, 10.20);

		System.out.println(list.contains(10) + " " + list.contains(6));

		System.out.println(list.containsAll(list1) + " " + list1.containsAll(list));

		System.out.println(list3);

	}
}

