package deadcharacter.abstraction;

import deadcharacter.DeadCharacter;

public abstract class Corpse implements DeadCharacter {
    private String identity;
    private String causeOfDeath;

    public Corpse(String identity, String causeOfDeath) {
        this.identity = identity;
        this.causeOfDeath = causeOfDeath;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }

    @Override
    public abstract void decay();

    @Override
    public abstract void lieStill();
}