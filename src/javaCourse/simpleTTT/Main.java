package javaCourse.simpleTTT;

import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final String separator = "---------";
        final int tttSize = 3;

        System.out.print("Enter cells: ");
        while (!sc.hasNext("[_OX][_OX][_OX][_OX][_OX][_OX][_OX][_OX][_OX]")) {
            System.out.println("Invalid input!");
            sc.next();
        }
        char[] toCharArray = sc.next().toCharArray();
        char[][] gameMatrix = new char[tttSize][tttSize];
        int k = 0;
        for (int i = 0; i < tttSize; i++) {
            for (int j = 0; j < tttSize; j++) {
                gameMatrix[i][j] = toCharArray[k];
                k++;
            }
        }
        System.out.println(separator);
        for (int i = 0; i < tttSize; i++) {
            for (int j = 0; j < tttSize; j++) {
                if (j == 0) {
                    System.out.print("| " + gameMatrix[i][j] + " ");
                } else if (j == 2) {
                    System.out.print(gameMatrix[i][j] + " |\n");
                } else {
                    System.out.print(gameMatrix[i][j] + " ");
                }
            }
        }
        System.out.println(separator);
    }
}