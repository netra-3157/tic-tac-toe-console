import java.util.Random;

public class tic {

    static boolean valid(char[][] b, int r, int c) {
        return r >= 0 && r < 3 && c >= 0 && c < 3 && b[r][c] == ' ';
    }

    static int[] pos(int s) {
        s--;
        return new int[]{s / 3, s % 3};
    }

    public static void main(String[] args) {
        char[][] b = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        Random r = new Random();

        while (true) {
            int s = r.nextInt(9) + 1;
            int[] p = pos(s);

            if (valid(b, p[0], p[1])) {
                b[p[0]][p[1]] = 'O';
                System.out.println("Slot: " + s);
                break;
            }
        }

        for (char[] row : b) {
            for (char c : row) System.out.print(c + " | ");
            System.out.println();
        }
    }
}