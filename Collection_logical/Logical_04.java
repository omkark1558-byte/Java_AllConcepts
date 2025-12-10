package Collection_logical;

import java.util.*;

public class Logical_04 {

	public static void main(String[] args) {
		

		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 10,10,25,56,12,45,98);
		
		Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list);
	}

}
