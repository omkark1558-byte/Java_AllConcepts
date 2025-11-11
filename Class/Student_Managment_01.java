package Class;

import java.util.Scanner;

public class Student_Managment_01 {

	public static void main(String[] args) {
		 
		
		Scanner sc=new Scanner(System.in);
		
//		String Name=new String("Omkar");
//		double Marks;
		
		
		System.out.println("Enter A Roll No :-");
		int Roll_01 = sc.nextInt();
		sc.nextLine(); 
		
		System.out.println("Enter a Name :-");
		String Name1 = sc.nextLine();
		
		System.out.println("Enter A Marks Of Student :-");
		double Mark = sc.nextDouble();
		
		if (Mark < 35)	{
			System.out.println("Student is Fail...!");
		}
		else
		{
			System.out.println("Students Is Passed..!");
		} 	
		if (Name1.isEmpty())
		{
			System.out.println("Name Is Wrong..");
		}else {
			System.out.println("Name Is Right...");
		}
		
		System.out.println("----------------");
		System.out.println("Student Details");
		System.out.println("Roll No :"+ Roll_01);
		System.out.println("Student Name:" + Name1);
		System.out.println("Student Marks:" + Mark);
		 
 
		/*
		 * if (Roll_01 < 0) { System.out.println("Invalid Roll Number!"); } else if
		 * (Mark < 40) { System.out.println("Student " + Name1 + " is Fail...!"); } else
		 * { System.out.println("Student " + Name1 + " is Passed...!"); }
		 * 
		 */ sc.close();
		
	}

}

class Student
{
	
	int Roll_No=20;
	String Name="Omakr Kale";
	double Marks=65.04;
	
}