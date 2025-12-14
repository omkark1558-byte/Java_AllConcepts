package Collection_logical;

public class Logical_17 {

	public static void main(String[] args) {

		Samsung sum = new Samsung();
		
		sum.id = 10;
		Samsung sum2 = new Samsung();
		
		sum2.id = 10;
		System.out.println(sum2.hashCode());
		System.out.println(sum.hashCode());
		
		Samsung sum3 = new Samsung();
		sum3.price = 2000.50;
		sum3.model = "RM w";
		
		System.out.println(sum3.hashCode());
		System.out.println(sum3.toString());
		
		System.out.println(sum.equals(sum2));
	}

}

class Samsung {
	int id;
	double price;
	String model;

	public int hashCode() {
		return this.id;
	}
	public String toString()
	{
		return this.model;
	}
}