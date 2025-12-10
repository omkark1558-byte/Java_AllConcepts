package Collection_logical;
import java.util.*;

public class Logical_08 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		
		Collections.addAll(list1, 10,20,30,69,80);
		Collections.addAll(list2, 20,30,69,80,69);
		
		list2.retainAll(list1);
//		System.out.println(list1);
		
		System.out.println("Common : " +list1);
		
		System.out.println(list1);
		System.out.println(list2);
	}
}
