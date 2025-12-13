package Collection_logical;

public class Stude
{
	int id;
	String name;
	double price;
	
	public Stude(int id,String name,double price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public String toString()
	{
		return "Stude [ id : " + this.id +", Name : "+ name+ ", Price : " +this.price + " ]";
	}
}