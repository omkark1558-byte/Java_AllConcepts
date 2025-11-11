package String;

import java.util.Scanner;


public class string_01 {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in); 

		
//		double Marks2=20.00;
		System.out.println("Enter a Marks...!");	
		double Marks =sc.nextDouble();
		
		if(Marks>35 && Marks<=45)
		{
			System.out.println("Student Is Failled..!");
		}else if(Marks >45 && Marks <=65)
		{
			System.out.println("Student is Passed..");
		}else if(Marks >65 && Marks <=85)
		{
			System.out.println("Student is Pass And Student Marks is very Good >> Congratulations");
		}else
		{
			System.out.println("<<<...Invaild marks...* Enter a vaild marks..>>>");
		}
		sc.close();
	}
}