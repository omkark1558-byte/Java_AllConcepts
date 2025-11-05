package Oops;

import java.util.Scanner;

public class Vidhyarti {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		Vidhyarati student = new Vidhyarati();

		/*
		 * System.out.println("Enter You Name:");
		 * 
		 * String Name = sc.nextLine(); String name = Name; student.setName(name);
		 */
		System.out.println("Enter Your Mobile No:");
		String Mobile_No = sc.next();
		String mobile_no = Mobile_No;
		student.setMobile_no(mobile_no);
 

		System.out.println("Enter Your Email Id:");
		String Email_id = sc.next();
		String email_id = Email_id;
		student.setEmail_id(email_id);
//		System.err.println(student.getEmail_id());
 
		
		System.out.println("Enter Your Id:");
		String Id = sc.next();
		String id = Id;
		student.setId(id);
 
		
		System.out.println("Enter Your City:");
		String City=sc.next();
		String city=City;
		student.setCity(city);
 

		System.out.println("Enter Your Cast:");
		String Cast=sc.next();
		String cast=Cast;
		student.setCast(cast);
 

		System.out.println("Enter Your Division:");
		char Division=sc.next().charAt(0);
		char division=Division;
		student.setDivision(division);
		 
		System.out.println("Enter Your Pincode:");
		int pincode=sc.nextInt();
		int Pincode=pincode;
		student.setpincode(Pincode);
		
		System.out.println("Enter A Subject Marks :");
		for(int i=0; i<5;i++)
		{
			student.Marks[i]=sc.nextInt();
			
		}
		
		System.out.println("--------------------------");
	
		
		System.out.println("Name :" +     		 student.getName());
		System.out.println("Mobile No: +91 " +   student.getMobile_No());
		System.out.println("Email Id :"+         student.getEmail_id());
		System.out.println("Id :"+               student.getId());
		System.out.println("City :" +            student.getCity());
		System.out.println("Cast :" +            student.getCast());
		System.out.println("Division :"+         student.getDivision());
		System.out.println("Pincode :" +         student.getpincode());
	
		double Percentage=student.getMarks();
		
		System.out.println("Percentage :" + Percentage +"%");
		
		if(Percentage>=35)
		{
			System.out.println("Result : Pass");
		}else {
			System.out.println("Result : Fail");
		}
		sc.close();
	}
}

class Vidhyarati {
	
	String Name;
	private String Mobile_No;
	private String Email_id;
	String Id;
	String City;
	String Cast;
	char Division;
	int pincode;
	
	int[] Marks=new int[5];
	
	
	public void setMobile_no(String Mobile_No) 
	{
		if(Mobile_No.length()==10)
		{
		this.Mobile_No = Mobile_No;
	}else
	{
		System.out.println("Pleasse Enter Your Mobile No.");
	}
	}

	public String getMobile_No() 
	{
		return this.Mobile_No;
	}

	public void setEmail_id(String Email_id) 
	{
		if(Email_id.endsWith("@gmail.com"))
		{
			this.Email_id = Email_id;
		}
		else 
		{
		this.Email_id="Please Enter the Correct Email Id:";
		}
	}

	public String getEmail_id() {
		return this.Email_id;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getName() {
		return this.Name;
	}

	public void setId(String Id) {
		this.Id = Id;
	}

	public String getId() {
		
		return this.Id;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public String getCity() {
		return this.City;
	}

	public void setCast(String Cast) {
		this.Cast = Cast;
	}

	public String getCast() {
		return this.Cast;
	}

	public void setDivision(char Division) {
		this.Division = Division;
	}

	public char getDivision() {
		return this.Division;
	}

	public void setpincode(int pincode) {
		this.pincode = pincode;
	}

	public int getpincode() {
		return this.pincode;
	}
 
	public double getMarks()
	{
	    int sum = 0;

	    for(int i = 0; i < 5; i++) 
	    {
	        sum += Marks[i];
	    }
	    return (sum / 5.0);
	}
}



