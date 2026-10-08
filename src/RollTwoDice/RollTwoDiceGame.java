package RollTwoDice;


import java.util.Arrays;

public class RollTwoDiceGame {
    public static void main(String[] args) {
        printRules();
        System.out.println();

        Player player = new Player();
        System.out.println("Playing RollTwoDice.");
        player.play();

        printResults(player);
        System.out.println();

        System.out.println("Thank you for playing RollTwoDice.");
    }

    public static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of RollTwoDice:");
        System.out.println("The player throws two dice as long as he/she wants.");
        System.out.println("=====================================================");
    }

    public static void printResults(Player player) {
        System.out.println("Results");
        System.out.println("-------");
        System.out.println("Roll count: "+ player.getRollCount());
        System.out.println("Sum of rolls: " + player.getSumOfAllRolls());
        System.out.println("Amount of pairs: " + player.getAmountOfPairs());
        System.out.println("The highest sum of all throws: " + player.getHighestSum());
        System.out.println("Amount of same [" + Arrays.toString(player.getAmountOfIndividuals()).substring(4));
        //ELLER
        for (int i = 1; i < player.getAmountOfIndividuals().length; i++) {
            System.out.println("Amount of " + i + "'s: " + player.getAmountOfIndividuals()[i]);
        }
        System.out.println("Average of all rolls: " + player.getAverageOfAllRolls());
    }
}
