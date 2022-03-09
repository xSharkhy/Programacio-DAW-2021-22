package aceptaElReto;

import java.util.Scanner;

public class problema151 {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    matrix[i][j] = sc.nextInt();
            boolean identity = true;
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) {
                    if (i == j && matrix[i][j] != 1) {
                        identity = false;
                        break;
                    }
                    if (i != j && matrix[i][j] != 0) {
                        identity = false;
                        break;
                    }
                }
            System.out.println(identity ? "SI" : "NO");
        }
    }
}
