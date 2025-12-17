package treeset;

import java.util.*;

public class Logical_01 {

	public static void main(String[] args) {

		Employee I = new Employee(101, "Devansh", 25000.00);
		Employee I1 = new Employee(102, "Aniket", 35000.00);
		Employee I2 = new Employee(103, "Viraj", 45000.00);
		Employee I3 = new Employee(104, "Yuvraj", 25000.00);
		Employee I4 = new Employee(105, "Rajveer", 65000.00);

		TreeSet<Employee> y = new TreeSet<Employee>();

		y.add(I);
		y.add(I1);
		y.add(I2);
		y.add(I3);
		y.add(I4);

		for (Employee k : y) {
			System.out.println(k);
		}
		System.out.println("---------------------------------");

		Student_1 u = new Student_1(01, "Anuj", 20.00);
		Student_1 u1 = new Student_1(02, "Anii", 60.00);
		Student_1 u2 = new Student_1(03, "Jasu", 80.00);
		Student_1 u3 = new Student_1(04, "Yanu", 50.00);
		Student_1 u4 = new Student_1(05, "Samu", 30.00);

		TreeSet<Student_1> i = new TreeSet<Student_1>();

		i.add(u);
		i.add(u1);
		i.add(u2);
		i.add(u3);
		i.add(u4);
		for (Student_1 K : i) {
			System.out.println(K);
		}

		System.out.println("-----------------------------");

		Bank b = new Bank(171547, "Yash Jadhav", 50000.00);
		Bank b1 = new Bank(171447, "Imanush Jadhav", 47000.00);
		Bank b2 = new Bank(181547, "Tester Jadhav", 58000.00);
		Bank b3 = new Bank(171537, "Vishnu Jadhav", 57000.00);
		Bank b4 = new Bank(171597, "vanraj Jadhav", 52000.00);

		TreeSet<Bank> k = new TreeSet<Bank>();

		k.add(b);
		k.add(b1);
		k.add(b2);
		k.add(b3);
		k.add(b4);

		for (Bank l : k) {
			System.out.println(l);
		}
		System.out.println("------------------------------");
		System.out.println(k);

		Owner Y = new Owner(01, "Nivas", 950000.00);
		Owner Y1 = new Owner(02, "Nanakar", 650000.00);
		Owner Y2 = new Owner(03, "Annand", 850000.00);
		Owner Y3 = new Owner(04, "Vishnu", 452000.00);
		Owner Y4 = new Owner(05, "Jijai's", 350200.00);

		TreeSet<Owner> p = new TreeSet<Owner>();

		p.add(Y);
		p.add(Y1);
		p.add(Y2);
		p.add(Y3);
		p.add(Y4);

		System.out.println(p);

	}
}

class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		return Double.compare(this.salary, o.salary);
	}

	public String toString() {
		return this.id + " " + this.name + " " + this.salary;

	}
}

class Student_1 implements Comparable<Student_1> {
	int id;
	String name;
	double amount;

	Student_1(int id, String name, double amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	public String toString() {
		return this.id + " " + this.name + " " + this.amount;
	}

	public int compareTo(Student_1 o) {
		return Integer.compare(this.id, o.id);
	}
}

class Bank implements Comparable<Bank> {
	int id;
	String name;
	double balance;

	Bank(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String toString() {
		return this.id + " " + this.name + " " + this.balance;
	}

	public int compareTo(Bank o) {
		return Integer.compare(this.id, o.id);
	}
}

class Owner implements Comparable<Owner> {
	int id;
	String house_name;
	double rate;

	Owner(int id, String house_name, double rate) {
		this.house_name = house_name;
		this.rate = rate;
		this.id = id;
	}

	public String toString() {
		return this.id + " " + this.house_name + " " + this.rate;
	}

	public int compareTo(Owner o) {
		return Integer.compare(this.id, o.id);
	}

}
