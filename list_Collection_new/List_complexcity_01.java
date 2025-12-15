package list_Collection_new;

import java.util.LinkedList;

public class List_complexcity_01 {

	public static void main(String[] args) {

		LinkedList<Book> uo = new LinkedList<Book>();

		for (int i = 0; i < 10000000; i++) {
			uo.add(new Book(i, "A", 34.67, 3.5));
		}
		long start_time = System.nanoTime();
		System.out.println(uo.remove(1));
		long end_time = System.nanoTime();
		System.out.println("Time Taken : " + (end_time - start_time) / 1000);

	}
}

class Book {
	int id;
	String Name;
	double Price;
	double Ratings;

	public Book(int id, String Name, double Price, double Ratings) {
		this.id = id;
		this.Name = Name;
		this.Price = Price;
		this.Ratings = Ratings;

	}
}