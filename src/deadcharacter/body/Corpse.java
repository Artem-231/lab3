package deadcharacter.body;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Corpse corpse = (Corpse) obj;

        if (decayLevel != corpse.decayLevel) return false;
        if (!identity.equals(corpse.identity)) return false;
        return causeOfDeath.equals(corpse.causeOfDeath);
    }

    @Override
    public int hashCode() {
        int result = identity.hashCode();
        result = 31 * result + causeOfDeath.hashCode();
        result = 31 * result + decayLevel;
        return result;
    }

    @Override
    public String toString() {
        return "Corpse{" +
                "identity='" + identity + '\'' +
                ", causeOfDeath='" + causeOfDeath + '\'' +
                ", decayLevel=" + decayLevel +
                '}';
    }

}