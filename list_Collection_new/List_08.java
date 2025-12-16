package list_Collection_new;

import java.util.Collections;
import java.util.LinkedHashSet;

public class List_08 {
	public static void main(String args[]) {

//  Mentain the instioal order and use the insetional order 

		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();

		Collections.addAll(h, 1, 2, 3, 3, 44, 55, 55, 44, 33, 3, 2, 1, 5);

		h.addFirst(100);
		h.addLast(88);
		System.out.println(h);

	}
}
