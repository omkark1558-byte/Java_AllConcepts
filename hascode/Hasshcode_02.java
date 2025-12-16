package hascode;

import java.util.Objects;

public class Hasshcode_02 {

	public static void main(String[] args) {

		CAR c = new CAR();
		c.name = "Fortuner";
		c.car_no = 5005;
		c.price = 500000;

		CAR c1 = new CAR();
		c1.name = "Fortuner";
		c1.car_no = 5005;
		c1.price = 400000;
		
		System.out.println("First Object of Hashcode:(Int) : "+c.hascode());
		System.out.println("Second Object of Hashcode: (Int) : "+c1.hascode());
		
		
		System.out.println("--------------------------------------");
		
		System.out.println("First Object of Hashcode: (String) : "+c.hashcode());
		System.out.println("Second Object of Hashcode: (String) : "+c1.hashcode());
	}

}

class CAR {
	String name;
	double price;
	int car_no;

	public int hascode() {
		return Objects.hash(this.price);
	}
	
	public int hashcode()
	{
		return Objects.hash(this.name);
	}
}
