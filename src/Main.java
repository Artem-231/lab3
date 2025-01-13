import character.aborigen.Atatat;
import character.hero.MainHero;
import character.aborigen.Villager;
import deadcharacter.body.Corpse;

import exceptions.CorpseDecayedException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.PrintStream;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out) {
            @Override
            public void println(String s) {
                logger.info(s);
            }
        });

        System.setErr(new PrintStream(System.err) {
            @Override
            public void println(String s) {
                logger.error(s);
            }
        });

        // Герои
        MainHero mainHero = new MainHero("Артур", 10);

        // Жители деревни
        Villager villager1 = new Villager("Том", 25, "Фермер");
        Villager villager2 = new Villager("Люси", 22, "Кузнец");

        // Аборигены
        Atatat atatat = new Atatat("Племя Саванны");

        // Труп
        Corpse oldCorpse = new Corpse("Неизвестный Моряк", "Утонул во время кораблекрушения") {
            @Override
            public void decay() {
                System.out.println(getIdentitySafely() + " медленно разлагается.");
            }

            @Override
            public void lieStill() {
                if (getIdentitySafely() == "Идентификация невозможна") {
                    System.out.println(getIdentitySafely() + ", так как труп разложился");
                }
                else {
                    System.out.println("На нем были короткие холщевые штаны, синяя холщевая рубаха и матросская куртка. Ни по каким признакам нельзя было определить его национальность; " +
                            "в карманах у него не оказалось ничего, кроме двух золотых монет и трубки. И, разумеется, последней находке я обрадовался гораздо больше, чем первой.");
                }

            }

            private String getIdentitySafely() {
                try {
                    return getIdentity();
                } catch (CorpseDecayedException e) {
                    System.err.println(e.getMessage());
                    return "Идентификация невозможна";
                }
            }
        };

        // Симулируем разложение
        for (int i = 0; i < 5; i++) {
            oldCorpse.increaseDecay();
            oldCorpse.decay();
        }



        // Начало истории
        System.out.println("Однажды " + mainHero.getName() + " отправился на задание, чтобы спасти жителей деревни, таких как "
                + villager1.getRole() + " и " + villager2.getRole() + ", от таинственной угрозы.");

        mainHero.speak();
        villager1.introduce();
        villager2.introduce();

        System.out.println("Во время путешествия они наткнулись на обломки древнего корабля.");

        System.out.println("Но надо мной или тяготел злой рок, или же люди, что плыли на разбившемся корабле, были обречены на погибель, только мне не суждено было тогда изведать это счастье. " +
                "Так до последнего года моего житья на острове я и не узнал, спасся ли кто нибудь с погибшего корабля. Несколько дней спустя я сделал одно печальное открытие: " +
                "нашел на берегу против того места, где разбился корабль, труп утонувшего юнги.");

        oldCorpse.lieStill();

        System.out.println("После бури наступил полный штиль, и мне очень хотелось попробовать добраться в лодке до корабля. " +
                "Я был уверен, что найду там много такого, что может мне пригодиться. Но собственно не это прельщало меня, а надежда, что " +
                "может быть, на корабле осталось какое-нибудь живое существо, которое я могу спасти от смерти и таким образом скрасить свою печальную жизнь.");

        System.out.println("Эта мысль овладела всей моей душой: я чувствовал, что ни днем, ни ночью не буду знать покоя, пока не попытаюсь добраться в лодке до корабля, " +
                "положившись на волю божию.");

        System.out.println("Импульс, увлекавший меня, был так силен, что я не мог противиться. Я принял его за указание свыше и чувствовал бы угрызения совести, " +
                "если бы не исполнил его.");

        System.out.println("Вдохновленный этим божественным порывом, " + mainHero.getName() + " собрал небольшую команду.");
        mainHero.speak();
        atatat.speak();

        System.out.println("Вместе они отправились исследовать тайны кораблекрушения и вернуть надежду тем, кто остался позади.");
        mainHero.move();
        atatat.move();

        System.out.println("Когда они поднялись на останки корабля, они раскрыли тайны, которые навсегда изменят их судьбу...");
    }
}