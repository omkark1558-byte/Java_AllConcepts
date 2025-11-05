package IfBlock;

import java.util.Scanner;

	public class CarGstPrice {
		
		    public static void main(String[] args) {
		    	
		        Scanner sc = new Scanner(System.in);

		        // ⿡ Ask user for the car price
		        System.out.print("Enter a car price: ");
		        
		        double carPrice = sc.nextDouble();

		        // ⿢ Decide car name from price using if–else
		        String carName;
		        if (carPrice >= 1000000)
		        {
		            carName = "Audi";
		        }
		        else if (carPrice >= 850000) 
		        {
		            carName = "BMW";
		        } 
		        else if (carPrice >= 650000) 
		        {
		            carName = "Fortuner";
		        }
		        else 
		        {
		            carName = "Other Car";
		        }

		        // ⿣ Ask GST percentage
		        
		        System.out.print("Enter GST percentage (for example 18): ");
		        double gstPercent = sc.nextDouble();

		        // ⿤ Calculate GST and total
		        double gstAmount = carPrice * gstPercent / 100;
		        double totalPrice = carPrice + gstAmount;

		        // ⿥ Show results
		        System.out.println("-----------------------------------");
		        System.out.println("Car Name        : " + carName);
		        System.out.println("Base Price      : " + carPrice);
		        System.out.println("GST (" + gstPercent + "%) : " + gstAmount);
		        System.out.println("Total with GST  : " + totalPrice);
		        System.out.println("-----------------------------------");

		        sc.close();
		    }
		}