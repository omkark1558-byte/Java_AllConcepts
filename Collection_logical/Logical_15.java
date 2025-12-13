package Collection_logical;

public class Logical_15 {

	public static void main(String[] args) {

		Study S2 = new Study(01,"Aditya",200.35);
	//	S2.getClass();
		
//		System.out.println(S2.toString());

		System.out.println(S2.toString());
	}

}

class Study {

	int id;
	String name;
	double price;

	public Study(int id , String name, double price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		}
	
	public String toString()
	{
		return "Study [ Id : " + this.id +", Name : "+ this.name + ", Price : "+this.price+ " ]";
	}
 }
