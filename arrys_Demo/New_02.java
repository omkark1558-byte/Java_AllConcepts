package arrys_Demo;

public class New_02 {

	public static void main(String[] args) {
		
		int[] Arr= {10,40,50,75,65,35};
		int F=0;
		int S=0;
		int T=0;
		{
			for(int i=0;i<Arr.length;i++)
			{
				if(Arr[i]>F)
				{
					T=S;
					S=F;
					F=Arr[i];
				}
				if(Arr[i]>S && Arr[i]<F)
				{
					T=S;
					S=Arr[i];
				}
				if(Arr[i]>S && Arr[i]<T)
				{
					T=Arr[i];
				}
			}
		}
		System.out.println("First :"+F);
		System.out.println("Second :"+S);
		System.out.println("Third :"+T);

	}

}
