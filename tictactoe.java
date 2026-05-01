public class tictactoe {

    // UC5: Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid move: Out of bounds");
            return false;
        }

        if (board[row][col] != ' ') {
            System.out.println("Invalid move: Cell already occupied");
            return false;
        }

        return true;
    }

    // UC6: Update board
    public static void updateBoard(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Display board (for clarity)
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

        int row = 1;
        int col = 2;
        char symbol = 'X';

        if (isValidMove(board, row, col)) {
            updateBoard(board, row, col, symbol);
            System.out.println("Move placed successfully!");
        } else {
            System.out.println("Move rejected!");
        }

        printBoard(board);
    }
}