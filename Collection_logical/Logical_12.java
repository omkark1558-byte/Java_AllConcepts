package Collection_logical;

import java.util.*;

public class Logical_12 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(0);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(5);

		// get elements []
		int arr = list.get(4);
		System.out.println("Get the index: "+arr);
		
		// add elements []
		list.add(2,2);
		System.out.println("Add the elements: "+list);

		// set elements []
		list.set(0, 2);
		System.out.println("Set the elements:" +list);
		
		// remove =< Remove the elements in array []
		list.remove(0);
		System.out.println("Remove the elements: "+list);
		
		// size show the array list size []
		int l = list.size();
		System.out.println("Show the size of Array: "+l);
		
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i));
		}
		System.out.println();
		
		
		// Sort Method Use the sort elements
		Collections.sort(list);
		System.out.println(list);
	}
}
