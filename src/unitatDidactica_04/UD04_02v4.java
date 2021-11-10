package unitatDidactica_04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UD04_02v4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nEjercicio 55:\n");
        byte option;
        System.out.print("Introduce el valor del Array: ");
        int[] array = new int[sc.nextInt()];
        do {
            System.out.print("""
                    \n--------------Pulse una opción del menú:-------------
                    1.- Rellenar vector por teclado.
                    2.- rellenar vector aleatoriamente (0 - 100).
                    3.- Modificar posición del vector.
                    4.- Consultar una posición del vector.
                    5.- Mostrar vector.
                    6.- Ordenat ascendentemente el vector.
                    9.- Salir.
                    Tu selección:\040""");
            option = sc.nextByte();
            System.out.println("-----------------------------------------------------\n");
            switch (option) {
                case 1 -> {
                    for (int i = 0; i < array.length; i++) {
                        System.out.printf("Introduce el valor %d/%d: ", i + 1, array.length);
                        array[i] = sc.nextInt();
                    }
                }
                case 2 -> {
                    for (int i = 0; i < array.length; i++) {
                        array[i] = (int) (new Random().nextDouble() * 100);
                    }
                }
                case 3 -> {
                    System.out.printf("¿Qué posición modificar? ( 0 - %d ): ", array.length - 1);
                    byte mod = sc.nextByte();
                    System.out.print("\nIntroduce el nuevo valor: ");
                    array[mod] = sc.nextInt();
                }
                case 4 -> {
                    System.out.printf("¿Qué posición consultar? ( 0 - %d ): ", array.length);
                    byte cons = sc.nextByte();
                    System.out.printf("%nEl valor en %d es: %d%n", cons, array[cons]);
                }
                case 5 -> System.out.println(Arrays.toString(array));
                case 6 -> Arrays.sort(array);
                case 9 -> {
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                }
                default -> System.out.println("Mal input, ¡inténtalo de nuevo!");
            }
        } while (true);
    }
}