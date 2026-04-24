import java.util.Random;
import java.util.Scanner;

public class toe{

    // UC5: Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ');
    }

    // UC4: Slot → row & col
    public static int[] getRowCol(int slot) {
        slot = slot - 1;
        return new int[]{slot / 3, slot % 3};
    }

    // UC6: Update board
    public static void updateBoard(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // UC7: Computer move
    public static void computerMove(char[][] board) {
        Random rand = new Random();
        while (true) {
            int slot = rand.nextInt(9) + 1;
            int[] pos = getRowCol(slot);
            if (isValidMove(board, pos[0], pos[1])) {
                updateBoard(board, pos[0], pos[1], 'O');
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    // UC8: Check win
    public static boolean checkWin(char[][] b, char s) {
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == s && b[i][1] == s && b[i][2] == s) return true;
            if (b[0][i] == s && b[1][i] == s && b[2][i] == s) return true;
        }
        if (b[0][0] == s && b[1][1] == s && b[2][2] == s) return true;
        if (b[0][2] == s && b[1][1] == s && b[2][0] == s) return true;
        return false;
    }

    // Check draw
    public static boolean isDraw(char[][] board) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }

    // Display board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        boolean gameOver = false;
        char currentPlayer = 'X';

        while (!gameOver) {

            printBoard(board);

            if (currentPlayer == 'X') {
                System.out.print("Enter slot (1-9): ");
                int slot = sc.nextInt();

                int[] pos = getRowCol(slot);

                if (isValidMove(board, pos[0], pos[1])) {
                    updateBoard(board, pos[0], pos[1], 'X');
                } else {
                    System.out.println("Invalid move! Try again.");
                    continue;
                }

            } else {
                computerMove(board);
            }

            // Check win
            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println(currentPlayer + " wins!");
                gameOver = true;
            }
            // Check draw
            else if (isDraw(board)) {
                printBoard(board);
                System.out.println("It's a draw!");
                gameOver = true;
            }

            // Switch turn
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        sc.close();
    }
}