import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Thread> wiseMen = new ArrayList<>();
        wiseMen.add(new Thread(WiseMan::new));
        wiseMen.add(new Thread(WiseMan::new));
        wiseMen.add(new Thread(WiseMan::new));
        wiseMen.add(new Thread(WiseMan::new));
        wiseMen.add(new Thread(WiseMan::new));
        wiseMen.forEach(Thread::start);
    }

}
