package Collection_logical;

public class Logical_11 {

	public static void main(String[] args) {

		Book n = new Book("OMKAR", 22, 25000.00);
		Book n1 = new Book("AKSHAY",23,65000.00);
		Book n2 = new Book("YASH",24,55000.00);
		Book n3 = new Book("vishal",25,95000.00);
		Book n4= new Book("Viraj",26,45000.00);
		
		System.out.println(n);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}

}

class Book {
	String name;
	double fees;
	int id;

	public Book(String name, int id, double fees) {

		this.fees = fees;
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return this.id + " " + name + " " + this.fees;

	}
}