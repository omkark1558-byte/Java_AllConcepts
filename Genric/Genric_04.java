package Genric;

public class Genric_04 {

	public static void main(String[] args) {

		Wanted<String, Integer> I = new Wanted1();
		System.out.println("Wanted01 Output: " + I.aroapi("22", "OMKAR"));

		Wanted<String[], String[]> w2 = new Third();

		String[] arr1 = { "OMAKR", "VISHAL" };
		String[] arr2 = { "GENRICS", "PROGRAM" };

		String[] result = w2.aroapi(arr1, arr2);

		System.out.print("Third Out-Put");
		for (String f : result) {
			System.out.print(f + " ");
		}

	}
}

interface Wanted<Y, H> {
	H aroapi(Y N1, Y Age1);
}

class Wanted1 implements Wanted<String, Integer> {
	public Integer aroapi(String N1, String Age1) {
		return N1.length() + Age1.length();
	}
}

class Third implements Wanted<String[], String[]> {
	public String[] aroapi(String[] N1, String[] Age1) {
		String[] result = new String[N1.length + Age1.length];

		int i = 0;

		for (String f : N1)
			result[i++] = f;

		for (String f : Age1)
			result[i++] = f;

		return result;

	}
}