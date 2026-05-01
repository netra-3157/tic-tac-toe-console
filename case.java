class case {
    // UC10: Check for Draw
    public static boolean isDraw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // Empty cell found → not draw
                }
            }
        }
        return true; // No empty cells → draw
    }

    // Optional: Print board (for testing)
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
        }
    }

    public static void main(String[] args) {

        // Example board (full board → draw)
        char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
        };

        printBoard(board);

        if (isDraw(board)) {
            System.out.println("Game is a Draw!");
        } else {
            System.out.println("Game is not a Draw.");
        }
    }
}