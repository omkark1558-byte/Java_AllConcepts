package IfBlock;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);

		        // Input marks
		System.out.print("Enter marks of 5 subjects (out of 100): ");
		        int s1 = sc.nextInt();
		        int s2 = sc.nextInt();
		        int s3 = sc.nextInt();
		        int s4 = sc.nextInt();
		        int s5 = sc.nextInt();

		        // Total and Percentage
		        int total = s1 + s2 + s3 + s4 + s5;
		        double percentage = (total / 500.0) * 100;

		        // If-Else condition
		        if (percentage >= 75) {
		            System.out.println("Distinction...! Percentage = " + percentage);
		        } 
		        else if (percentage >= 60) {
		            System.out.println("First Class....! Percentage = " + percentage);
		        } 
		        else if (percentage >= 50) {
		            System.out.println("Second Class....! Percentage = " + percentage);
		        }
		        else if (percentage >= 35) {
		            System.out.println("Pass....! Percentage = " + percentage);
		        }
		        else {
		            System.out.println("Fail....! Percentage = " + percentage);
		        }
		        sc.close();
	}
}