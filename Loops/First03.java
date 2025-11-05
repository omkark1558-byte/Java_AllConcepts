package Loops;

public class First03 {

	
	public static void main(String[] args) {
		
		int sum=0;
		for(int num=1; num<=100; num++)
		{  
			//sum=sum+num;
			if (num%2==0)
			{
				System.out.println("Even:"+num);
				sum=sum+num;
			}
			else
			{
				System.out.println("ODD :"+num);
			}
		}
	
		System.out.println("Even Summition =" +" "+ sum);
	}
}


/*
 * class First3 {
 * 
 * import java.util.Scanner;
 * 
 * 
 * public static void main(String args[]) {
 * 
 * Scanner src=new Scanner(System.in);
 * 
 * System.out.println("Enter A Name.."); nt Num=sc.nextInt();
 * 
 * 
 * switch (Num) { case 100:
 * 
 * System.out.println("It is Hundred..."); break;
 * 
 * case 200:
 * 
 * System.out.println("It is Two Hundred...."); break;
 * 
 * case 300:
 * 
 * System.out.println("It is Three Hundred...!"); break;
 * 
 * case 400: System.out.println("It is Four Hundred...!"); break;
 * 
 * case 6500: System.out.println("It is six Thousand Five Hundred...56400");
 * break;
 * 
 * default :
 * 
 * System.out.println("It is No Number"); } } } }
 */