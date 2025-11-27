package Consructer;

class member {

	String Name;

	public member() {
		System.out.println("Defalut Consructer..!");
	}

	public void Display1() {
		Name = "O M K A R";
		System.out.println("Name :" + Name);
	}
}

class member2 extends member {
	double Price;

	public member2() {
		super();
	}

	public void Display() {
		Price = 20.00;
		System.out.println("Price :" + Price);
	}
}

public class cons_05 {

	public static void main(String[] args) {

		member2 i = new member2();
		i.Name = "O M K A R";
		i.Display1();
		i.Display();

	}
}
