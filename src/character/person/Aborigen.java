package character.person;

import character.Character;

import java.util.Objects;

public abstract class Aborigen implements Character {
    private String tribeName;

    public Aborigen(String tribeName) {
        this.tribeName = tribeName;
    }

    public String getTribeName() {
        return tribeName;
    }

    public void setTribeName(String tribeName) {
        this.tribeName = tribeName;
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
        Aborigen aborigen = (Aborigen) o;
        return Objects.equals(tribeName, aborigen.tribeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tribeName);
    }

    @Override
    public String toString() {
        return "Aborigen{" +
                "tribeName='" + tribeName + '\'' +
                '}';
    }
}