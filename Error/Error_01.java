package Error;

public class Error_01 {

	public static void main(String[] args) {

		 try
		 {
		Bana.Bana();
		 }
		 catch(Error ex)
		 {
			 System.out.println(ex.getMessage());
		 }
		 finally // Finally Block Is Not Excutive in any time And Error is not handel..!
		 {
			 System.out.println("Erro Find And Set output Value Is Null..!");
		 }
	}
}

class Bana
{
	public static void Bana()
	{
		Bana.Bana();
	}
}
