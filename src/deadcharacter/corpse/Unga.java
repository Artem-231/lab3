package deadcharacter.corpse;

import deadcharacter.abstraction.Corpse;

public class Unga extends Corpse {
    public Unga(String identity, String causeOfDeath) {
        super(identity, causeOfDeath);
    }

    @Override
    public void decay() {
        System.out.println("Труп " + getIdentity() + " гниёт.");
    }

    @Override
    public void lieStill() {
        System.out.println("Труп " + getIdentity() + " просто лежит.");
    }
}
