package hasMap_Logical;

//import java.util.Iterator;
//import java.util.Set;
//import java.util.TreeSet;

import java.util.*;

public class Logical_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank o = new Bank("OMKAR", 50000.00);
		Bank o1 = new Bank("Amit", 70000.00);
		Bank o2 = new Bank("Rushi", 60000.00);
		Bank o3 = new Bank("Manoj", 90000.00);
		System.out.println(o);

		Set<Bank> s = new TreeSet<Bank>();
		s.add(o);
		s.add(o1);
		s.add(o2);
		s.add(o3);

		System.out.println(s);
//		for (Bank b : s) {
//			System.err.println(b);
//		}
		Iterator<Bank> itr = s.iterator();

		while (itr.hasNext()) {
			Bank b = itr.next();
			System.out.println("1 . " + b);
		}
	}

}

class Bank implements Comparable<Bank> {

	String customer;
	double salary;

	Bank(String customer, double salary) {
		this.customer = customer;
		this.salary = salary;
	}

	public String toString() {
		return this.customer + " " + this.salary;

	}

	public int compareTo(Bank o) {
		return this.customer.compareTo(o.customer);
	}
}