package character.person;

import character.Character;

public abstract class Hero implements Character {
    private String name;
    private int level;

    public Hero(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public abstract void fight();

    @Override
    public abstract void speak();

    @Override
    public abstract void move();
}