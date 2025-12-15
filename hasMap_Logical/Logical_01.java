package hasMap_Logical;

import java.util.*;

public class Logical_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, ArrayList<String>> list = new HashMap<>();

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("YUDHISTER :");
		list1.add("MAHARAJA :");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Nandkishor");
		list2.add("Adi");

		list.put(1, list1);
		list.put(2, list2);

		System.out.println(list);
	}

}
