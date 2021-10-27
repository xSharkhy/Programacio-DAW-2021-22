package unitatDidactica_03;

import java.util.Scanner;

public class UD03_02v4 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD03_02v4 program = new UD03_02v4();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 2 ) o salir ( 3 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer36();
                case 2 -> ejer36b();
                case 3 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);
    }

    private void ejer36b() {
        System.out.println("\nEjercicio 36b:\n");
        for (int i = 0; i < 8; i = i + 2)
            for (int j = 1; j < 10; j = j + 2) {
                String mejoresCapitulos = "";
                System.out.printf("Capítulo %dx%d%s\n", i + 1, j + 1, mejoresCapitulos);
            }
    }

    private void ejer36() {
        System.out.println("\nEjercicio 36:\n");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                String mejoresCapitulos;
                if (i == 5 && j == 9) {
                    mejoresCapitulos = ": Vientos de invierno";
                } else if (i == 2 && j == 8) {
                    mejoresCapitulos = ": La boda roja";
                } else {
                    mejoresCapitulos = "";
                }
                System.out.printf("Capítulo %dx%d%s\n", i + 1, j + 1, mejoresCapitulos);
            }
        }
    }
}
