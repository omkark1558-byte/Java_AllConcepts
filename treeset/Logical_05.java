package treeset;
import java.util.*;

public class Logical_05 {

	public static void main(String args[])
	{
		ArrayList<Court> o = new ArrayList<Court>();
		Collections.addAll(o,new Court(10,"NC G",4000));
		Collections.addAll(o, new Court(10,"HCS",5000));
		
		for(Court U : o)
		{
			System.out.println(U);
		}
		System.out.println(o);
		
		
	}
}

class Court implements Comparable<Court>
{
	int court_no;
	String case_name;
	double fees;
	
	Court(int court_no,String case_name,double fees)
	{
		this.case_name = case_name;
		this.court_no = court_no;
		this.fees = fees;
	}
	public String toString()
	{
		return this.case_name+" "+this.court_no+" "+this.fees;
	}
	public int compareTo(Court o)
	{
		return Integer.compare(this.court_no, o.court_no);
	}
}