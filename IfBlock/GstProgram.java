package IfBlock;

//import java.util.Scanner;

public class GstProgram {

	public static void main(String[] args){
		
		//Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter Car Price");

		
		double car=1000000;
		
		
		if(car>0 && car<=1000000)
		{
			System.out.println("Fortuner Car Prices...!"+(car / 100)*18);
		}
		else if(car>100000 && car<=6500000)
		{
			System.out.println("It is BMW is 3 series Price.....!");
		}
		else if(car>7500000 && car<=8500000)
		{
			System.out.println("It is BMW is 5 Series Price...!");
		}
		else if(car<9500000 && car>=10000000)
		{
			System.out.println("It Is Audii Price...!");
		}
		
	}

}