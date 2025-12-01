package Genric;

public class Genric_01 {

	public static void main(String[] args) {
	
		ObjectAdder<String> uo = new ObjectAdder<String>();
		
		uo.add("100 : ","200 : ");
		
		System.out.println(uo.getinstance("GENRICES MOTHODE..1"));
	}
}

interface Iki<Y>
{
	void add(Y i1, Y i2);
}


class ObjectAdder<Y> implements Iki<Y>{
	
	public void add(Y i1, Y i2) {
		if(i1 instanceof Integer && i2 instanceof Integer)
		{
			int u = (int) i1;
			int o = (int) i2;
			System.out.println(u+o);
		}else if(i1 instanceof String && i2 instanceof String){
			String u = (String)i1;
			String o = (String)i2;
			System.out.println(u+o);
		}
	}
	public int getinstance(Y o){
		if(o instanceof String)
		{
			return((String)o).length();
		}
		
		return 0;
	}
}	
