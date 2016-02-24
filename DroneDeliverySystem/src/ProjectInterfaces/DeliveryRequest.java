package ProjectInterfaces;

import DroneDeliveryPakage.Warehouse;

import java.util.Scanner;

/**
 * Created by georgipavlov on 23.02.16.
 */
public interface DeliveryRequest {
     void startOperation(Scanner scanner, Warehouse warehouse);

}
