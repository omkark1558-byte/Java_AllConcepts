package SquareFit;

public class Logic {

	public static void main(String[] args) {
		
	String name = "Aniket";
	
	StringBuffer gb = new StringBuffer();
	
	for(int i =name.length()-1 ;i < 0;i--) {
		gb.append(gb).charAt(i);
	}
	
	 System.out.println(gb);
	}

}
