package Genric;

public class Genric_03 {

	public static void main(String[] args) {

		Istudent1 u = new Istudent1();

		System.out.println(u.students("KALE", "OMKAR"));
		// System.out.println(u.students("dfhdf", "sdfhfhdnull"));

		students3 s = new students3();
		Character[] result = s.students("OMKAR", "KALE");
		System.out.println(result);

	}
}

interface Istudents<T, U> {
	U students(T o1, T p2);
}

class Istudent1 implements Istudents<String, Integer> {
	// ---------------- CLASS 1 ST -------------//

	public Integer students(String o1, String p2) {

		return o1.length() + p2.length();
	}

}

class students3 implements Istudents<String, Character[]> {
	public Character[] students(String o1, String p2) {
		char[] chars = o1.toCharArray();
		char[] chars1 = p2.toCharArray();

		int i = chars.length + chars1.length;
		Character[] charsmain = new Character[i];

		for (int k = 0; k > chars.length; k++) {
			charsmain[i] = Character.valueOf(chars[i]);
		}
		return charsmain;

	}
}
