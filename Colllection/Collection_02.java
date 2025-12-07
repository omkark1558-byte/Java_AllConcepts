package Colllection;

import java.util.*;

public class Collection_02 {
	public static void main(String args[]) {

		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(20);
		arr.add(650);  
		arr.add(65);  
		
		System.out.println("Boolean Value Concider : " + arr.add(45));  
		
		arr.add(20);  
		arr.add(25); 
		arr.add(30);
		arr.add(35);
		arr.add(40);
		arr.add(45);
		
		
		System.out.println(arr.get(5));
		System.out.println("Get First Array  : "+ arr.getFirst());
		System.out.println(arr.get(6));
		System.out.println("Array list .."+arr);
		System.out.println(arr.getLast());
		arr.getLast();
	}

}
