package RollOneDie;

import java.util.Scanner;

public class Player {
    private Die die;
    private int rollCount;

    public Player() {
        this.die = new Die();
    }

    public int getRollCount() {
        return rollCount;
    }

    public void throwDie() {
        die.roll();
        rollCount++;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Roll?");
        scanner.nextLine();
        boolean finished = false;
        while (!finished) {
            throwDie();
            System.out.printf("Rolling... %d\n", die.getFaceValue());
            System.out.println("Roll again? (Y/n)");
            String again = scanner.nextLine();
            if (again.toLowerCase().equals("n")) {
                finished = true;
            }
        }
    }
}
