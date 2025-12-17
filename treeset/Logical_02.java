package treeset;

import java.util.*;

public class Logical_02 {

	public static void main(String[] args) {

		TreeSet<Students> list = new TreeSet<Students>();

		Students i = new Students(101, "Omkar", 'A');
		Students i1 = new Students(102, "Unique", 'B');
		Students i2 = new Students(102, "Unique", 'B');
		Students i3 = new Students(103, "Swa", 'V');
		list.add(i);
		list.add(i1);
		list.add(i2);
		list.add(i3);
		
		
		System.out.println(list);

	}

}

class Students implements Comparable<Students> {
	int id;
	String name;
	char division;

	Students(int id, String name, char division) {
		this.division = division;
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return this.name +" "+ this.division +""
				+ "" + this.id;
	}

	public int compareTo(Students o) {
		
		return Integer.compare(this.division, o.division);
	}
}
