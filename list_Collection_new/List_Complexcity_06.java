package list_Collection_new;

public class List_Complexcity_06 {

	public static void main(String[] args) {
	
		
		int[] arr = {3,6,8,10,12,15};
		
		int key = 15;
		
		boolean found = false;
		
		for(int i = 0; i < arr.length; i++)
		{
				if(arr[i] == key)
				{
					found = true;
					break;
				}
		}
		System.out.println(found ? "Found" : "Not Found");
	}
}
