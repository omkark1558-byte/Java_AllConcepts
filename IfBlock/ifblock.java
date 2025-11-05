package IfBlock;

public class ifblock {

	public static void main(String[] args) {

		int age=15;
		int age1=16;
		int age2=17;
		int age3=18;
		
		if (age>=15)
		{
			if(age>=15 && age1>=15 && age2>=15 && age3>=15)
			{
				System.out.println("YES");	
			}
			else
			{
				System.out.println("Don't");
			}
		}
		else
		{
			System.out.println("NO");
		}
			//System.out.println(age < age3 && age < age1 && age2 > age3);
			
			//System.out.println(age>age1);	
	}	
}
