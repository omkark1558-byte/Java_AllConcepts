package Collection_logical;

import java.util.*;

public class Logical_06 {

	public static void main(String[] args) {
	
		ArrayList<Integer> List = new ArrayList<>();
		Collections.addAll(List, 10,20,30,40,50,65);
		
		Collections.reverse(List);
		System.out.println(List);
	}

}
