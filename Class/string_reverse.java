package Class;

public class string_reverse {

	public static void main(String[] args) {

		String[] arr = { "OMAKR", "NANADAKSIHOR", "CID" };

		for (String s: arr) {
		 String rev = "";
		 for( int i = s.length() -1; i>=0;i--)
		 {
			 rev = rev + s.charAt(i);
		 }
		 System.out.println(s+" -> " + rev);
		}
	}
}