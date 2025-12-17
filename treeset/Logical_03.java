package treeset;
import collection_List_pacakge.Book;
import java.util.*;

public class Logical_03 {

	public static void main(String[] args) {
	
	Book i = new Book(10,"Kajfl",35000.00);
	Book i1 = new Book(20,"Jikar",42000.00);
	Book i2 = new Book(30,"Kiak",47000.00);
	Book i3 = new Book(40,"Jam",45900.00);
	Book i4 = new Book(50,"jety",85000.00);
	Book i5 = new Book(60,"vjan",75000.00);
	
	ArrayList<Book> y = new ArrayList<Book>();
	
	 y.add(i); y.add(i1); y.add(i2); y.add(i3); y.add(i4); y.add(i5);
	 
	 for(Book l : y)
	 {
		 System.out.println(l);
	 }
	 
	 System.out.println(y);
	
	}
}
