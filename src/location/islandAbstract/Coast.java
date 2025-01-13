package location.islandAbstract;

import location.enumeration.LocationEnum;

public abstract class Coast extends Island {
    private double length;

    public Coast(String placeName, LocationEnum location, String legendaryLevel, double length) {
        super(placeName, location, legendaryLevel);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}