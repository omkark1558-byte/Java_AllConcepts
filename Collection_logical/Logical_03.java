package Collection_logical;

import java.util.*;

public class Logical_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 2,10,23,23,56);
		

		int max = Collections.max(list);
		int min = Collections.min(list);
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);

	}

}
