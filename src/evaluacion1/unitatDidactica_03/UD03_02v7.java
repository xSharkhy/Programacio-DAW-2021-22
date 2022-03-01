package evaluacion1.unitatDidactica_03;

import java.util.Scanner;

public class UD03_02v7 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD03_02v7 program = new UD03_02v7();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 2 ) o salir ( 3 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer39();
                case 2 -> ejer40();
                case 3 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);
    }

    private void ejer40() {
        System.out.println("\nEjercicio 40:\n");
        System.out.print("Introduce la altura: ");
        int dimensiones = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= dimensiones; i++) {
            for (int j = 0; j <= dimensiones; j++) {
                if (j == i || j == (dimensiones - i + 1)) System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    private void ejer39() {
        System.out.println("\nEjercicio 39:\n");

        System.out.print("Introduzca las horas trabajadas: ");
        int horas = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el precio por hora trabajada: ");
        double salario = Double.parseDouble(sc.nextLine());
        if (horas > 40) {
            int extra = horas - 40;
            double salarioExtra = extra * (salario * 1.5);
            System.out.println("Total a pagar: " + (salario * horas + salarioExtra));
        } else System.out.println("Total a pagar: " + (salario * horas));
    }
}
