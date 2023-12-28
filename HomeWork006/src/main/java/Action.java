import java.util.Random;

public class Action {
    private int quantityOfDoor;
    private int iterations;
    private int playerWins;
    private Door[] doors;
    private Player player;
    private Moderator moderator;

    public Action(int quantityOfDoor, int iterations, Player player) {
        this.quantityOfDoor = quantityOfDoor;
        this.iterations = iterations;
        this.player = player;
        this.player.setQuantityOfDoor(quantityOfDoor);
        doors = new Door[quantityOfDoor];
        moderator = new Moderator(doors);
    }

    public void start() {
        for (int i = 0; i < iterations; i++) {
            shuffle();
//            System.out.println("Двери: " + Arrays.toString(doors));
            player.firstChoiceDoor(quantityOfDoor);
//           System.out.println("Первый выбор игрока " + player.getNumberOfDoor());
            moderator.setFreeDoor(player.getNumberOfDoor());
//            System.out.println("Дверь открытая ведущим: " + moderator.getFreeDoor());
            player.secondChoiceDoor(moderator.getFreeDoor());
//            System.out.println("Второй выбор игрока " + player.getNumberOfDoor());
            checkWin();
//           System.out.println("Победа игрока: " + checkWin());

        }
        double percent = (double) playerWins / iterations * 100;
        if (player.strategyChangeChoice) {
            System.out.printf("Число побед игорка со стратегией изменения выбора %d из %d попыток - %.2f \n", playerWins, iterations, percent);
        } else {
            System.out.printf("Число побед игорка со стратегией без изменения выбора %d из %d попыток - %.2f \n", playerWins, iterations, percent);
        }
    }

    private void shuffle() {
        int numberDoorWithAutomobile = new Random().nextInt(quantityOfDoor);
        for (int i = 0; i < quantityOfDoor; i++) {
            doors[i] = new Door();
            if (i == numberDoorWithAutomobile) {
                doors[i].setAutomobile(true);
            } else {
                doors[i].setAutomobile(false);
            }
        }
    }

    private boolean checkWin() {
        if (doors[player.getNumberOfDoor()].isAutomobile) {
            playerWins++;
            return true;
        }
        return false;
    }


}
