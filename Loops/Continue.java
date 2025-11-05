package Loops;


public class Continue {

	public static void main(String[] args) {
	
		//int you=0;
		
		for(int k=0;k<20;k++)
		{
			if(k%6==0)
			{
				continue; //skip The Current iteration
			}
			System.out.print(k+" ");
		}
	}

}
