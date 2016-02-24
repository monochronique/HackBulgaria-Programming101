package DataBase;

import DroneDeliveryPakage.Order;
import DroneDeliveryPakage.Orders;
import DroneDeliveryPakage.Product;
import DroneDeliveryPakage.Warehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by georgipavlov on 23.02.16.
 */
public class DB {
    public static Queue<Orders> orders = new ConcurrentLinkedQueue<>();
    public static List<Warehouse> warehouses = new CopyOnWriteArrayList<>();

}
