package Interface;

public class inter02 {

	public static void main(String[] args) {
		 
	 steel h=new steel() {
		@Override
		public void Gsteel(String h) {
			System.out.println("It's A Gsteel...!");
			}
			public void Hsteel(String j){
				System.out.println("It's is Hsteel :-");
			}
	 };
		h.Gsteel("You");
		h.Hsteel("Ou");
	}
}
interface steel{
	
	void Gsteel(String h);
	
	void Hsteel(String j);
	
//	void Ksteel(double k);
	
//	void Lsteel(double k);
}