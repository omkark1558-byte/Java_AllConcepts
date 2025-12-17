package treeset;

import java.util.*;

public class Logical_04 {
	public static void main(String args[]) {

		Bank_2 u = new Bank_2(20252, "Ashish Nehara", 650500.00);
		Bank_2 u1 = new Bank_2(20232, "Tree's Nehara", 652500.00);
		Bank_2 u2 = new Bank_2(20272, "Vajiar Nehara", 650700.00);
		Bank_2 u3 = new Bank_2(20282, "Ashish kadam", 650900.00);

		TreeSet<Bank_2> o = new TreeSet<Bank_2>();

		o.add(u);
		o.add(u1);
		o.add(u2);
		o.add(u3);

		System.out.println(o);

		for (Bank_2 i : o) {
			System.out.println("Listed Data...: " + i);
		}

		List<String> Ne = new ArrayList<String>();
		// Collections.addAll(Ne, 01,2);
	}
}

class Bank_2 implements Comparable<Bank_2> {
	String acc_name;
	int acc_no;
	double balance;

	Bank_2(int acc_no, String acc_name, double balance) {
		this.acc_no = acc_no;
		this.acc_name = acc_name;
		this.balance = balance;
	}

	public String toString() {
		return this.acc_no + " " + this.acc_name + " " + this.balance;
	}

	public int compareTo(Bank_2 o) {
		return Integer.compare(this.acc_no, o.acc_no);
	}
}
