public class ClassroomSeatingSolution {
    private static final int SIZE_SEATING = 5; 
    private static final String EMPTY_SEAT = "Empty";
    private static String[][] seatingChart = new String[SIZE_SEATING][SIZE_SEATING];

    public static void main(String[] args) {
        initializeSeats();
        System.out.println("Initial seating chart:");
        printSeatingChart();
    }

    public static void initializeSeats() {
        for (int i = 0; i < seatingChart.length; i++) {
            for (int j = 0; j < seatingChart[i].length; j++) {
                seatingChart[i][j] = EMPTY_SEAT;
            }
        }
    }

    public static void assignSeat(int row, int col, String studentName) {
        seatingChart[row][col] = studentName;
    }

    public static void moveStudent(int fromRow, int fromCol, int toRow, int toCol) {
        seatingChart[toRow][toCol] = seatingChart[fromRow][fromCol];
        seatingChart[fromRow][fromCol] = EMPTY_SEAT;
    }

    public static int[] findStudent(String studentName) {
        for (int i = 0; i < seatingChart.length; i++) {
            for (int j = 0; j < seatingChart[i].length; j++) {
                if (seatingChart[i][j].equals(studentName)) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static int getClassSize() {
        int count = 0;
        for (int i = 0; i < seatingChart.length; i++) {
            for (int j = 0; j < seatingChart[i].length; j++) {
                if (!seatingChart[i][j].equals(EMPTY_SEAT)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int getRowCapacity(int row) {
        int count = 0;
        for (int i = 0; i < seatingChart[row].length; i++) {
            if (seatingChart[row][i].equals(EMPTY_SEAT)) {
                count++;
            }
        }
        return count;
    }

    public static void printSeatingChart() {
        for (int i = 0; i < seatingChart.length; i++) {
            for (int j = 0; j < seatingChart[i].length; j++) {
                System.out.print(seatingChart[i][j] + " ");
            }
            System.out.println();
        }
    }
}
