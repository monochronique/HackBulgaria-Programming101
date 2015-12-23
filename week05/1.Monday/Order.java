package week5_monday;

import java.util.HashMap;

public class Order {

	HashMap<Integer, Integer> products = new HashMap<>();

	Order(HashMap<Integer, Integer> pr) {
		products = pr;
	}

	public HashMap<Integer, Integer> getProducts() {
		return products;
	}

	public void addItem(Integer productID, Integer quantity) {
		products.put(productID, quantity);
	}

}
