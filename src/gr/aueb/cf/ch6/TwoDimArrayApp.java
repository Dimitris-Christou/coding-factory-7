package gr.aueb.cf.ch6;

public class TwoDimArrayApp {

    public static void main(String[] args) {
        // Κατά γραμμές και στήλες
        int [][] grid = new int[2][3];   // 2 γραμμές και 3 στήλες

        grid [0][0] = 5;
        grid [0][1] = 7;
        grid [0][2] = 4;
        grid [1][0] = 2;
        grid [1][1] = 6;
        grid [1][2] = 8;

        // traverse

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.println(grid [i][j]);
            }
            System.out.println();
        }

        System.out.println();

        // enhanced for
        for (int[] row: grid) {
            for (int el: row) {
                System.out.println(el);
            }
            System.out.println();
        }

    }
}
