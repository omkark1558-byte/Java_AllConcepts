package arrys_Demo;

public class A_Third {

	public static void main(String[] args) {
		 
		
		int Counter=0;
		
		int[] People=new int[1500];
		{
			for(int i=0;i<1500;i++)
			{
				if(i==0)
				{
					continue;
					
				} else if(i%50==0)
					
			{
				 System.out.println(" "+i);
			}
				People[i]=i;
			}
			// int[] educated=new int[Counter];
				
				System.out.println("Counter ::"+Counter);
			}			
		}
	}
