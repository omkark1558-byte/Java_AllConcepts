package list_Collection_new;

import java.util.Collections;
import java.util.LinkedList;

public class Logical_03 {

	public static void main(String[] args) {

		LinkedList<Integer> i = new LinkedList<>();

		Collections.addAll(i, 01, 02, 03, 04, 05);

		i.add(20);
		i.add(20);
		i.add(30);

		System.out.println("Remove Index 0: " + i.remove(0) + "Remove Index 05:  " + i.remove(5));
		System.out.println(i);
	}
}
