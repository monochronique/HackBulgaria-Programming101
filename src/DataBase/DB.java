package DataBase;

import DroneDeliveryPakage.Order;
import DroneDeliveryPakage.Orders;
import DroneDeliveryPakage.Product;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by georgipavlov on 23.02.16.
 */
public class DB {
    public static Queue<Orders> orders = new ConcurrentLinkedQueue<>();
}
