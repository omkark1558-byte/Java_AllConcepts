package Collection_logical;

import java.util.*;

public class Logical_07 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 10,20,10,32,36,56);
		
		HashMap<Integer , Integer> map = new HashMap<>();
		
		for(Integer v : list)
		{
			map.put(v, map.getOrDefault(v, 0) +1);
		}
		
		System.out.println(map);
	}

}
