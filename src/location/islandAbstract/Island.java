package location.islandAbstract;

import location.Location;
import location.enumeration.LocationEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class Island implements Location {
    private String placeName;
    private LocationEnum world;
    private String legendaryLevel;

    public Island(String placeName, LocationEnum world, String legendaryLevel) {
        this.placeName = placeName;
        this.world = world;
        this.legendaryLevel = legendaryLevel;
    }

    protected ArrayList<String> Weather  = new ArrayList<>(Arrays.asList("Sunny",
            "Cloudy",
            "Rainy",
            "Windy",
            "Snowy"
    ));

    protected int getRandomWeather(){
        Random random = new Random();
        int index = random.nextInt(6);
        return index-1;
    }

    public String getWeather(){
        return Weather.get(getRandomWeather());
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public LocationEnum getWorld() {
        return world;
    }

    public void setWorld(LocationEnum world) {
        this.world = world;
    }

    public String getLegendaryLevel() {
        return legendaryLevel;
    }

    public void setLegendaryLevel(String legendaryLevel) {
        this.legendaryLevel = legendaryLevel;
    }

    @Override
    public abstract void explore();

    @Override
    public abstract void visit();

    @Override
    public abstract void exist();

    @Override
    public String toString() {
        return "Island{" +
                "placeName='" + placeName + '\'' +
                ", world=" + world +
                ", legendaryLevel='" + legendaryLevel + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = placeName != null ? placeName.hashCode() : 0;
        result = 31 * result + (world != null ? world.hashCode() : 0);
        result = 31 * result + (legendaryLevel != null ? legendaryLevel.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Island island = (Island) obj;

        if (placeName != null ? !placeName.equals(island.placeName) : island.placeName != null) return false;
        if (world != null ? !world.equals(island.world) : island.world != null) return false;
        return legendaryLevel != null ? legendaryLevel.equals(island.legendaryLevel) : island.legendaryLevel == null;
    }

}
