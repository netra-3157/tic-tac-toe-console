public class tic {

    // UC5: Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Boundary check (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid move: Out of bounds");
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != ' ') {
            System.out.println("Invalid move: Cell already occupied");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        int row = 1;
        int col = 1;

        if (isValidMove(board, row, col)) {
            System.out.println("Move accepted");
        } else {
            System.out.println("Move rejected");
        }
    }
}