package location.island.coast;

import location.enumeration.LocationEnum;
import location.islandAbstract.Coast;

public class Beach extends Coast {
    public Beach(String placeName, LocationEnum world, String legendaryLevel, double length) {
        super(placeName, world, legendaryLevel, length);
    }

    @Override
    public void explore() {
        System.out.println("Прогулка по песчаному пляжу.");
    }

    @Override
    public void visit() {
        System.out.println("Посещение прекрасного пляжа.");
    }

    @Override
    public void exist() {
        System.out.println("Пляж представляет собой безмятежную прибрежную зону.");
    }
}
