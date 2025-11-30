package Status_Code;

public class Status_01 {

	public static void main(String[] args) throws Exception
	{
		
		Healthisnotok o = new Healthisnotok("Omkar");
		
		Health.Health_1(20);

	}

}

class Healthcare extends Exception
{
	public Healthcare(String Tr)
	{
		super(Tr);
	}
}
class Healthisnotok extends Exception
{
	public Healthisnotok (String h)
	{
		super(h);
	}
}
class Health
{
	public static void Health_1(int Number) throws Healthcare,Healthisnotok
	{
		
		if(Number >20 && Number < 60)
		{
			throw new Healthcare("Number Is Range Between In 20 < > 60");
		}else if(Number >60 && Number < 85)
		{
			throw new  Healthisnotok("Number Range is the 60 TO 85");
		}
	}
}
