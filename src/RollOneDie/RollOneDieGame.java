package RollOneDie;

public class RollOneDieGame {
    public static void main(String[] args) {
        printRules();
        System.out.println();

        Player player = new Player();
        System.out.println("Playing RollOneDie.");
        player.play();

        printResults(player);
        System.out.println();

        System.out.println("Thank you for playing RollOneDie.");
    }

    public static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of RollOneDie:");
        System.out.println("The player throws one die as long as he/she wants.");
        System.out.println("=====================================================");
    }

    public static void printResults(Player player) {
        System.out.println("Results");
        System.out.println("-------");
        System.out.println("Roll count: "+ player.getRollCount());
    }
}
