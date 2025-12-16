package list_Collection_new;

import java.util.LinkedList;

public class L_complexcity_07 {

	public static void main(String[] args) {

		LinkedList<India> ind = new LinkedList<India>();

		for (int i = 0; i < 200000; i++) {
			ind.add(new India(i, "Maharastra", 78.90));
		}
		long start_time = System.nanoTime();
		System.out.println(ind.remove(1));
		long end_time = System.nanoTime();
		System.out.println("Time Taken : " + (end_time - start_time) / 100);
	}

}

class India {
	int pincode;
	String state;
	double gdp;

	India(int pincode, String state, double gdp) {
		this.pincode = pincode;
		this.state = state;
		this.gdp = gdp;
	}

}
