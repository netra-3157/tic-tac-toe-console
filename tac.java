import java.util.Random;

public class tac {

    // UC5: Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) return false;
        return board[row][col] == ' ';
    }

    // UC4: Slot → row & col
    public static int[] getRowCol(int slot) {
        slot = slot - 1;
        int row = slot / 3;
        int col = slot % 3;
        return new int[]{row, col};
    }

    // UC6: Update board
    public static void updateBoard(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // UC7: Computer move
    public static void computerMove(char[][] board) {
        Random rand = new Random();
        int slot, row, col;

        while (true) {
            slot = rand.nextInt(9) + 1; // 1–9
            int[] pos = getRowCol(slot);
            row = pos[0];
            col = pos[1];

            if (isValidMove(board, row, col)) {
                updateBoard(board, row, col, 'O');
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
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

        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        computerMove(board);
        printBoard(board);
    }
}