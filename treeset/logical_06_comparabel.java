package treeset;

import java.util.*;

public class logical_06_comparabel {

	public static void main(String[] args) {

		Amazon_order T = new Amazon_order(4.9, 3, "Watch");
		Amazon_order T1 = new Amazon_order(4.3, 5, "Slipper");
		Amazon_order T2 = new Amazon_order(3.7, 4, "Flag");

		TreeSet<Amazon_order> u = new TreeSet<Amazon_order>();
		u.add(T1);
		u.add(T2);
		u.add(T);
		System.out.println(u);

		for (Amazon_order o : u) {
			System.out.println("* " + o);
		}
	}
}

class Amazon_order implements Comparable<Amazon_order> {
	double rating;
	int stars;
	String order_name;

	Amazon_order(double rating, int stars, String order_name) {
		this.rating = rating;
		this.stars = stars;
		this.order_name = order_name;
	}

	public String toString() {
		return this.stars + " " + this.rating + " " + this.order_name;
	}

	public int compareTo(Amazon_order o) {
		return Double.compare(this.rating, o.stars);
	}
}
