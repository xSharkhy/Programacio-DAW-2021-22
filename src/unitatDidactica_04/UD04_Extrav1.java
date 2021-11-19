package unitatDidactica_04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UD04_Extrav1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce las dimensiones de la matriz:");
        final int length = Integer.parseInt(sc.nextLine());
        int[][] matriz1 = new int[length][length];
        int[][] matriz2 = new int[length][length];
        int[][] matrizRes = new int[length][length];

        new UD04_Extrav1().menu(length, matriz1, matriz2, matrizRes);
    }

    private void menu(int length, int[][] matriz1, int[][] matriz2, int[][] matrizRes) {
        byte option;
        do {
            System.out.println("""
                    ¿Que quieres hacer con las matrices? \u262D
                    1.- Randomizar matrices.
                    2.- Imprimir matrices.
                    3.- Sumar matrices.
                    4.- Restar matrices.
                    5.- Multiplicar matrices.
                    6.- Multiplicar una matriz por un escalar.
                    7.- Determinante de una matriz.
                    8.- Matriz inversa.
                    9.- Matriz traspuesta.
                    10.- Dividir matrices.
                    11.- Potencia de la matriz.
                    0.- Salir.""");
            System.out.print("Tu input: ");
            option = Byte.parseByte(sc.nextLine());
            System.out.println();
            switch (option) {
                case 1 -> randomizeMatrix(matriz1, matriz2, matrizRes);
                case 2 -> printMatrix(length, matriz1, matriz2, matrizRes);
                case 3 -> addMatrix(length, matriz1, matriz2, matrizRes);
                case 4 -> subMatrix(length, matriz1, matriz2, matrizRes);
                case 5 -> multMatrix(length, matriz1, matriz2, matrizRes);
                case 6 -> scalMatrix(length, matriz1, matriz2, matrizRes);
                case 7 -> detMatrix(length, matriz1, matriz2, matrizRes);
                case 8 -> inverseMatrix(length, matriz1, matriz2, matrizRes);
                case 9 -> trasposeMatrix(length, matriz1, matriz2, matrizRes);
                case 10 -> divMatrix(length, matriz1, matriz2, matrizRes);
                case 11 -> powerMatrix(length, matriz1, matriz2, matrizRes);
                case 0 -> System.exit(0);
                default -> System.out.println("Mal input! Número fuera de rango.");
            }
        } while (true);
    }

    private static void randomizeMatrix(int[][] matriz1, int[][] matriz2, int[][] matrizRes) {
        for (int[] ints : matriz1) Arrays.setAll(ints, j -> (int) (new Random().nextDouble() * 100));
        for (int[] ints : matriz2) Arrays.setAll(ints, j -> (int) (new Random().nextDouble() * 100));
        for (int[] ints : matrizRes) Arrays.fill(ints, 0);
    }

    private static void printMatrix(int length, int[][] matriz1, int[][] matriz2, int[][] matrizRes) {
        byte option;
        outerloop:
        do {
            System.out.println("¿Qué matriz quieres imprimir?");
            System.out.println("""
                    1.- Matriz A
                    2.- Matriz B
                    3.- Matrices A y B
                    4.- Matriz Resultado
                    5.- las 3 Matrices
                    0.- Salir""");
            System.out.print("Tu input: ");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1:
                    System.out.println();
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            if (j == 0) System.out.printf("| %3d ", matriz1[i][j]);
                            if (j > 0 && j < length - 1) System.out.printf("%3d ", matriz1[i][j]);
                            if (j == length - 1) System.out.printf("%3d |", matriz1[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            if (j == 0) System.out.printf("| %3d ", matriz2[i][j]);
                            if (j > 0 && j < length - 1) System.out.printf("%3d ", matriz2[i][j]);
                            if (j == length - 1) System.out.printf("%3d |", matriz2[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            if (j == 0) System.out.printf("| %3d ", matriz1[i][j]);
                            if (j > 0 && j < length - 1) System.out.printf("%3d ", matriz1[i][j]);
                            if (j == length - 1) System.out.printf("%3d |    ", matriz1[i][j]);
                        }
                        for (int j = 0; j < length; j++) {
                            if (j == 0) System.out.printf("| %3d ", matriz2[i][j]);
                            if (j > 0 && j < length - 1) System.out.printf("%3d ", matriz2[i][j]);
                            if (j == length - 1) System.out.printf("%3d |     ", matriz2[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            if (j == 0) System.out.printf("| %3d ", matrizRes[i][j]);
                            if (j > 0 && j < length - 1) System.out.printf("%3d ", matrizRes[i][j]);
                            if (j == length - 1) System.out.printf("%3d |", matrizRes[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println();
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            if (j == 0) System.out.printf("| %3d ", matriz1[i][j]);
                            if (j > 0 && j < length - 1) System.out.printf("%3d ", matriz1[i][j]);
                            if (j == length - 1) System.out.printf("%3d |     ", matriz1[i][j]);
                        }
                        for (int j = 0; j < length; j++) {
                            if (j == 0) System.out.printf("| %3d ", matriz2[i][j]);
                            if (j > 0 && j < length - 1) System.out.printf("%3d ", matriz2[i][j]);
                            if (j == length - 1) System.out.printf("%3d |     ", matriz2[i][j]);
                        }
                        for (int j = 0; j < length; j++) {
                            if (j == 0) System.out.printf("| %3d ", matrizRes[i][j]);
                            if (j > 0 && j < length - 1) System.out.printf("%3d ", matrizRes[i][j]);
                            if (j == length - 1) System.out.printf("%3d |", matrizRes[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 0:
                    break outerloop;

                default:
                    System.out.println("Mal input! Número fuera de rango.");
            }
        } while (true);
        System.out.println();
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

    private static void multMatrix(int length, int[][] matriz1, int[][] matriz2, int[][] matrizRes) {
        int sigma;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                sigma = 0;
                for (int k = 0; k < length; k++) {
                    sigma += matriz1[i][k] * matriz2[k][j];
                }
                matrizRes[i][j] = sigma;
            }
        }
    }

    private static void scalMatrix(int length, int[][] matriz1, int[][] matriz2, int[][] matrizRes) {
        byte option;
        int escalar = 0;
        outerloop:
        do {
            System.out.println("¿Qué matriz quieres multiplicar por un escalar?");
            System.out.println("""
                    1.- para Matriz A
                    2.- para Matriz B
                    3.- para las Matrices A y B
                    4.- para Matriz Resultado
                    5.- para las 3 Matrices
                    0.- para Salir""");
            System.out.println("Tu input: ");
            option = Byte.parseByte(sc.nextLine());
            System.out.println();
            if (option > 0) {
                System.out.println("¿Por qué escalar entero quieres multiplicar la matriz?");
                escalar = Integer.parseInt(sc.nextLine());
            }
            switch (option) {
                case 1:
                    for (int i = 0; i < length; i++)
                        for (int j = 0; j < length; j++)
                            matriz1[i][j] *= escalar;
                    break;

                case 2:
                    for (int i = 0; i < length; i++)
                        for (int j = 0; j < length; j++)
                            matriz2[i][j] *= escalar;
                    break;

                case 3:
                    for (int i = 0; i < length; i++)
                        for (int j = 0; j < length; j++) {
                            matriz1[i][j] *= escalar;
                            matriz2[i][j] *= escalar;
                        }
                    break;

                case 4:
                    for (int i = 0; i < length; i++)
                        for (int j = 0; j < length; j++)
                            matrizRes[i][j] *= escalar;
                    break;

                case 5:
                    for (int i = 0; i < length; i++)
                        for (int j = 0; j < length; j++) {
                            matriz1[i][j] *= escalar;
                            matriz2[i][j] *= escalar;
                            matrizRes[i][j] *= escalar;
                        }
                    break;

                case 0:
                    break outerloop;

                default:
                    System.out.println("Mal input! Número fuera de rango.");
            }
        } while (true);
    }

    private static void detMatrix(int length, int[][] matriz1, int[][] matriz2, int[][] matrizRes) {

    }

    private static void inverseMatrix(int length, int[][] matriz1, int[][] matriz2, int[][] matrizRes) {

    }

    private static void trasposeMatrix(int length, int[][] matriz1, int[][] matriz2, int[][] matrizRes) {
        byte option;
        int[][] temp = new int[length][length];
        outerloop:
        do {
            System.out.println("¿Qué matriz quieres transponer?");
            System.out.println("""
                    1.- Matriz A
                    2.- Matriz B
                    3.- Matriz Resultado
                    0.- para Salir""");
            System.out.print("Tu input: ");
            option = Byte.parseByte(sc.nextLine());
            System.out.println();
            switch (option) {
                case 1:
                    for (int i = 0; i < length; i++)
                        for (int j = 0; j < length; j++)
                            temp[i][j] = matriz1[j][i];
                    for (int i = 0; i < length; i++)
                        System.arraycopy(temp[i], 0, matriz1[i], 0, length);
                    break;

                case 2:
                    for (int i = 0; i < length; i++)
                        for (int j = 0; j < length; j++)
                            temp[i][j] = matriz2[j][i];
                    for (int i = 0; i < length; i++)
                        System.arraycopy(temp[i], 0, matriz2[i], 0, length);
                    break;

                case 3:
                    for (int i = 0; i < length; i++)
                        for (int j = 0; j < length; j++)
                            temp[i][j] = matrizRes[j][i];
                    for (int i = 0; i < length; i++)
                        System.arraycopy(temp[i], 0, matrizRes[i], 0, length);
                    break;

                case 0:
                    break outerloop;

                default:
                    System.out.println("Mal input! Número fuera de rango.");
            }
        } while (true);
    }

    private static void divMatrix(int length, int[][] matriz1, int[][] matriz2, int[][] matrizRes) {

    }

    private static void powerMatrix(int length, int[][] matriz1, int[][] matriz2, int[][] matrizRes) {
        byte option;
        byte iterations = 0;
        int[][] temp = new int[length][length];
        int sigma;
        outerloop:
        do {
            System.out.println("¿Qué matriz quieres elevar?");
            System.out.println("""
                    1.- para Matriz A
                    2.- para Matriz B
                    3.- para Matriz Resultado
                    0.- para Salir""");
            System.out.println("Tu input: ");
            option = Byte.parseByte(sc.nextLine());
            System.out.println();
            if (option > 0) {
                System.out.println("¿Por qué entero quieres elevar la matriz?");
                iterations = Byte.parseByte(sc.nextLine());
            }
            switch (option) {
                case 1:
                    for (int i = 0; i < length; i++) {
                        System.arraycopy(matriz1[i], 0, temp[i], 0, length);
                    }
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            sigma = 0;
                            for (int k = 0; k < length; k++) {
                                sigma += matriz1[i][k] * matriz1[k][j];
                            }
                            temp[i][j] = sigma;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < length; i++) {
                        System.arraycopy(matriz2[i], 0, temp[i], 0, length);
                    }
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            sigma = 0;
                            for (int k = 0; k < length; k++) {
                                sigma += matriz2[i][k] * matriz2[k][j];
                            }
                            temp[i][j] = sigma;
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < length; i++) {
                        System.arraycopy(matrizRes[i], 0, temp[i], 0, length);
                    }
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < length; j++) {
                            sigma = 0;
                            for (int k = 0; k < length; k++) {
                                sigma += matrizRes[i][k] * matrizRes[k][j];
                            }
                            temp[i][j] = sigma;
                        }
                    }
                    break;
                case 0:
                    break outerloop;

                default:
                    System.out.println("Mal input! Número fuera de rango.");
            }
        } while (true);
    }

}
