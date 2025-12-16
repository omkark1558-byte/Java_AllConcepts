package hascode;

import java.util.Objects;

public class Hashcode_01 {
	public static void main(String args[]) {

		Manik_tech m = new Manik_tech();
		m.id = 101;
		m.name = "OMAKR";
		m.price = 101.00;
		Manik_tech m2 = new Manik_tech();
		m2.id = 101;
		m2.name = "OMAKR";
		m2.price = 101.00;

//		System.out.println(m2.hashcode());
//
//		System.out.println(m.hashcode());
		System.out.println(m.hashcode());
		System.out.println(m2.hashcode());

		System.out.println(m.hashcode("OMAKR"));
	}
}

class Manik_tech {
	int id;
	String name;
	double price;

	public int hashcode() {

		return Objects.hash(this.id);

	}

	public int hashcode(String name) {
		return Objects.hash(this.name);
	}
}

//		Object[] obj = new Object[2];
//		obj[0]=this.id;
//		obj[1]= this.price;
//		return Arrays.hashCode(obj);
