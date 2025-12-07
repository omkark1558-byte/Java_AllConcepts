package Colllection;

import java.util.ArrayList;
import java.util.List;

public class Collection_06 {

	public static void main(String[] args) {

		List<Bank> U = new ArrayList<Bank>();

		Bank t = new Bank();
		t.Number = 1;
		t.Name = "Akshay More";
		t.Price = 200.5;

		U.add(t);

		for (Bank b : U) {
			System.out.println(b.Name + " " + b.Number + " " + b.Price);
		}
	}
}

class Bank {
	String Name;
	double Price;
	int Number;
}