package Collection_logical;

import java.util.*;

public class Logical_16 {

	public static void main(String[] args) {

		ArrayList<Statments> list = new ArrayList<>();

		list.add(new Statments(5001, "Omkar", 20000.00));
		list.add(new Statments(5002, "Nandkishor", 30000.00));
		list.add(new Statments(5003, "Akshay", 40000.00));
		list.add(new Statments(5004, "Viraj", 50000.00));
		list.add(new Statments(5005, "Vishal", 45000.00));
		list.add(new Statments(5006, "Prasad", 16000.00));
		list.add(new Statments(5007, "Prshant", 55000.00));
		list.add(new Statments(5008, "Aniket", 22000.00));
		list.add(new Statments(5009, "Yuvraj", 23000.00));
		list.add(new Statments(5010, "Hishor", 24000.00));

		for (Statments n : list) {
			System.out.println(n);
		}
	}
}

class Statments {
	int id;
	String name;
	double amount;

	Statments(int id, String name, double amount) {
		this.amount = amount;
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Data List : [" + this.id + "," + this.name + "," + this.amount + "]";
	}

}