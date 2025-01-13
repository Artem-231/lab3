package location.island.village;

import location.enumeration.LocationEnum;
import location.islandAbstract.Village;

public class AborigenVillage extends Village {
    public AborigenVillage(String placeName, LocationEnum world, String legendaryLevel, int population, String primaryIndustry) {
        super(placeName, world, legendaryLevel, population, primaryIndustry);
    }

    @Override
    public void explore() {
        System.out.println("Знакомство с деревней аборигенов.");
    }

    @Override
    public void visit() {
        System.out.println("Посещение деревни аборигенов.");
    }

    @Override
    public void exist() {
        System.out.println("Деревня аборигенов существует как объект культурного наследия.");
    }
}
