package location.island.forest;

import location.enumeration.LocationEnum;
import location.islandAbstract.Forest;

public class Jungle extends Forest {
    public Jungle(String placeName, LocationEnum world, String legendaryLevel, boolean dense, int square) {
        super(placeName, world, legendaryLevel, dense, square);
    }

    @Override
    public void explore() {
        System.out.println("Исследуя густые джунгли.");
    }

    @Override
    public void visit() {
        System.out.println("Посещение тропических джунглей.");
    }

    @Override
    public void exist() {
        System.out.println("Джунгли существуют как густой лес.");
    }
}
