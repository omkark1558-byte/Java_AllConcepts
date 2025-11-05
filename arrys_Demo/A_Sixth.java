package arrys_Demo;

public class A_Sixth {

	public static void main(String[] args) {
		 
		int[][] arr=new int[3][3];
		int counter=1;
		
		for(int i=0;i<arr.length;i++)
		{	
			for(int j=0;j<arr.length;j++)
			{
			int k=0;
			while(k< arr[i].length-(i+1))
			{
				arr[i][k]=0;
				k++;
			}
			
			arr[i][j]=counter;
			counter++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
