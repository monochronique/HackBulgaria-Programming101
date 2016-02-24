package DroneDeliveryPakage;


import CoordinatesPakage.PairCoordinates;

/**
 * Created by georgipavlov on 24.02.16.
 */
public class Order {
    private Product product;
    private double time;
    private PairCoordinates coordinates;

    public Order(Product product, double time, PairCoordinates coordinates) {
        this.product = product;
        this.time = time;
        this.coordinates = coordinates;
    }

    public Product getProduct() {
        return product;
    }

    public double getTime() {
        return time;
    }

    public PairCoordinates getCoordinates() {
        return coordinates;
    }
}
