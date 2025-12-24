package hash_map;

import java.util.HashMap;

public class Logical_1 {

	public static void main(String[] args) {

		HashMap<Integer, String> str = new HashMap<Integer, String>();

		str.put(1, "BEED");
		str.put(2, "PUNE");
		str.put(3, "MUMBAI");
		str.put(4, "SAMBHAJINAGAR");
		str.put(5, "AMADANAGAR");

		System.out.println(str);
 
		System.out.println(str.get(5)); // Get The value based on the key..!
		
		System.out.println(str.getOrDefault(3, "Default")); // give The value its's  not the array is give the defalut value
		
		
		
	}
}

//for (Map.Entry elements : str.entrySet()) {
//	int key = (int) elements.getKey();
//
//	String value = (String) elements.getValue();
//
//	System.out.println(value + " " + key);
//
//}