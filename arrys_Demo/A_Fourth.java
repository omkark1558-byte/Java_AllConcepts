package arrys_Demo;

public class A_Fourth {

	public static void main(String[] args) {
		
		String[] name=new String[100];
		
			for(int i=0;i<100;i++)
			{
				name[i]="A"+i;
			}
			for(int i=0;i<name.length;i++)
			{
	
				System.out.print(name[i]+" ");
				
				System.out.println("____<..>___");
			}
			
			for(int i=0;i<100;i++)
			{
				if(i%2==0)
				{
					continue;
					 
				}
				System.out.println(i);
			} 
		}
}