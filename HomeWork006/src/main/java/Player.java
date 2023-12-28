import java.util.Random;

public class Player {
    int numberOfDoor;
    boolean strategyChangeChoice;
    private int quantityOfDoor;

    public void setQuantityOfDoor(int quantityOfDoor) {
        this.quantityOfDoor = quantityOfDoor;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setStrategyChangeChoice(boolean strategyChangeChoice) {
        this.strategyChangeChoice = strategyChangeChoice;
    }

    public void firstChoiceDoor(int quantityOfDoor) {
        numberOfDoor = new Random().nextInt(quantityOfDoor);
    }

    public void secondChoiceDoor(int moderatorDoor) {
        int firstChoice = numberOfDoor;
        int secondChoice = firstChoice;
        if (strategyChangeChoice) {
            boolean finishChoice = false;
            Random random = new Random();
            while (!finishChoice) {
                secondChoice = random.nextInt(quantityOfDoor);
                if (secondChoice!=firstChoice && secondChoice!=moderatorDoor)
                    finishChoice=true;
            }
        }
        numberOfDoor = secondChoice;
    }

}
