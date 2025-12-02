package Excepation_1;

public class Anonynmus_Class_01 {

	public static void main(String[] args) {

		i k = new i() {
			public void Ride() {
				System.out.println("Ride The Bike : ROYAL ENFIELD 350 / CC..🚲");
			}
		};

		k.Ride();

	}

}

interface i {
	void Ride();
}