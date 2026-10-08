package RollTwoDice;


import java.util.Scanner;

public class Player {
    private Die die;
    private Die die2;
    private double rollCount;
    private int sumOfAllRolls;
    private int amountOfPairs;
    private int highestSum;
    private int[] amountOfIndividuals = new int [7];
    private double averageOfAllRolls;


    public Player() {
        this.die = new Die();
        this.die2 = new Die();
    }

    public double getRollCount() {
        return rollCount;
    }

    public int getSumOfAllRolls() {
        return sumOfAllRolls;
    }

    public int getAmountOfPairs() {
        return amountOfPairs;
    }

    public int getHighestSum() {
        return highestSum;
    }

    public int[] getAmountOfIndividuals() {
        return amountOfIndividuals;
    }

    public double getAverageOfAllRolls(){
        return averageOfAllRolls;
    }

    public void throwDie() {
        die.roll();
        die2.roll();
        rollCount++;
        sumOfAllRolls += die.getFaceValue() + die2.getFaceValue();
        // - hvor mange gange de to terninger i et kast har vist det samme antal øjne
        if (die.getFaceValue() == die2.getFaceValue()) {
            amountOfPairs++;
        }
        //Det største sum, der er opnået i ét kast med de to terninger,
        int sumOfRolls = die.getFaceValue() + die2.getFaceValue();
        if (sumOfRolls > highestSum) {
            highestSum = sumOfRolls;
        }
        //Antal gange 1’ere, 2’ere, …, 6’ere er forekommet tilsammen i alle kastene
        amountOfIndividuals[die.getFaceValue()]++;
        amountOfIndividuals[die2.getFaceValue()]++;

        //Den gennemsnitlige sum i alle kast.
        averageOfAllRolls = (sumOfAllRolls/rollCount);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Roll?");
        scanner.nextLine();
        boolean finished = false;
        while (!finished) {
            throwDie();
            System.out.printf("Rolling... %d and %d\n", die.getFaceValue(), die2.getFaceValue());
            System.out.println("The sum of the roll is: " + (die.getFaceValue() + die2.getFaceValue()));
            System.out.println("Roll again? (Y/n)");
            String again = scanner.nextLine();
            if (again.toLowerCase().equals("n")) {
                finished = true;
            }
        }
    }

}
