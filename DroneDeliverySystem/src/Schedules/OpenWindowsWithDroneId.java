package Schedules;

import DronePakage.OpenWindow;

/**
 * Created by georgipavlov on 26.02.16.
 */
public class OpenWindowsWithDroneId {
    private OpenWindow openWindow;
    private int id;

    public OpenWindow getOpenWindow() {
        return openWindow;
    }

    public int getId() {
        return id;
    }

    public OpenWindowsWithDroneId(OpenWindow openWindow, int id) {

        this.openWindow = openWindow;
        this.id = id;
    }
}
