package Genric;

public class Genric_02 {

	public static void main(String[] args) {
	

		Iadd add = new Integeradder();
		add.add("= : ", "Vishal");
	}

}


 interface Iadd
{
	void add (String i,String j);
}
 
 class Integeradder implements Iadd
 {
	public void add(String i ,String j)
	 {
		 System.out.println(i+j);
	 }
 }