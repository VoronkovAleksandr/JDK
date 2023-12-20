import java.util.Random;

public class WiseMan {
    private final String name;
    private final Integer thinkTime;
    private final Integer EAT_TIME = 500;

    public WiseMan() {
        name = Thread.currentThread().getName();
        thinkTime = new Random().nextInt(2000);
        for (int i = 0; i < 3; i++) {
            eat();
            think();
        }
    }

    public void eat() {
        System.out.printf("Мудрец %s кушает! \n", name);
        try {
            Thread.sleep(EAT_TIME);
        } catch (InterruptedException e) {
            System.out.printf("Ошибка во время обеда мудреца %s", name);
        }
    }

    public void think(){
        int thinkPeriod = thinkTime/10;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Мудрец %s размышляет ... \n", name);
            try {
                Thread.sleep(thinkPeriod);
            } catch (InterruptedException e) {
                System.out.printf("Ошибка во время размышлений мудреца %s", name);
            }
        }
    }
}
