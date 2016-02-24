package week5_monday;

public class VATTaxCalculator {

	CountryVatTax[] countries = null;
	CountryVatTax defaultCountry = null;

	VATTaxCalculator(CountryVatTax[] data) {
		defaultCountry = data[0];
		countries = new CountryVatTax[data.length];
		countries = data;
		countries[0].setAsDefault();
	}

	public double calculateTax(double productPrice, double countryID) throws NotSupportedCountryException {
		CountryVatTax current = null;
		for (int i = 0; i < countries.length; i++) {
			if (countryID == countries[i].getCountryID())
				current = countries[i];

		}
		if (current == null) {
			throw new NotSupportedCountryException("No such country!");
		}

		return productPrice * current.getVATTax();

	}

	public double calculateTax(double productPrice) {
		return productPrice * defaultCountry.getVATTax();
	}

}
