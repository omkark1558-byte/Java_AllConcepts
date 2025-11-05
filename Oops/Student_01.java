 package Oops;

import java.util.Scanner;

public class Student_01 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Students Omkar=new Students();
		
		System.out.println("Enter the name");
		String name=sc.nextLine();
		String Name=name;
		Omkar.setName(Name);
		
		System.out.println("Enter the ID");
		int id=sc.nextInt();
		int ID=id;
		Omkar.setID(ID);
	
	
		System.out.println("Enter the PhoneNumber");
		String number=sc.next();
		String Number=number;
		Omkar.setphonenumber(Number);
		
		
		
		System.out.println("Enter the Email ID ");
		String email=sc.next();
		String EmailID=email;
		Omkar.setEmailID(EmailID);
		
		
		System.out.println("Enter the Cast");
		String cast=sc.next();
		String Cast=cast;
		Omkar.setCast(Cast);
		
		
		
		System.out.println("Enter the city");
		sc.nextLine();
		String city=sc.nextLine();
		String City=city;
		Omkar.setCity(City);
		/*
		System.out.println("Please enter the marks for the five subjects :::");
		int[] marks=new int[5];
		
		for(int i=0;i<marks.length;i++)
		{
			 System.out.println("enter the subject :"+(i+1) +" :marks");
			marks[i]=sc.nextInt();
		}
		
		Omkar.setMarks(marks);
*/		
		System.out.println("Enter the state");
		String State=sc.next();
		String state=State;
		Omkar.setState(state);
		
		
		System.out.println("Enter the Pincode");
		String pincode=sc.next();
		String Pincode=pincode;
		Omkar.setPincode(Pincode);
		
		
		System.out.println("Enter the Divison");
		int  divison=sc.nextInt();
		int Divison=divison;
		Omkar.setDivison(Divison);
		

		System.out.println("Please enter the marks for the five subjects :::");
		int[] marks=new int[5];
		
		for(int i=0;i<marks.length;i++)
		{
			 System.out.println("enter the subject :"+(i+1) +" :marks");
			marks[i]=sc.nextInt();
		}
		Omkar.setMarks(marks);
				
		
		
		
		System.out.println("<<<<-------------------->>>");
		
		System.out.println("Showing For Student Details..");
		
			System.out.println("Your Name:"+Omkar.getname());
			System.out.println("Your Id:"+ Omkar.getID());
			System.out.println("Your Mobile No : +91 "+Omkar.getphonenumber());
			System.out.println("Your Email Id:"+Omkar.getEmailID());
			System.out.println("Your Cast :"+ Omkar.getCast());
			System.out.println("Your City" +Omkar.getCity());
			System.out.println("Your State:"+Omkar.getState());
			System.out.println("Your Pincode:"+Omkar.getPincode());
			System.out.println("Your Division:"+Omkar.getDivison());
			
			System.out.println("Now coming to the  marks and perecentage part : Best of luck ::::::");
			System.out.println(Omkar.getResult());
			System.out.println( Omkar.getpercentage());
			
sc.close();
	
	}

}
class Students {
	String name;
	int id;
	private String number;
	private String EmailID;
	private String Cast;
	String City;
	String State;
	String Pincode;
	int Divison;
	int[] marks=new int[5];
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return this.name;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public int getID()
	{
		return this.id;
	}
	public void setphonenumber(String number)
	{
		if(number !=null && number.length()==10) {
			this.number=number;
		}
		else {
			System.out.println("Enter the valid mobile number");
		}
		
	}
	public String getphonenumber()
	{
		if (this.number == null) {
	        return "No valid number stored yet.";
	        }
			else {
			return this.number;
			}
	}
	public void setEmailID(String EmailID)
	{
		if(EmailID != null &&EmailID.contains("@gmail.com")) {
			
		
		this.EmailID=EmailID;
		}else {
			System.out.println(" Enter the correct email id ");
		}
	}
	public String getEmailID()
	{

		if (this.EmailID == null) {
        return "No valid email ID stored yet.";
        }
		else {
		return this.EmailID;
		}
	}
	public void setCast(String Cast )
	{
		this.Cast=Cast;
	}
	public String getCast()
	{
		return this.Cast;
	}
	public void setCity(String City )
	{
		this.City=City;
	}
	public String getCity()
	{
		return this.City;
	}
	public void setState(String State )
	{
		this.State=State;
	}
	public String getState()
	{
		return this.State;
	}
	public void setPincode(String  Pincode )
	{
		this.Pincode=Pincode;
	}
	public String  getPincode()
	{
		return this.Pincode;
	}
	public void setDivison(int Divison )
	{
		this.Divison=Divison;
	}
	public int   getDivison()
	{
		return this.Divison;
	}
	
	
	
	String result="Pass";
	
	double perecentage;
	boolean showprecentage = true;
	
	public void setMarks(int[] marks)
	{
		this.marks = marks;
		int sum = 0;
		result = "Pass";
		for(int i=0 ;i<marks.length; i++)
		{
			if(marks[i] < 35)
			{
				result = "fail";
			}
			{ 
				 sum += marks[i];
			}
		}
		
		perecentage = (sum/(double)marks.length);
		
		
	}
	
	public int[] getMarks()
	{
		return this.marks;
	}
	
	public String getResult()
	{
		 if(result.equals("fail"))
		 {
			 showprecentage=false;
		 }
		return this.result;
	}
	
	public String getpercentage()
	{
		//System.out.println(this.showprecentage);
		String str=new String();
		if(showprecentage) 
		{
		return perecentage+" "+str; 
		}
		return "sorry you are failed in one or  more subjects:";
	}
}
