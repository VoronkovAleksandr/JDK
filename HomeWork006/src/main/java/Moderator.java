import java.util.Random;

public class Moderator {
    private final Door[] doors;

    private int freeDoor;

    public Moderator(Door[] doors) {
        this.doors = doors;
    }

    public int getFreeDoor() {
        return freeDoor;
    }

    public void setFreeDoor(int numberPlayerDoor) {
        boolean finishFreeDoor = false;
        Random random = new Random();
        while (!finishFreeDoor){
            freeDoor = random.nextInt(doors.length);
            if (freeDoor != numberPlayerDoor && !doors[freeDoor].isAutomobile){
                finishFreeDoor = true;
            }
        }
    }
}
