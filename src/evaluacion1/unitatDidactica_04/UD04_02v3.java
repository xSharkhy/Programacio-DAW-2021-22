package evaluacion1.unitatDidactica_04;

import java.util.Scanner;

public class UD04_02v3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD04_02v3 program = new UD04_02v3();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 3 ) o salir ( 4 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer56();
                case 2 -> ejer57();
                case 3 -> ejer58();
                case 4 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);
    }

    private void ejer58() {
        System.out.println("\nEjercicio 58:\n");
    }

    private void ejer57() {
        System.out.println("\nEjercicio 57:\n");
    }

    private void ejer56() {
        System.out.println("\nEjercicio 56:\n");
        System.out.println("Introduce las dimensiones de la matriz");
        System.out.print("formato ( _ _ ): ");
        int[][] matrix = new int[sc.nextInt()][sc.nextInt()];
        for (int[] ints : matrix)
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("Introduce el valor en %d: ", ints[j]);
            }
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%4d: ", ints[j]);
            }
            System.out.println();
        }

    }
}
