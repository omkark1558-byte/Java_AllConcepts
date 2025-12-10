package Collection_logical;
import java.util.*;


public class Logical_05 {

	public static void main(String[] args) {
 
		ArrayList<Integer> list = new ArrayList<>();
		
		Collections.addAll(list, 10,1,2,3,3,4,4,55,66,1,7);
		
		Collections.sort(list);
		
		System.out.println("Second Highest : = " + list.get(list.size() - 2));
		
 	}
}
