package DroneDeliveryPakage;

import java.util.HashMap;

/**
 * Created by georgipavlov on 23.02.16.
 */
public class Warehouse {
    private HashMap<Product, Integer> warehouse;

    public Warehouse() {
        warehouse = new HashMap<>();

    }

    // добавя продукт в склада. Ако го има вече, му се увеличава количеството.
    public void addProduct(Product p,int quantity) {
        if (warehouse.containsKey(p)) {
            int times = warehouse.get(p) + quantity;
            warehouse.put(p, times);
        } else {
            warehouse.put(p, quantity);
        }
    }

    // Проверява дали този продукт го има в поне даденото количество
    public synchronized boolean containProductNtimes(Product p, int times) {
        if (warehouse.containsKey(p)) {
            if (warehouse.get(p) >= times) {
                return true;
            }
        }
        return false;
    }
    // Взима т.е. маха от опашката този продукт колкото количество е въведено.
    // Използва се след проверката
    // дали го има в warehouse-а

    public synchronized void getProductNtimes(Product p, int times) {
        if (warehouse.get(p) > times) {
            int quantityLeft = warehouse.get(p) - times;
            warehouse.put(p, quantityLeft);
        } else
            warehouse.remove(p);
    }
}
