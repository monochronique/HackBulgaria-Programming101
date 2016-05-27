package WarehousePakage;

import java.util.HashMap;

import CoordinatesPackage.PairCoordinates;

public class Order {

	private HashMap<Product, Integer> products;
	private PairCoordinates deliverToCoordinates;
	private double expectedDeliveryTime;

	public Order(PairCoordinates coordinates, HashMap<Product, Integer> products) {
		deliverToCoordinates = coordinates;
		this.products = products;

	}

	public double getExpectedDeliveryTime() {
		return expectedDeliveryTime;
	}

	public void setExpectedDeliveryTime(double expectedDeliveryTime) {
		this.expectedDeliveryTime = expectedDeliveryTime;
	}

	public HashMap<Product, Integer> getProducts() {
		return products;
	}

	public PairCoordinates getDeliverToCoordinates() {
		return deliverToCoordinates;
	}

}
