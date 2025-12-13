package Collection_logical;

public class Logical_14 {

	public static void main(String[] args) {

		Book1 b = new Book1(10, 20.3,"UNIQE");
		Book1 n = new Book1(10,20.3,"SPYKAR");
		
		System.out.println(n);
		System.out.println(b);
		
		System.out.println("======== <> ==========");
		
		System.out.println(n.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println("========== <> =============");
		
		System.out.println(n.equals(b));
		System.out.println(b.equals(n));
	}
}

class Book1 {
	String Name;
	int Id;
	double Price;

	public Book1(int Id, double Price, String Name) {
		this.Id = Id;
		this.Price = Price;
		this.Name = Name;
	}

	public String toString() {
		return this.Id +" "+ Name+ " "+ this.Price;
	}
}