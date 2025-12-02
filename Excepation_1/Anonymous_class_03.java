package Excepation_1;

public class Anonymous_class_03 {

	public static void main(String[] args) {
	 
		Car o = new Car()
				{
			public void BMW()
			{
				System.out.println("BMW is Run....In Road...!");
			}
				};
				o.BMW();
	}

}

interface Car
{
	void BMW();
}
