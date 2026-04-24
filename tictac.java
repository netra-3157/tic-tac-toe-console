import java.util.Random;

public class tictac {

    // Player class
    static class Player {
        String name;
        char symbol;

        Player(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        // Create two players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Create Random object
        Random random = new Random();

        // Assign symbols randomly
        if (random.nextBoolean()) {
            player1.symbol = 'X';
            player2.symbol = 'O';
        } else {
            player1.symbol = 'O';
            player2.symbol = 'X';
        }

        // Decide starting player randomly
        Player startingPlayer;
        if (random.nextBoolean()) {
            startingPlayer = player1;
        } else {
            startingPlayer = player2;
        }

        // Display results
        System.out.println(player1.name + " is assigned: " + player1.symbol);
        System.out.println(player2.name + " is assigned: " + player2.symbol);
        System.out.println("Starting player: " + startingPlayer.name);
    }
}