package Loops;

public class PrimeNo {

	public static void main(String[] args) {
		
		
		
		
		for(int i = 2; i< 20;i++) {
			boolean flag = true;
			
			for(int j = 2; j< i ;j++) {
				if(i % 2 == 0) {
					flag = false;
				}
			}
			if(flag == true) {
				System.out.println("Prime No " + i);
			}
		}
		
		
		}
 }