package arrys_Demo;

public class New_04 {

	public static void main(String[] args) {
		 
	int[] arr={11,77,22,33,44};
	
	int N=0;
	int b1=0;
	int b2=0;
	int b3=0;
	
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>N)
			{
				b2=b3;
				b1=b2;
				N=b1;
				N=arr[i];
			}
			if(arr[i]>b1 && arr[i]<N)
			{
				b2=b1;
				b1=arr[i];
			}
			if(arr[i]>b2 && arr[i]<b1)
			{
				
				b3=b2;
				b2=arr[i];
			}
			if(arr[i]>b3 && arr[i]<b2)
			{
	
				b3=arr[i];
			}
		}
		System.out.println("Biggest No :"+N);
		System.out.println("Midel No :"+b1);
		System.out.println("Small No :"+b2);
		System.out.println("Lowest No :"+b3);
		
		}
	}
}
class Bike
{
	
}