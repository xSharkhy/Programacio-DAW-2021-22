package unitatDidactica_04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UD04_Extrav1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new UD04_Extrav1().menu();
    }

    private void menu() {
        System.out.println("Introduce las dimensiones de la matriz:");
        final int length = Integer.parseInt(sc.nextLine());
        int[][] matriz1 = new int[length][length];
        int[][] matriz2 = new int[length][length];
        int[][] matrizRes = new int[length][length];

        byte option;
        do {
            System.out.println("""
                    ¿Que quieres hacer con las matrices?
                    1.- Randomizar matrices.
                    2.- Imprimir matrices.
                    3.- Sumar matrices.
                    4.- Restar matrices.
                    5.- Multiplicar matrices.
                    6.- Multiplicar una matriz por un escalar.
                    7.- Dividir matrices.
                    8.- Matriz traspuesta.
                    9.- Matriz inversa.
                    10.- Potencia de la matriz.
                    11.- Salir.""");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> randomizeMatrix(matriz1, matriz2, matrizRes);
                case 2 -> printMatrix(length, matriz1, matriz2, matrizRes);
                case 3 -> addMatrix(length, matriz1, matriz2, matrizRes);
                case 4 -> subMatrix(length, matriz1, matriz2, matrizRes);
                //case 5 -> multMatrix(length, matriz1, matriz2, matrizRes);
                //case 6 -> scalMatrix(length, matriz1, matriz2, matrizRes);
                //case 7 -> divMatrix(length, matriz1, matriz2, matrizRes);
                case 8 -> trasposeMatrix(length, matriz1, matriz2, matrizRes);
                case 9 -> inverseMatrix(length, matriz1, matriz2, matrizRes);
                //case 10 -> powerMatrix(length, matriz1, matriz2, matrizRes);
                case 11 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);
    }

    private static void trasposeMatrix(int length, int[][] matriz1, int[][] matriz2, int[][] matrizRes) {

    }

    private static void inverseMatrix(int length, int[][] matriz1, int[][] matriz2, int[][] matrizRes) {

    }

    private static void randomizeMatrix(int[][] matriz1, int[][] matriz2, int[][] matrizRes) {
        for (int[] ints : matriz1) Arrays.setAll(ints, j -> (int) (new Random().nextDouble() * 100));
        for (int[] ints : matriz2) Arrays.setAll(ints, j -> (int) (new Random().nextDouble() * 100));
        for (int[] ints : matrizRes) Arrays.fill(ints, 0);
    }

    private static void addMatrix(int length, int[][] matriz1, int[][] matriz2, int[][] matrizSuma) {
        for (int i = 0; i < length; i++)
            for (int j = 0; j < length; j++)
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
    }

    private static void subMatrix(int length, int[][] matriz1, int[][] matriz2, int[][] matrizSuma) {
        for (int i = 0; i < length; i++)
            for (int j = 0; j < length; j++)
                matrizSuma[i][j] = matriz1[i][j] - matriz2[i][j];
    }

    private static void printMatrix(int lenght, int[][] matriz1, int[][] matriz2, int[][] matrizRes) {
        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < lenght; j++) {
                if (j == 0) System.out.printf("|%3d", matriz1[i][j]);
                if (j > 0 && j < lenght - 1) System.out.printf(" %3d ", matriz1[i][j]);
                if (j == lenght - 1) System.out.printf("%3d |     ", matriz1[i][j]);
            }
            for (int j = 0; j < lenght; j++) {
                if (j == 0) System.out.printf("|%3d", matriz2[i][j]);
                if (j > 0 && j < lenght - 1) System.out.printf(" %3d ", matriz2[i][j]);
                if (j == lenght - 1) System.out.printf("%3d |", matriz2[i][j]);
            }
            for (int j = 0; j < lenght; j++) {
                if (j == 0) System.out.printf("| %3d", matrizRes[i][j]);
                if (j > 0 && j < lenght - 1) System.out.printf(" %3d ", matrizRes[i][j]);
                if (j == lenght - 1) System.out.printf("%3d |", matrizRes[i][j]);
            }
            System.out.println();
        }
    }
}
