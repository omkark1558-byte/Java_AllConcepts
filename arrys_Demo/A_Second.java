package arrys_Demo;

public class A_Second {

	public static void main(String[] args) {
		
		int [] arr=new int[16];
		
		arr[15]=15;
		{
			
		//	System.out.println(arr[1]);
			for(int i=0;i<arr.length;i++)
			{
				
			arr[i]=100*i;
			
			}
			
			System.out.println(arr[5]);
		}
	}
}
