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
}
