package CrapsNotExtended;

import java.util.Scanner;

public class Player {
    private Die die;
    private Die die2;
    private int points;
    int comeOutRollPoints;
    private int win;
    private int loss;
    private double winLossRatio;


    public Player() {
        this.die = new Die();
        this.die2 = new Die();
    }

    public void throwDie() {
        die.roll();
        die2.roll();
        points = die.getFaceValue() + die2.getFaceValue();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Roll?");
        scanner.nextLine();
        boolean finished = false;
        while (!finished) {
            throwDie();
            comeOutRollPoints = points;
            System.out.printf("Rolling... %d and %d\n", die.getFaceValue(), die2.getFaceValue());

            if (points == 7 || points == 11) {
                System.out.println("You rolled " + points + " in the Come Out Roll. You win!");
                System.out.println("Press enter to go again");
                win++;

            } else if (points == 2 || points == 3 || points == 12) {
                System.out.println("You rolled " + points + " in the Come Out Roll. You lose! Haha, fucking loser!! Go again?");
                loss++;

            } else {
                System.out.println("Your first roll is " + comeOutRollPoints);
                System.out.println("Roll again.");
                while (!finished) {
                    scanner.nextLine();
                    throwDie();
                    System.out.printf("Rolling... %d and %d\n", die.getFaceValue(), die2.getFaceValue());
                    System.out.println("You rolled " + points);

                    if (points == 7) {
                        System.out.println("You hit 7!! You lose!! HAHA xD");
                        finished = true;
                        loss++;
                    } else if (points == comeOutRollPoints) {
                        System.out.println("Your Come Out Roll was " + comeOutRollPoints + "! You win!!!");
                        finished = true;
                        win++;
                    }
                    System.out.println("You have " + win + " wins, and " + loss + " losses");
                }
            }
            String again = scanner.nextLine();

            if (again.toLowerCase().equals("n")) {
                finished = true;
                System.out.println("You have " + win + " wins, and " + loss + "losses");
            }
        }
    }
}

