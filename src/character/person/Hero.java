package character.person;

import character.Character;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return level == hero.level && Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

}