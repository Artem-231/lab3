package location.island.abstraction;

import location.abstaction.Island;
import location.enumeration.LocationEnum;

public abstract class Forest extends Island {
    private boolean dense;
    private int square;

    public Forest(String placeName, LocationEnum location, String legendaryLevel, boolean dense, int square) {
        super(placeName, location, legendaryLevel);
        this.dense = dense;
        this.square = square;
    }

    public boolean isDense() {
        return dense;
    }

    public void setDense(boolean dense) {
        this.dense = dense;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }
}