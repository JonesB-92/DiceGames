package CrapsNotExtended;

import java.util.Arrays;

public class CrapsGame {
    public static void main(String[] args) {
        printRules();
        System.out.println();

        Player player = new Player();
        System.out.println("Playing Craps");
        player.play();

        printResults(player);
        System.out.println();

        System.out.println("Thank you for playing Craps.");
    }

    public static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of Craps:");
        System.out.println("Roll 2 dice.\n" +
                "Win instantly if you roll 7 or 11 in the first roll (the Come Out Roll).\n" +
                "Lose instantly if you roll 2, 3, or 12 (\"Craps\").\n" +
                "Any other number (4, 5, 6, 8, 9, 10) becomes the \"Point\"." +
                "If no instant win/loss: The shooter keeps rolling the dice.\n" +
                "Win if the Point number is rolled again before a 7.\n" +
                "Lose if a 7 is rolled before the Point (\"Seven Out\")." +
                "If the shooter wins or loses, a new round starts with a new Come Out Roll.");
        System.out.println("=====================================================");
    }

    public static void printResults(Player player) {
        System.out.println("Results");
        System.out.println("-------");
    }
}

