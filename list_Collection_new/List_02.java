package list_Collection_new;

import java.util.*;

public class List_02 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		Collections.addAll(list, 0, 1, 2);

		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println("------- Integer list -------");
		for (Integer A : list) {
			System.out.println(A);
		}

		ArrayList<String> list2 = new ArrayList<>();

		Collections.addAll(list2, "O", "M", "I", "I", "P", "A", "U", "I", "O");

		System.out.println("--------- Word list --------" + "");

		for (String m : list2) {
			System.out.println(m);
		}

		ArrayList<Bank1> liest = new ArrayList<>();

		Collections.addAll(liest, new Bank1(10, "OMAKR", 2000.00));
		System.out.println(liest);
	}
}

class Bank1 {
	int id;
	String name;
	double balance;

	Bank1(int id, String name, double balance) {
		this.balance = balance;
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return this.id + " " + this.name + " " + this.balance;
	}
}
