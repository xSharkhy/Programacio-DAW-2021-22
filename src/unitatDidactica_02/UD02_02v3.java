package unitatDidactica_02;

import java.util.Scanner;

public class UD02_02v3 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD02_02v3 program = new UD02_02v3();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 4 ) o salir ( 5 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer7();
                case 2 -> ejer8();
                case 3 -> ejer9();
                case 4 -> ejer10();
                case 5 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);

    }

    private void ejer10() {

    }

    private void ejer9() {

    }

    private void ejer8() {

    }

    private void ejer7() {

    }
}