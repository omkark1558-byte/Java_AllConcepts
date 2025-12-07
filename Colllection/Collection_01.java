package Colllection;

import java.util.ArrayList;

public class Collection_01 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(20);
		arr.add(25);
		arr.add(32);
		arr.add(45);
		arr.add(560);
		arr.add(null);
		arr.add(30);

		System.out.println(arr);

		System.out.println(arr.get(2));

		System.out.println(arr.getFirst());

		System.out.println(arr.getLast());

	}
}
