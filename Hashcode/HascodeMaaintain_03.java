package Hashcode;

import java.util.Objects;

public class HascodeMaaintain_03 {

	public static void main(String[] args) {
		 
		Student nav = new Student(303,"NANDA");
		
		Student nmber = new Student(303,"NANDA");

		System.out.println("Nav Hashcode() : " + 	nav.hashCode());
		System.out.println("Number Hashcode() : " +  nmber.hashCode());
		
	}

}

class Student{

	int A;
	String Name;
	
	
	public Student(int A, String Name)
	{
		this.A = A;
		this.Name = Name;
	}
	
	public int hashCode(){
		
		return Objects.hash(A,Name);
	}
	public boolean equals(Object obj){
		
		if(this == obj)
		return true;
		
		if(obj == null || getClass() != obj.getClass())
		return false;
		
		
		Student s = (Student) obj;
		
		return A == s.A && Objects.equals(Name,s.Name);
	}
}