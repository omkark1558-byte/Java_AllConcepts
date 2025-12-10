package Collection_logical;
import java.util.*;


public class Logical_01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(10);
		list.add(22);
		list.add(22);
		list.add(30);
		
		System.out.println("Array List Orignal: "+list);
		
		HashSet<Integer> set = new HashSet<>();
		System.out.println("Duplicates Elements");
		for(Integer x : list)
		{
			if(!set.add(x))
			{
				System.out.println(x);
			}
		}
		
	}

}

