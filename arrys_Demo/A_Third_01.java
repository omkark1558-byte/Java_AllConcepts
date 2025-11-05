package arrys_Demo;

public class A_Third_01 {

	public static void main(String[] args) {
	
		String[] Names=new String[20];
		
		for(int i=0; i<20;i++)
		{
				Names[i]=" "+i;
		}
		
		for(int i=0;i<Names.length;i++)
		{
			System.out.println(Names[i]);
		}
	}
}