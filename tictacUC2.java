import java.util.Scanner;

public class TicTacToe{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int slot;

        // Ask user until valid input (1–9)
        while (true) {
            System.out.print("Enter a slot number (1-9): ");
            slot = scanner.nextInt();

            if (slot >= 1 && slot <= 9) {
                break;
            } else {
                System.out.println("Invalid input! Please enter a number between 1 and 9.");
            }
        }

        System.out.println("You selected slot: " + slot);

        scanner.close();
    }
}