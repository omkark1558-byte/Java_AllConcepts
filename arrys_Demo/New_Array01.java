package arrys_Demo;

public class New_Array01 {

	public static void main(String[] args) {
 
		int[][] Arr=new int[3][3];
		
		Arr[0][0]=1;
		Arr[0][1]=2;
		Arr[0][2]=3;
		
		Arr[1][0]=5;
		Arr[2][1]=6;
		Arr[2][2]=8;
		
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				System.out.print(Arr[i][j] + " ");
			}
		}
	}
}
