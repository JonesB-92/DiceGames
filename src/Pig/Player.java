package Pig;

import java.util.Scanner;

public class Player {
    private String name;
    private Die die;
    private int totalPoints;

    public Player(String name) {
        this.name = name;
        this.die = new Die();
        this.totalPoints = 0;
    }

    public String getName(){
        return name;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void throwDie() {
        die.roll();
    }

    public void playRound() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int currentPoints = 0;
        boolean isRoundFinished = false;
        while (!isRoundFinished) {
            throwDie();
            System.out.printf("You rolled " + die.getFaceValue() + "\n");
            if (die.getFaceValue() == 1) {
                currentPoints = 0;
                System.out.println("You lose the round and your current points. Next player roll");
                isRoundFinished = true;
            } else {
                currentPoints += die.getFaceValue();
                System.out.println("Current points " + currentPoints);
                System.out.println("Total points " + totalPoints);

                System.out.println("Keep rolling? (Y/n)");
                String again = scanner.nextLine();
                if (again.toLowerCase().equals("n")) {
                    totalPoints += currentPoints;
                    isRoundFinished = true;
                }
            }
        }
    }
}
