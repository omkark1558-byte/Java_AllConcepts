package Collection_logical;

// import java.util.*;

public class Logical_13 {

	public static void main(String[] args) {

		String s = "JAVA";
		String s2 = new String("JAVA");

		System.out.println(s.equals(s2));
		System.out.println("1 HashCode : " + s.hashCode());

		System.out.println("2 HashCode : " + s2.hashCode());
	}
}