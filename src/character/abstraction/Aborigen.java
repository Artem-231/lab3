package character.abstraction;

import character.Character;

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
}