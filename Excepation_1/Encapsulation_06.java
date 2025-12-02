package Excepation_1;

public class Encapsulation_06 {

	public static void main(String[] args) {

		A i = new A() {
			public void Speed() {
				System.out.println("Bike Speed : 110 km/h");
			}
		};

		i.Speed();
	}

}

interface A {
	void Speed();
}