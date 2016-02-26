package DronePakage;

import ProjectInterfaces.DroneInterface;

/**
 * Created by georgipavlov on 24.02.16.
 */
public class Drone extends Thread implements DroneInterface {
    private int id;
    private int battery;
    private  double capacity;
    private double chargingRate;
    private boolean loop = true;

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    public Drone(int id, int battery, double capacity, double chargingRate) {
        this.id = id;
        this.battery = battery;
        this.capacity = capacity;
        this.chargingRate = chargingRate;
    }

    public int getIdDrone() {
        return id;
    }

    public int getBattery() {
        return battery;
    }

    public double getCapasity() {
        return capacity;
    }

    public double getChargingRate() {
        return chargingRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setCapasity(double capasity) {
        this.capacity = capasity;
    }

    public void setChargingRate(double chargingRate) {
        this.chargingRate = chargingRate;
    }

    @Override
    public void run() {
        while (loop){

        }
    }
}
