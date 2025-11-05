package Class;

public class Class_New04 {

	public static void main(String[] args) {
	
		City Dharashiv=new City();
		Dharashiv.Name="Dharashiv";
		Dharashiv.District="Owen";
		Dharashiv.Pincode="413501";
		Dharashiv.Add="Ousmanabad";
		
	
		City Beed=new City();
		Beed.Name="Beed..@";
		Beed.District="Beed";
		Beed.Pincode="431517";
		Beed.Add="Beed";		
		
	 
		
		System.out.println(Dharashiv.Name);
		System.out.println(Dharashiv.District);
		System.out.println(Dharashiv.Pincode);
		System.out.println(Dharashiv.Add);
		
		System.out.println("----------");
		
		System.out.println(Beed.Name);
		System.out.println(Beed.District);
		System.out.println(Beed.Pincode);
		System.out.println(Beed.Add);
	}

}

class City
{
	String Name;
	String Pincode;
	String Add;
	String District;
	
	
}