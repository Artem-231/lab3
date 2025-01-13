package location.island.ship;

import location.enumeration.LocationEnum;
import location.islandAbstract.Ship;

public class BrokenShip extends Ship {
    public BrokenShip(String placeName, LocationEnum world, String legendaryLevel, double speed, int capacity) {
        super(placeName, world, legendaryLevel, speed, capacity);
    }

    @Override
    public void explore() {
        System.out.println("Исследую останки разбитого корабля.");
    }

    @Override
    public void visit() {
        System.out.println("Посещение разбитого корабля.");
    }

    @Override
    public void exist() {
        System.out.println("Разбитый корабль существует как обломки.");
    }
}