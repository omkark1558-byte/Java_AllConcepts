package Collection_logical;

import java.util.*;

public class Logical_19 {

	public static void main(String[] args) {

// ----------- Remove Duplicates Elements in List Using The Set Method ------------

		List<Integer> list = new ArrayList<Integer>();

		Collections.addAll(list, 01, 02, 03, 04, 05, 06, 05, 04, 02, 01, 03);

		Set<Integer> list1 = new HashSet<Integer>();

		Collections.addAll(list1, null, 01, null, 22, 34, 33, 23, 32, 32, 23, 56, 68);

		list1.addAll(list);

		Vector<String> i = new Vector<>();
		Collections.addAll(i, "22", "76", "89", "100");

		for(String h : i)
		{
			System.out.println(h);
		}
		System.out.println("Vector List [] : "+i);
		System.out.println("Orginal Array List: " + list);
		System.out.println("Remove Elements List: " + list1);

	}
}
