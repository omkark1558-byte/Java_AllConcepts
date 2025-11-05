package arrys_Demo;

public class New_03 {

	public static void main(String[] args) {
		 
		
		int[] Arr= {31,32,33,34,45,46,47};
		int Number=0;
		int Sec_H=0;
		int Thir_H=0;
		
		{
			for(int i=0;i<Arr.length;i++)
			{
				if(Arr[i]>Number)
				{
					Thir_H=Sec_H; 
					Sec_H=Number;
					Number=Arr[i];
				}
				
				if(Arr[i]>Sec_H && Arr[i]<Number)
				{
					Thir_H=Sec_H;
					Sec_H=Arr[i];
				}
				
				if(Arr[i]>Thir_H && Arr[i]<Sec_H)
				{
					Thir_H=Arr[i];
				}
			}
			
			System.out.println("First Highest Value :"+Number);
			System.out.println("Second Highest Value :"+Sec_H);
			System.out.println("Third Highest Value :"+Thir_H);
		}

	}
}
