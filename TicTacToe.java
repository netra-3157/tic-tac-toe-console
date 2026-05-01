public class tictactoe {

    // UC4: Convert slot (1–9) to row and column
    public static int[] convertSlotToPosition(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    public static void main(String[] args) {

        int slot = 5; // example input

        int[] position = convertSlotToPosition(slot);

        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
        
    }
}
