package arrys_Demo;

public class New_01 {

	public static void main(String[] args) {
		 
		
		int[] Arr= {25,35,45,55,65,75,80,95,105};

//		int Num=Integer.MAX_VALUE;
//		int Second=Integer.MAX_VALUE;
//		int Third=Integer.MAX_VALUE;
//		int Fourth=Integer.MAX_VALUE;

		int Num=0;
		int Second=0;
		int Third= 0;
		int Fourth=0;
		int Fifth=0;
		{
			for(int i=0;i<Arr.length;i++)
			{
				if(Arr[i]>Num)
				{
					Fifth=Fourth;
					Fourth=Third;
					Third=Second;
					Second=Num;
					Num=Arr[i];
					
					System.out.print(Num +" ");
					System.out.println();
				}
				if(Arr[i]>Second && Arr[i]<Num)
				{
					Third=Second;
					Second=Arr[i];
				}
				if(Arr[i]>Third && Arr[i]<Second)
				{ 
					Fourth=Third;
					Third=Arr[i];
				}
				if(Arr[i]>Third && Arr[i]<Fourth)
				{
					Fifth=Fourth;
					Fourth=Arr[i];
			}
				if(Arr[i]>Fourth && Arr[i]<Fifth)
				{
					Fifth=Arr[i];
				}
		}
//			System.out.println("Highest :"+Num);
			
//			System.out.println();		
			
			System.out.println("First V:"+Num);
			
			System.out.println("Second V:"+Second);
			
			System.out.println("Third V:"+Third);
		
			System.out.println("Fourth v:"+ Fourth);
			
			System.out.println("Fifth V:"+Fifth);
		}
	}
}
