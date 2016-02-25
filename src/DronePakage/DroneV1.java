package DronePakage;

import DroneDeliveryPakage.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;


public class DroneV1 extends Thread {




    private long uniqueID;
    private long batteryUnits = 2000;
    private int weightUnits = 500;
    private int chargingRatePM = 5;
    private  int totalTime;
    private Order order;
    private List<Order> ordersToDeliver;
    public List<OpenWindow> openWindows;



    public DroneV1() {
        uniqueID = NEXT_ID.incrementAndGet();
        ordersToDeliver = new CopyOnWriteArrayList<>();
        openWindows = new CopyOnWriteArrayList<>();

        this.start();
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    // за да се връща уникално ИД всеки път и да се запазва в uniqueID
    private static AtomicLong NEXT_ID = new AtomicLong(0);

    // два буулеана за да знае треда в кой цикъл да влезе (дали да работи или да
    // се зарежда в хранилището (опашката)
    // няма нужда да са volatile, защото всеки дрон си има отделни boolean-и и
    // няма да се объркат
    boolean isWorking = false;
    boolean isInQueue = false;

    // функции за задаване на моментно състояние на дрона.
    public void setToWorking() {
        this.isWorking = true;
        this.isInQueue = false;
    }

    public void setToInQueue() {
        this.isInQueue = true;
        this.isWorking = false;
    }

    // време, което се задава чрез поръчка и дрона започва да работи в while-а
    // (изисква се също да се извика setToWorking(), за да започне работа
    private long distanceUnitsForDelivery = 0;

    public void setDistanceUnitsForDelivery(long distance) {
        distanceUnitsForDelivery = distance;
    }

    public long getRemainingDistanceUnitsForDelivery() {
        return distanceUnitsForDelivery;
    }

    // функции за батерията
    public void setBatteryUnits(long BU) {
        batteryUnits = BU;
    }

    public long getBatteryUnits() {
        return batteryUnits;
    }



    // разни помощни функции
    public long getID() {
        return this.uniqueID;
    }

    public int getWeightUnits() {
        return weightUnits;
    }

    public int getChargingRatePM() {
        return chargingRatePM;
    }

    public void run() {
        while (true) {

            while (isInQueue) {

                while (batteryUnits < 2000) {
                    // Все едно зареждане на една минута
                    batteryUnits += getChargingRatePM();
                    try {
                        Thread.sleep(1000*60);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            while (isWorking) { // изпълнява по 1 DU на цикъл. Намаля батерията
                // и намаля разстоянието.
                while (getRemainingDistanceUnitsForDelivery() > 0) {
                    long remainingBU = getBatteryUnits() - getChargingRatePM();
                    setBatteryUnits(remainingBU);
                    long remainingDU = getRemainingDistanceUnitsForDelivery() - 1;
                    setDistanceUnitsForDelivery(remainingDU);

                }
            }

        }
    }
}
