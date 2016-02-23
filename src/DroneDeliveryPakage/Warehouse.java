package DroneDeliveryPakage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by georgipavlov on 23.02.16.
 */
public class Warehouse {
    private Map<Product, Integer> products;

    public Warehouse() {
        products = new ConcurrentHashMap<>();
    }

    // добавя продукт в склада. Ако го има вече, му се увеличава количеството.
    public void addProduct(Product p,int quantity) {
        if (products.containsKey(p)) {
            int times = products.get(p) + quantity;
            products.put(p, times);
        } else {
            products.put(p, quantity);
        }
    }

    // Проверява дали този продукт го има в поне даденото количество
    public synchronized boolean containProductNtimes(Product p, int times) {
        if (products.containsKey(p)) {
            if (products.get(p) >= times) {
                return true;
            }
        }
        return false;
    }
    // Взима т.е. маха от опашката този продукт колкото количество е въведено.
    // Използва се след проверката
    // дали го има в warehouse-а

    public synchronized void getProductNtimes(Product p, int times) {
        if (products.get(p) > times) {
            int quantityLeft = products.get(p) - times;
            products.put(p, quantityLeft);
        } else
            products.remove(p);
    }
}
