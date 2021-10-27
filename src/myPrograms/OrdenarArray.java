package myPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrdenarArray {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        OrdenarArray program = new OrdenarArray();
        program.init();
    }

    private void init() {
        int longitud;
        System.out.println("Introduzca longitud del array: ");
        longitud = input.nextInt();
        int[] arrayIntegers = new int[longitud];
        for (int i = 0; i < arrayIntegers.length; i++) {
            try {
                System.out.println("Introduzca el elemento " + (i + 1) + ": ");
                arrayIntegers[i] = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Solo puedes introducir números.");
                --i;
                input.nextLine();
            }
        }
        System.out.println("Array sin ordenar:");
        mostrarArray(arrayIntegers);
        System.out.println("\n¿Desea ordenar los números? S/N");
        Scanner confirmInput = new Scanner(System.in);
        String confirm = confirmInput.nextLine();
        if (confirm.equalsIgnoreCase("S")) {
            System.out.println("Array ordenado:");
            ordenaBurbuja(arrayIntegers);
            mostrarArray(arrayIntegers);
        }
        confirmInput.close();
    }

    static void ordenaBurbuja(int[] arrayIntegers) {
        for (int i = 0; i < arrayIntegers.length - 1; i++) {
            for (int j = 0; j < arrayIntegers.length - 1; j++) {
                if (arrayIntegers[j] > arrayIntegers[j + 1]) {
                    int k = arrayIntegers[j + 1];
                    arrayIntegers[j + 1] = arrayIntegers[j];
                    arrayIntegers[j] = k;
                }
            }
        }
    }

    static void mostrarArray(int[] arrayIntegers) {
        for (int arrayInteger : arrayIntegers) {
            System.out.print(arrayInteger + " ");
        }
    }
}

