package RequestPakage;

import ProjectInterfaces.DeliveryRequest;

/**
 * Created by georgipavlov on 23.02.16.
 */
public class FactoryForDelivery {


    public DeliveryRequest maker(int choice){
        switch (choice) {
            case 1: {
                return  new Delivery();
            }case 2: {
                return new Supply();
            }
        }
        return null;
    }
}
