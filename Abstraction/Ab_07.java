package Abstraction;

public class Ab_07 {

	public static void main(String[] args) {

		Hourse hourse = new Hourse();
		hourse.Walk();
		hourse.Eats();

		System.out.println();

		System.out.println("------------------Methods!-----------------");

		System.out.println();

		Elephant Ele = new Elephant();
		Ele.Walk();
		Ele.Eats();

		System.out.println();

		System.out.println("---------------Methods!-----------------");
		System.out.println();

		Tiger Ti = new Tiger();
		Ti.Walk();
		Ti.Eats();
		
		

	}

}

abstract class Animal {
	abstract void Walk();

	Animal() {
		System.out.println("You Creating A animal..");
	}

	public void Eats() {
		System.out.println("Animal Eats Fruets...");
	}
}

//---------- Extends The class Of Animal Main abstract class --------------

class Hourse extends Animal {
	public void Walk() {
		System.out.println("Walk on 4 legs..");
	}

	Hourse() {
		System.out.println("Creata A Hourse Constructer...");
	}
}

class Elephant extends Animal {
	public void Walk() {
		System.out.println("Elephant on 4 leg...");
	}

	Elephant() {
		System.out.println("Created A Constructer of Elephant....[]");
	}
}

class Tiger extends Animal {
	public void Walk() {
		System.out.println("Tiger walk on 4 leg....");
	}

	Tiger() {
		System.out.println("Creat a consructer on Tiger...1");
	}
}

class Jeraf extends Animal {
	public void Walk() {
		System.out.println("Jearaf is walk on 4 leg...");
	}

	Jeraf() {
		System.out.println("Creat a constructer in Jeraf..!");
	}
}