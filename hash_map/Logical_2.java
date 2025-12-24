package hash_map;

import java.util.*;

public class Logical_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method

		Student i = new Student("Sawrkar", 2000.50);
		Student i1 = new Student("Sawrkar", 2000.50);
		Student i2 = new Student("Sawrkar", 2000.50);

//		System.out.println(i.hashCode());
//		System.out.println(i1.hashCode());
//		System.out.println(i2.hashCode());
//		
		Set<Student> u = new TreeSet<Student>();
		u.add(i1);
		u.add(i2);
		u.add(i);

		System.out.println(u);

	//	System.out.println(i.equals(i1));
	}
}

class Student {
	String name;
	double salary;

	Student(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public int hashCode() {
		return name.hashCode();
	}

	public String toString() {
		return this.name;
	}

	public boolean equals(Object obj) {
		Student s2 = (Student) obj;
		return this.name.equals(s2.name);
	}
}
