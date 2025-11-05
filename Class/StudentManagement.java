package Class;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentManagement {

//	public static void main(String[] args) {
		// Model Class
		static class Student {
		    int rollNo;
		    String name;
		    double marks;

		    public Student(int rollNo, String name, double marks) {
		        this.rollNo = rollNo;
		        this.name = name;
		        this.marks = marks;
		    }

		    public void display() {
		        System.out.println("Roll No: " + rollNo + " | Name: " + name + " | Marks: " + marks);
		    }
		}

		// Main App
		
		    static ArrayList<Student> students = new ArrayList<>();
		    static Scanner sc = new Scanner(System.in);

		    public static void main(String[] args) {
		        int choice;
		        do {
		            System.out.println("\n===== Student Management System =====");
		            System.out.println("1. Add Student");
		            System.out.println("2. View All Students");
		            System.out.println("3. Delete Student");
		            System.out.println("4. Exit");
		            System.out.print("Enter your choice: ");
		            choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    addStudent();
		                    break;
		                case 2:
		                    viewStudents();
		                    break;
		                case 3:
		                    deleteStudent();
		                    break;
		                case 4:
		                    System.out.println("Exiting... Thank you!");
		                    break;
		                default:
		                    System.out.println("Invalid choice, try again!");
		            }
		        } while (choice != 4);
		    }

		    public static void addStudent() 
		    {
		        System.out.print("Enter Roll No: ");
		        int roll = sc.nextInt();
		        sc.nextLine(); // consume newline
		        System.out.print("Enter Name: ");
		        String name = sc.nextLine();
		        System.out.print("Enter Marks: ");
		        double marks = sc.nextDouble();

		        students.add(new Student(roll, name, marks));
		        System.out.println("✅ Student Added Successfully!");
		    }

		    public static void viewStudents()
		    {
		        if (students.isEmpty())
		        	
		        	
		        	
		        {
		            System.out.println("No students found!");
		        } else 
		        {
		            System.out.println("\n--- Student List ---");
		            for (Student s : students) 
		            {
		                s.display();
		            }
		        }
		    }

		    public static void deleteStudent() 
		    {	
		        System.out.print("Enter Roll No to Delete: ");
		        int roll = sc.nextInt();
		        boolean found = false;

		        for (Student s : students) {
		            if (s.rollNo == roll) {
		                students.remove(s);
		                System.out.println("🗑️ Student Removed Successfully!");
		                found = true;
		                break;
		            }
		        }
		        if (!found)
		        {
		            System.out.println("⚠️ Student Not Found!");
		        }
		    }	

	}

