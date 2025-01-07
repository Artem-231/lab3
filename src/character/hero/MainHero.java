package character.hero;

import character.abstraction.Hero;

public class MainHero extends Hero {
    public MainHero(String name, int level) {
        super(name, level);
    }

    @Override
    public void fight() {
        System.out.println(getName() + " доблестно сражается.");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " произносит вдохновляющую речь.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " движется быстро.");
    }
}