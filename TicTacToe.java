import java.util.Scanner;

public class TicTacToe {

    static Scanner sc = new Scanner(System.in);

    // UC3: Get player input
    public static int getPlayerMove() {
        int slot;

        while (true) {
            System.out.print("Enter slot (1-9): ");
            slot = sc.nextInt();

            if (slot >= 1 && slot <= 9) {
                return slot;
            } else {
                System.out.println("Invalid input! Try again.");
            }
        }
    }
}