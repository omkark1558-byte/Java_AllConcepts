package Loops;

import java.util.Scanner;

public class First04 {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Find Day...");
		
		String str=sc.next();
		
		
		//String str="Thrusday";
		
		switch(str) // variable Name
		{
		case("Friday"): // Variable Value
	
			System.out.println("Tommorrow  Is Friday >>>>>>>");
			break;
		
		case("Thrusday"):// Variable Value
	
		System.out.println("Today Is The Thrusday...>>");
		break;
		
		case("Monday"):// Variable Value		
		
		System.out.println("Monday Is Vary Along Day To Come Through...>>");
		break;
		
		default:
		
			System.out.println("You Are A Invalied Valuee.....! Plzz Check The Value >>.....!");
		//	break;
			}
		sc.close();
		}
	}
