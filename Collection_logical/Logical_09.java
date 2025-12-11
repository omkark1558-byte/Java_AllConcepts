package Collection_logical;

import java.util.*;

public class Logical_09 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 70,57,75,32,98,41);
		

//		list.add(23);
//		list.add(34); 
//		list.add(75); list.add(12);list.add(10); list.add(42); list.add(53); list.add(23); 
		
		
//		list.removeIf(x -> x % 2 == 0);
		System.out.println(list);
		
		for(int i =0; i<list.size();i++) {
			
			if(list.get(i) % 2 == 0) {
//				System.out.println(i + " " + list.get(i));
				list.remove(i);
				--i;
			//	i++;
				
			}
		}
		System.out.println(list);
		
	}
}
