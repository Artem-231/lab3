package location.island.abstraction;

import location.abstaction.Island;
import location.enumeration.LocationEnum;

public abstract class Ship extends Island {
    private double speed;
    private int capacity;

    public Ship(String placeName, LocationEnum location, String legendaryLevel, double speed, int capacity) {
        super(placeName, location, legendaryLevel);
        this.speed = speed;
        this.capacity = capacity;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public abstract void explore();

    public abstract void visit();

    public abstract void exist();
}