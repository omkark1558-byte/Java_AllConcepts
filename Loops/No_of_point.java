package Loops;

public class No_of_point {
	
	public static void main(String[] args) {
	
		double sum=0;
		
		for(double num=1.0; num<=100; num++)
		{
			if(num%14.5==0)
			{
				System.out.println(sum);
				sum=sum+num;
				System.out.println("---");
				
			}
		}
		System.out.println(sum);
	}
}