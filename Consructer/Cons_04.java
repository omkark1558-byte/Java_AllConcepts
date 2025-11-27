package Consructer;

public class Cons_04 {

	public static void main(String[] args) {

		Bulding b = new Bulding(500000f);

//		b.Price=5700000f;

		b.AppartmentRate();
	}
}

class Bulding {
	float Price;

	public Bulding(float Rate) {
		Price = Rate;
//		AppartmentRate();
	}

	public void AppartmentRate() {
		if (Price > 100000) {

			System.out.println("Appartment Rate : " + Price);
		} else {
			System.out.println("Please Enter Vaild Price !");
		}
	}
}