package location.islandAbstract;

import location.enumeration.LocationEnum;

public abstract class Village extends Island {
    private int population;
    private String primaryIndustry;

    public Village(String placeName, LocationEnum location, String legendaryLevel, int population, String primaryIndustry) {
        super(placeName, location, legendaryLevel);
        this.population = population;
        this.primaryIndustry = primaryIndustry;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPrimaryIndustry() {
        return primaryIndustry;
    }

    public void setPrimaryIndustry(String primaryIndustry) {
        this.primaryIndustry = primaryIndustry;
    }
}
