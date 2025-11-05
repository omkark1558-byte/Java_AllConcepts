package Loops;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
	//	Scanner sc=new Scanner(System.in);
	//	System.out.println("Enter A Table..");
	//	int Number=sc.nextInt();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Your Table..?");
		
		int num=sc.nextInt();
		
//			 num=0;
		
		
		for(int i=0;i<=10;i++)
		{
			
		for(int Multi=1; Multi<=10; Multi++)
		{
			System.out.print(i*Multi+" ");
		}
		System.out.println("->-");
		}
		System.out.println("Enter range " + num);
		sc.close();
	}
}