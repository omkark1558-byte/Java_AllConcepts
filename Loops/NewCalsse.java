package Loops;

import java.util.Scanner;

public class NewCalsse {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
//		int Number=sc.nextInt();
		
//		System.out.println("Enter A Number .....");
		
		
//		int Number=sc.nextInt();
		
		int Number=900;
		
		switch(Number)
		{
		case 50:
	
			System.out.println("It No Is Fifty ....!");
			break;
	
		case 100:
		
			System.out.println("This Is Value Is Hundred ....");
			break;
			
		case 300:
			System.out.println("This Is Value Is Three Hundred ...!");
		    break;

		case 400:
			
			System.out.println("This Is value is Four Hundred .....!");
			break;
			
			default:
				System.out.println("Known One..!");
				 
		}
		sc.close();
	}
}