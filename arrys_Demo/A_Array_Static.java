package arrys_Demo;

public class A_Array_Static {

	public static void main(String[] args) {

		
		
		City Beed=new City();
		
		Beed.Name="Beed";
	//	Beed.Pincode="431122";
		
		City Patoda=new City();
		Patoda.Name="Patoda";
		
		City Ashti=new City();
		Ashti.Name="Ashti";
		
		City Geavori=new City();
		Geavori.Name="Geavori";
		
		City Ambajogai=new City();
		Ambajogai.Name="Ambajogai";
		
		City Dharur=new City();
		Dharur.Name="Dharur";
		
		City Parli=new City();
		Parli.Name="Parli";
		
		City Shirur=new City();
		Shirur.Name="Shirur";
		
	//	SambhajiNagar.Name="Chhatrapati Sambhajinagar";
	//	SambhajiNagar.Pincode="411041";
		
		System.out.println(Beed.Name);
		System.out.println(City.Pincode + " "+ "Taluka ( Beed )");
		
		System.out.println("*******");
		
		System.out.println(Patoda.Name);
		System.out.println( City.Pincode + " "+ "Taluka ( Beed )");
		System.out.println("*******");
		
		System.out.println(Ashti.Name);
		System.out.println( City.Pincode + " "+ "Taluka ( Beed )");
		System.out.println("*******");
		
		
		System.out.println(Geavori.Name);
		System.out.println( City.Pincode + " "+ "Taluka ( Beed )");
		System.out.println("*******");
		
		
		
		System.out.println(Dharur.Name);
		System.out.println( City.Pincode + " "+ "Taluka ( Beed )");
		System.out.println("*******");
		
		
		
		System.out.println(Parli.Name);
		System.out.println( City.Pincode + " "+ "Taluka ( Beed )");
		System.out.println("*******");
		
		
		System.out.println(Shirur.Name);
		System.out.println( City.Pincode + " "+ "Taluka ( Beed )");
		System.out.println("*******");
		
		
		Beed.Car0();
	
		//	SambhajiNagar.Car();
		
	//	System.out.println();
		
	//	System.out.println(Beed.Name);
		
	//	System.out.println(Beed.Pincode);
	}

}

class City
{
	String Name;
	static final String Pincode="431122";
	
	public void Car0()
	  {
		  System.out.println("Beed City");
		  
	  }
}