package list_Collection_new;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;

public class Logical_10 {

	public static void main(String[] args) {

		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		set.add(10);
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);

		System.out.println(set);

		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(12);
		set.retainAll(list);
		
		System.out.println(list);
	//	System.out.println(set);

	}

}

/*
 * RetailAll Method is retain the elements in list 
 * Collection class elements Secife collection of elements
 */