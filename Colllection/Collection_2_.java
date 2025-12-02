package Colllection;

import java.util.*;

public class Collection_2_ {
	public static void main(String args[]) {

		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(20);
		arr.add(650);  
		arr.add(65);  
		
		System.out.println("Boolean Value Concider : " + arr.add(45));  
		
		arr.add(50);  
		arr.add(69); 
		
		arr.add(25);
		arr.add(27);
		arr.add(29);
		arr.add(32);
		
		
		System.out.println(arr.get(5));
		System.out.println("Get First Array  : "+ arr.getFirst());
		System.out.println(arr.get(6));
	
	}

}
