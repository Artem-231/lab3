package character.aborigen;

import character.abstraction.Aborigen;

public class Atatat extends Aborigen {
    public Atatat(String tribeName) {
        super(tribeName);
    }

    @Override
    public void fight() {
        System.out.println("Воин из " + getTribeName() + " яростно сражается.");
    }

    @Override
    public void speak() {
        System.out.println("Воин из " + getTribeName() + " говорит на их родном языке.");
    }

    @Override
    public void move() {
        System.out.println("Воин из " + getTribeName() + " движется с ловкостью.");
    }
}
