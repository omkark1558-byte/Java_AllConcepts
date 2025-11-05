package arrys_Demo;

public class A_Arrayestep01 {

	public static void main(String[] args) {
		
		School Sawarkar=new School();
		
		Sawarkar.Nams="Navle Sir";
		Sawarkar.Marks=250.00;
		
		Sawarkar.Class();
		
		
		School Sentence=new School();
		
		Sentence.Nams="Chaudhari Sir...!";
		Sentence.Marks=4500.00;
		
		Sentence.Main();
		
		School Sanskar=new School();
		
		Sanskar.Nams="Sarde Mama....";
		Sanskar.Marks=6524.20;
		
		Sanskar.Class();
		
	}

}

class School {
	
	String Nams;
	double Marks;
	
	public void Class()
	{
		System.out.println("Is Names Of School Teacher...!");
	}
	
	public void Main()
	{
		System.out.println("It is Names Of School Principal...!");
	}
}
