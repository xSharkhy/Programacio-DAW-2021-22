package unitatDidactica_02;

import java.util.Scanner;

public class UD02_04v5 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD02_04v5 program = new UD02_04v5();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 4 ) o salir ( 5 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer29();
                case 2 -> ejer30();
                case 3 -> ejer31();
                case 4 -> ejer32();
                case 5 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);

    }

    private void ejer29() {
        System.out.println("\nEjercicio 29:\n");
        System.out.println("Introduzca una frase para pasarla a Mayúsculas:");
        String frase = sc.nextLine();
        System.out.println("Tu frase en minúsculas es: \t\t" + frase);
        System.out.println("Y en MAYÚSCULAS es:\t\t\t\t" + frase.toUpperCase());
    }

    private void ejer30() {
        System.out.println("\nEjercicio 30:\n");
        System.out.print("Introduce la nota del primer examen: ");
        double nota = Double.parseDouble(sc.nextLine());
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double deseo = Double.parseDouble(sc.nextLine());
        double t = (deseo - 0.4 * nota) / 0.6;
        System.out.printf("Para tener un %.2f en el trimestre necesitas sacar un %.2f en el segundo examen.\n", deseo, t);

    }

    private void ejer31() {
        System.out.println("\nEjercicio 31:\n");
        System.out.print("Introduzca valor de N: ");
        String N = String.valueOf(Integer.parseInt(sc.nextLine()));
        char[] display = N.toCharArray();
        for (int i = 0; i < display.length; i++) System.out.printf("Cifra n.%d -> %s%n", i + 1, display[i]);

    }

    private void ejer32() {
        System.out.println("\nEjercicio 32:\n");
        System.out.print("Introduzca el valor a convertir: ");
        double valor = Double.parseDouble(sc.nextLine());
        final double CONVERSOR = 0.277777777777;
        System.out.printf("Equivale a %.3f m/s", (valor * CONVERSOR));
    }
}