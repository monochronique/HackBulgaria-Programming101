package RequestPakage;

import DroneDeliveryPakage.Warehouse;

import java.util.Scanner;

/**
 * Created by georgipavlov on 23.02.16.
 */
public class Request {
    private Warehouse currentWarehouse;
    private Scanner scanner;

    public Request(Warehouse currentWarehouse){
     this.currentWarehouse = currentWarehouse;
        scanner = new Scanner(System.in);
    }

    public void addToWarehouse(){
        FactoryForDelivery factory = new FactoryForDelivery();

        System.out.println("Enter operation (1)delivery (2)supply");



    }
}
