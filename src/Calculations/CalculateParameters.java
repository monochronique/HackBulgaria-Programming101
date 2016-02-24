package Calculations;

import DroneDeliveryPakage.Distributor;
import DroneDeliveryPakage.Order;
import DroneDeliveryPakage.Product;
import DronePakage.DroneMark1;
import ExeptionsPakage.TooManyDrones;

import java.util.ArrayList;

/**
 * Created by georgipavlov on 23.02.16.
 */
public class CalculateParameters {
    private static double orderWeight(Order order){
        ArrayList<Product> products = order.getPakageOrder();
        double weight = 0;
        for (int i = 0; i <products.size() ; i++) {
            weight += products.get(i).getWeightPerQuantity() * order.returnQuantity(products.get(i).getId());
        }
        return weight;
    }

    public static int getNumberOfRequiredDrones(Order order){
        double weight = orderWeight(order);
        double requiredDrones  = weight / DroneMark1.maxCapasity;
        if(requiredDrones > Distributor.NUMBER_OF_DRONES){
            try {
                throw new TooManyDrones();
            } catch (TooManyDrones tooManyDrones) {
                tooManyDrones.printStackTrace();
            }
        }
        if (requiredDrones == (int)requiredDrones)
        {
           return  (int)requiredDrones;
        }else {
            return ((int)requiredDrones)+1;
        }


    }
}
