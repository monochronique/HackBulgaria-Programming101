package RequestPakage;

import DroneDeliveryPakage.Warehouse;
import ExeptionsPakage.InputExeption;
import ProjectInterfaces.DeliveryRequest;

import java.util.Scanner;

/**
 * Created by georgipavlov on 23.02.16.
 */
public class Request {
    private Warehouse currentWarehouse;
    private Scanner scanner;

    public Request(Warehouse currentWarehouse) {
        this.currentWarehouse = currentWarehouse;
        scanner = new Scanner(System.in);
    }

    public void addToWarehouse() throws InputExeption {
        FactoryForDelivery factory = new FactoryForDelivery();
        DeliveryRequest request;
        System.out.println("Enter operation (1)delivery (2)supply (3)exit");
        boolean loop = true;

        while (loop) {
            int choice;
            String tryNumber = scanner.nextLine();
            choice =  Matcher.returnKey(tryNumber,"in (Enter operation (1)delivery (2)supply)");
            if(choice == 3){
                loop = false;
                continue;
            }
            request = factory.maker(choice);
            request.startOperation(scanner,currentWarehouse);
        }


    }


}
