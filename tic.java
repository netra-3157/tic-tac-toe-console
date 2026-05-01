public class tic {

    // UC9: Check if player has won
    public static boolean checkWin(char[][] b, char p) {

        // check rows and columns
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == p && b[i][1] == p && b[i][2] == p) return true;
            if (b[0][i] == p && b[1][i] == p && b[2][i] == p) return true;
        }

        // check diagonals
        if (b[0][0] == p && b[1][1] == p && b[2][2] == p) return true;
        if (b[0][2] == p && b[1][1] == p && b[2][0] == p) return true;

        return false;
    }

    // simple test
    public static void main(String[] args) {
        char[][] board = {
            {'X','X','X'},
            {'O',' ','O'},
            {' ',' ',' '}
        };

        if (checkWin(board, 'X'))
            System.out.println("X wins");
        else
            System.out.println("No winner");
    }
}
