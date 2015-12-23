package week5_monday;

public class CountryVatTax {

	public CountryVatTax(int countryID, double vATTax, boolean isDefault) {
		this.countryID = countryID;
		VATTax = vATTax;
		this.isDefault = isDefault;
	}

	private int countryID = 0;
	private double VATTax = 0.0;
	private boolean isDefault = false;
	
	public String toString()
	{
		String ans = "Country ID: " + countryID + "\r\n" + "VAT tax: " + VATTax + "\r\n" + "Is default? " + isDefault;
		return ans;
	}
	
	public int getCountryID() {
		return countryID;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setAsDefault() {
		isDefault = true;
	}

	public double getVATTax() {
		return VATTax;
	}

	public void setVATTax(double tax) {
		VATTax = tax;
	}
}
