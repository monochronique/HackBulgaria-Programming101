package DeliverySuppyPakage;

import ProjectInterfaces.DeliverySupplyRequest;
import WarehousePakage.Warehouse;
import WarehousePakage.Product;
import WarehousePakage.Order;
import CoordinatesPackage.PairCoordinates;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by georgipavlov on 26.02.16.
 */
public class Delivery implements DeliverySupplyRequest {
	
	private Warehouse warehouse;
	
    @Override
    public void startOperation(Scanner scanner, Warehouse warehouse) {
       this.warehouse = warehouse;
       HashMap<Product, Integer> orderProducts = null;
       PairCoordinates deliverOrderTo = null;
       
       
       
       
       
       
       
       Order order = new Order(deliverOrderTo, orderProducts);
       //To-do create distributor class and handle new orders
       
       //Distributor.recieveOrder(order);
       
    }
}
