package week5_monday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class ShopInventory {

	Vector<Product> l = new Vector<Product>();
	
	ShopInventory(){};
	
	ShopInventory(Vector<Product> products) {
		l = products;
	}
	
	public String toString()
	{
		String ans = "";
		for (int i = 0; i < l.size(); i++)
		{	
			ans += "Item number " + (i + 1) + "\r\n";
			ans += l.get(i).toString();
			if (i != l.size() - 1) ans += "\r\n";
		}
		
		return ans;
	}
	
	
	public void addProduct(Product newProduct) {
		l.add(newProduct);
	}

	public double Audit() {
		double ans = 0;
		for (int i = 0; i < l.size(); i++) {
			ans += l.get(i).getPriceAfterTax() * l.get(i).getQuantity();
		}

		return ans;
	}

	public double RequestOrder(Order or) throws NotAvailableInInventoryException {
		HashMap<Integer, Integer> products = or.getProducts();
		int ID = 0;
		double amount = 0;
		@SuppressWarnings("unchecked")
		ArrayList<Integer> productIDs = (ArrayList<Integer>) products.keySet();
		ArrayList<Integer> productQuantity = (ArrayList<Integer>) products.values();
		for (int i = 0; i < productIDs.size(); i++) {
			ID = productIDs.get(i);
			int j = 0;
			while (j < l.size() && l.get(i).getProductID() != ID)
				j++;
			if (j == l.size()) {
				throw new NotAvailableInInventoryException("No such item in inventory!");
			} else if (l.get(j).getQuantity() < productQuantity.get(i)) {
				throw new NotAvailableInInventoryException("Not enough items in inventory!");
			}

			else
				amount += l.get(j).getPriceAfterTax() * productQuantity.get(i);

		}

		return amount;

	}
}
