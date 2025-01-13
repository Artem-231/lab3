package deadcharacter.body;

import deadcharacter.DeadCharacter;
import exceptions.CorpseDecayedException;

public abstract class Corpse {
    private String identity;
    private String causeOfDeath;
    private int decayLevel; // Уровень разложения (0 - целый, 100 - полностью разложился)

    public Corpse(String identity, String causeOfDeath) {
        this.identity = identity;
        this.causeOfDeath = causeOfDeath;
        this.decayLevel = 0; // Начальное состояние
    }

    public String getIdentity() {
        if (decayLevel >= 100) {
            throw new CorpseDecayedException(identity + " полностью разложился и не может быть идентифицирован.");
        }
        return identity;
    }

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public void increaseDecay() {
        decayLevel += 20; // Увеличение уровня разложения
        if (decayLevel > 100) {
            decayLevel = 100;
        }
        System.out.println(identity + " разложился на " + decayLevel + "%.");
    }

    public abstract void decay();

    public abstract void lieStill();
}