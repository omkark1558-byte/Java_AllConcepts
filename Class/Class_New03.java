package Class;

public class Class_New03 {

	public static void main(String[] args) {
		 
		
		car Hyundai=new car();
		
		Hyundai.Mileage=65;
		Hyundai.Price=450000.0;
		
		car legender=new car();
		
		legender.Mileage=80;
		legender.Price=850000.0;
		
		car Tata=new car();
		
		Tata.Mileage=75;
		Tata.Price=150000.0;
		
		car Punch=new car();
		
		Punch.Mileage=35;
		Punch.Price=900000.0;
		
		 
		car BMW=new car();
		
		BMW.Mileage=56;
		BMW.Price=700000.0;
		
		System.out.println(Hyundai.Mileage);
		System.out.println(Hyundai.Price);
		
		System.out.println("-------");
		
		System.out.println(legender.Mileage);
		System.out.println(legender.Price);
		
		System.out.println("-------");
		
		System.out.println(Tata.Mileage);
		System.out.println(Tata.Price);
		
		System.out.println("-------");
	
		System.out.println(Punch.Mileage);
		System.out.println(Punch.Price);
	
		System.out.println("-------");
		
		System.out.println(BMW.Mileage);
		System.out.println(BMW.Price);
		
		System.out.println("-------");
		
		
	}

}

class car
{
	int Mileage;
	
	double Price;
	
}