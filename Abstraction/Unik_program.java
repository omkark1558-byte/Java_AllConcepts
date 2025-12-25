package Abstraction;

public class Unik_program {

	public static void main(String[] args) {

		 Asset ass = new Asset("DSK-4545","LTP-555","KSJ");
		 
		 System.out.println(ass);
	}

}

class Asset {
	private String assetId;
	private String assetName;
	private String assetExpiry;

	Asset(String assetId, String assetName, String assetExpiry) {
		this.assetId = assetId;
		this.assetName = assetName;
		this.assetExpiry = assetExpiry;
	}

	public String getassetId() {
		return assetId;
	}

	public void setassetId(String assetId) {
		
		if(assetId == null || assetId.length()!=11)
		{
			this.assetId = null ;
			return;
		}
		String perfix = assetId.substring(0,3);
		if(!(perfix.equals("DSK")|| perfix.equals("LTP")|| perfix.equals("IPH")))
		{
			this.assetId = null;
			return;
		}
		if(assetId.charAt(3)!= '-')
		{
			this.assetId = null;
			return;
		}
		
		char lastChar = assetId.charAt(10);
		if(!(lastChar=='H'|| lastChar == 'L'|| lastChar == 'h' || lastChar == 'l')){
			this.assetId = null ;
			return;
		}
		
		this.assetId = assetId;
	}

	public String getassetName() {
		return assetName;
	}

	public void setassetName(String assetName) {
		this.assetName = assetName;
	}

	public String getassetExpiry() {
		return assetExpiry;
	}

	public void setassetExpiry(String assetExpiry) {
		this.assetExpiry = assetExpiry;
	}
	public String toString()
	{
		return this.assetId + " "+this.assetName+" "+this.assetExpiry;
	}
}
