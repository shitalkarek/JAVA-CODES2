public class multiplication2Matrix {
    public static void main(String[] args) {

        int a[][] = { { 3, 5, 4 }, { 7, 6, 2 } };
        int b[][] = { { 1, 0, 0 }, { 0, 1, 0 } };
        int c[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; i < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] = c[i][j] + a[i][k] + b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
        }
        System.out.println(" ");
    }

}
