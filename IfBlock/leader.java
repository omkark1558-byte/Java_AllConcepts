package IfBlock;

public class leader {

	public static void main(String[] args){
		
		//Scanner scanner=new Scanner(System.in); 
		
		double price=25.12;
		
		
		if(price>0 && price<=55)
		{
			System.out.println("You Purces Book");
		}
		else if(price>55 && price<=65)
		{
			System.out.println("Medium Purches Range Book ");
		}
		else if(price>65 && price<=75)
		{
			System.out.println("High Price Book");
		}
		else if(price>75 && price <=100)
		{
			System.out.println("High Price Of Book Plz Buying Book Yor Renspobility");
		}
		else {
			System.out.println("Got It Any More Shop");
		}
		
	}
}
