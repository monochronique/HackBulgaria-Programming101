package week5_monday;

public class Product {

	private double priceBeforeTax = 0.0;
	private double priceAfterTax = 0.0;
	private CountryVatTax origin = null;
	private String name = "";
	private int quantity = 0;
	private int productID = 0;

	public Product(double priceBeforeTax, CountryVatTax origin, String name, int quantity, int productID) {
		super();
		this.priceBeforeTax = priceBeforeTax;
		this.priceAfterTax = priceBeforeTax + priceBeforeTax * origin.getVATTax();
		this.origin = origin;
		this.name = name;
		this.quantity = quantity;
		this.productID = productID;
	}

	public String toString() {
		String ans = "Price before tax: " + priceBeforeTax + "\r\n" + "Price after tax: " + priceAfterTax + "\r\n"
				+ origin.toString() + "\r\n";
		ans += "Country name: " + name + "\r\n" + "Quantity: " + quantity + "\r\n" + "Product ID: " + productID;

		return ans;
	}

	public double getPriceBeforeTax() {
		return priceBeforeTax;
	}

	public double getPriceAfterTax() {
		return priceAfterTax;
	}

	public CountryVatTax getOrigin() {
		return origin;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getProductID() {
		return productID;
	}

}
