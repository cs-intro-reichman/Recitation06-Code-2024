public class MineSweeper {

    public static void main(String[] args) {
    	play();
    }
    public static void play() {
        // Create an In instance to read from standard input
        In in = new In();

        // Take input for number of rows (N)
        System.out.println("Enter the number of rows (N): ");
        int N = in.readInt();

        // Take input for number of columns (M)
        System.out.println("Enter the number of columns (M): ");
        int M = in.readInt();

        // Take input for mine probability
        System.out.println("Enter the probability of a mine (0 to 1): ");
        double probability = in.readDouble();

        // Initialize the game
        int[][] mines = initializeMines(N, M, probability);
        int[][] board = calculateBoard(N, M, mines);

        // Print the game board
        printBoard(N, M, mines, board);
    }
        /**
     * Initializes a Minesweeper board with randomly placed mines based on the given probability.
     * 
     * @param N           Number of rows for the board (excluding padding).
     * @param M           Number of columns for the board (excluding padding).
     * @param probability Probability of a cell containing a mine (value between 0 and 1).
     * @return A 2D array representing the board, where 1 indicates a mine, and 0 indicates no mine.
     */
    public static int[][] initializeMines(int N, int M, double probability) {
        int[][] mines = new int[N + 2][M + 2]; // adds padding for mines calculation
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
                if (Math.random() < probability) {
                    mines[i][j] = 1;
                }
            }
        }
        return mines;
    }
       /**
     * Calculates the number of adjacent mines for each cell in the board.
     * 
     * @param N     Number of rows for the board (excluding padding).
     * @param M     Number of columns for the board (excluding padding).
     * @param mines A 2D array indicating the placement of mines.
     * @return A 2D array representing the board, where each cell contains the count of adjacent mines.
     */
    public static int[][] calculateBoard(int N, int M, int[][] mines) {
        int[][] board = new int[N + 2][M + 2];
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
                board[i][j] = mines[i - 1][j] + mines[i - 1][j - 1] +
                              mines[i - 1][j + 1] + mines[i][j - 1] +
                              mines[i][j + 1] + mines[i + 1][j] +
                              mines[i + 1][j + 1] + mines[i + 1][j - 1];
            }
        }
        return board;
    }
    /**
     * Prints the Minesweeper board, displaying '*' for mines and numbers for adjacent mine counts.
     * 
     * @param N     Number of rows for the board (excluding padding).
     * @param M     Number of columns for the board (excluding padding).
     * @param mines A 2D array indicating the placement of mines.
     * @param board A 2D array representing the board with adjacent mines counts.
     */
    public static void printBoard(int N, int M, int[][] mines, int[][] board) {
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
                String cur = mines[i][j] == 0 ? board[i][j] + "" : "*";
                System.out.print(cur + " ");
            }
            System.out.println();
        }
    }

}
