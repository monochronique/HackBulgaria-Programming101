package week5_monday;

public class mainWeek5 {

	public static void main(String[] args) {
		
		ShopInventory shop = new ShopInventory();
		CountryVatTax country = new CountryVatTax(4, 0.20, true);
		Product prod = new Product(52.70, country, "dildo", 4, 22);
		shop.addProduct(prod);
		System.out.println(shop);
		System.out.println(shop.Audit());
		
		
	}

}
