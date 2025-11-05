package Datatype;

public class Primtive01 {

	public static void main(String[] args) 
	{
		int[] no=new int[6];
		no[0]=77;
		no[1]=21;
		no[2]=07;
		no[3]=07;
		no[4]=52;
	
		System.out.println("Sum Of All Number's :" + (no[0]+no[1]+no[2]+no[3]+no[4]+no[5]));
		
		
		for(int i=0; i<no.length;i++)
		{
			System.out.printf("%02d\n", no[i]);
		}
	
	System.out.println("**********");
	
	
	String[] you=new String[11];
	you[0]="G";
	you[1]="A";
	you[2]="U";
	you[3]="R";
	you[4]="I";
	you[5]="💕";
	you[6]="O";
	you[7]="M";
	you[8]="K";
	you[9]="A";
	you[10]="R";
	
	
	
	for(int i=0; i<you.length; i++)
	{
 	 if(you[i] !=null)
 	 {
		System.out.print(you[i]);	
 	 }
 	 
	}
	
//	System.out.println(you);
//	System.out.println(you[0]);
	}
}
