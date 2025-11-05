package Loops;

import java.util.Scanner;

public class TableIfElse {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Your Table...");
		int Number=sc.nextInt();
		
		for(int i=1; i<10; i++)
		{
			int Result = Number * i;
			
			if(Result %2==0)
			{
				System.out.println(Number + "x" + i + " = " + Result + "-->Even");
		
			}
			else {
			System.out.println(Number + "x" + i + " = " + Result + "-->ODD");
			}
		}
		sc.close();
	}
}