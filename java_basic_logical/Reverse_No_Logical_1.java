package java_basic_logical;

public class Reverse_No_Logical_1 {
	public static void main(String args[]) {
	
		int num = 123,rev = 0;
		
		while(num != 0)
		{
			int digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		System.out.println("Reseverd :"+ rev);
	}
}