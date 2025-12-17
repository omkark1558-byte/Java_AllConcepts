package collection_List_pacakge;

public class Book {
	int id;
	String name;
	double price;

	public Book(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return this.id + " " + this.name + " " + this.price;
	}
}