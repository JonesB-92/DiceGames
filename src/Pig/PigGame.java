package Pig;


public class PigGame {
    public static void main(String[] args) {
        printRules();
        System.out.println();

        Player player1 = new Player("player1");
        Player player2 = new Player("Player2");
        System.out.println("Playing Pigs \n");

        while (player1.getTotalPoints() < 100 && player2.getTotalPoints() < 100) {
            System.out.println("----- Player1's turn -----");
            System.out.println("You have " + player1.getTotalPoints() + " points.");
            System.out.println("Press enter to roll the die.");
            player1.playRound();
            System.out.println("Player1 has " + player1.getTotalPoints() + " total points.");
            System.out.println();

            System.out.println("----- Player2's turn -----");
            System.out.println("You have " + player2.getTotalPoints() + " points.");

            System.out.println("Press enter to roll the die.");
            player2.playRound();
            System.out.println("Player2 has " + player2.getTotalPoints() + " total points.");
            System.out.println();
        }

        printResults(player1);
        System.out.println();
        printResults(player2);
        System.out.println();

        if (player1.getTotalPoints() > player2.getTotalPoints()) {
            System.out.println("Congratulations, " + player1.getName() + ", you win!!! " +
                    "You won with " + (player1.getTotalPoints() - player2.getTotalPoints()) + " points!!");
            System.out.println();
        } else if (player1.getTotalPoints() < player2.getTotalPoints()) {
            System.out.println("Congratulations, " + player2.getName() + ", you win!!! " +
                    "You won with " + (player2.getTotalPoints() - player1.getTotalPoints()) + " points!!");
            System.out.println();
        }
        System.out.println("Thank you for playing Pigs.");
    }

    public static void printResults(Player player) {
        System.out.println("Results");
        System.out.println("-------");
        System.out.println(player.getName() + " has " + player.getTotalPoints() + " points!");
    }

    public static void printRules() {
        System.out.println("=====================================================");
       /* System.out.println("Rules of Pigs:");
        System.out.println(
        "Roll 1 die. Første spiller kaster en terning, indtil han enten kaster 1 eller beslutter sig for at stoppe. " +
        "Hvis han slår en 1’er, får han ingen point i denne runde. Hvis han beslutter sig for at stoppe, inden han slår en 1’er," +
        " lægges summen af alle hans kast i denne runde sammen med hans samlede antal point, og turen går videre til næste spiller." +
        "Derefter skiftes spillerne til at kaste. Den første spiller, der samlet når 100point, har vundet.");
        System.out.println("=====================================================");*/
    }

}

