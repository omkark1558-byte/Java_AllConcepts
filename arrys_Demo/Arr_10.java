package arrys_Demo;

public class Arr_10 {

	public static void main(String[] args) {
 
		int[] arr = {10,11,12,14,15,16};
		
		int sum = 0;
		for(int  x :arr)
		{
			 sum += x;
		}
		System.out.println("sum : " +sum);
		
		Studetns y = new Studetns();
		System.out.println(y.Array[2]);
		
	}

}

class Studetns
{
	int sum = 0;
	int[] Array = {20,30,40,50,60};

	Studetns()
	{
	for(int v : Array)
	{
		sum += v;
	}
}
}