package evaluacion1.unitatDidactica_04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class UD04_02v1 {
    static Scanner sc = new Scanner(System.in);
    static final int HUNDRED = 100;

    public static void main(String[] args) {
        UD04_02v1 program = new UD04_02v1();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 2 ) o salir ( 3 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer52();
                case 2 -> ejer53();
                case 3 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);
    }

    private void ejer53() {
        System.out.println("\nEjercicio 53:\n");
        System.out.println("Introduzca tamaño del Array: ");
        int[] array = new int[sc.nextInt()];
        System.out.println("Introduzca límites inferior y superior para generar números aleatorios: ");
        int tInicial = sc.nextInt();
        int rango = (sc.nextInt() - tInicial) + 1;
        sc.nextLine();
        System.out.println("Se ha generado el siguiente array de 4 posiciones: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (new Random().nextDouble() * rango + tInicial);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nLa suma de los elementos es: " + IntStream.of(array).sum());
    }


    private void ejer52() {
        System.out.println("\nEjercicio 52:\n");
        int[] array = new int[HUNDRED];
        Arrays.setAll(array, i -> i + 1);
        int sigma = IntStream.of(array).sum();
        System.out.printf("Sigma: %d, Average: %.2f", sigma, (double) sigma / array.length);
    }
}
