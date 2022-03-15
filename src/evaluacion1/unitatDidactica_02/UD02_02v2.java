package evaluacion1.unitatDidactica_02;

import java.util.Scanner;

public class UD02_02v2 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD02_02v2 program = new UD02_02v2();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 3 ) o salir ( 4 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer6();
                case 2 -> ejer5();
                case 3 -> ejer4();
                case 4 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);

    }

    private void ejer4() {
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Tabla de multiplicar de " + x);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", x, i, (x * i));
        }
    }

    private void ejer5() {

    }

    private void ejer6() {

    }
}