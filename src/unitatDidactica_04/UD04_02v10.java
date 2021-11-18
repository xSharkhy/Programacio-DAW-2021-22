package unitatDidactica_04;

import java.util.Random;
import java.util.Scanner;

public class UD04_02v10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD04_02v10 program = new UD04_02v10();
        program.menu();
    }
    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 2 ) o salir ( 3 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer68();
                case 2 -> ejer69();
                case 3 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);
    }

    private void ejer69() {
        final String intro = "Introduzca su e-mail:";
        final String error1 = "ERROR1: No existe una @";
        final String error2 = "ERROR2: La dirección empieza por una @";
        final String error3 = "ERROR3: El identificador 1 no llega a 4 caracteres";
        final String error4 = "ERROR4: Tras la @ no hay un punto";
        final String error5 = "ERROR5: El identificador 2 no llega a 3 caracteres";
        final String error6 = "ERROR6: Dominio distinto a .com, .es, .org o .gov";
        final String correcto = "Enhorabuena! Mail correcto!";
        final String[] dominios = {".com", ".es", ".org", ".gov"};

        System.out.println(intro);
        String input = sc.nextLine();
        if (!input.contains("@")) System.out.println(error1);
        else if (input.indexOf("@") == 0) System.out.println(error2);
        else if (input.indexOf("@") < 4) System.out.println(error3);
        else if (input.indexOf("@") > input.indexOf(".")) System.out.println(error4);
        else if (input.indexOf(".") < 8) System.out.println(error5);
        else {
            for (int i = 0; i < dominios.length; i++) {
                if (input.contains(dominios[i])) {
                    System.out.println(correcto);
                    break;
                }
                else if (i == dominios.length - 1) System.out.println(error6);
            }
        }
    }

    private void ejer68() {
        final String mayor = "El número mágico es mayor!";
        final String menor = "El número mágico es menor!";
        final String intro = "Introduzca número:";
        final String victory = "Enhorabuena! Has acertado el numero que era el";
        final byte random = (byte) (new Random().nextDouble() * 100 + 1);
        byte input, i = 0;

        System.out.println("El juego del número mágico");
        do {
            System.out.println(intro);
            i++;
            input = Byte.parseByte(sc.nextLine());
            if (input > random) System.out.println(menor);
            if (input < random) System.out.println(mayor);
            if (input == random) {
                System.out.printf("%s %d!%n", victory, random);
                System.out.printf("Lo has solucionado en %d intentos!%n", i);
                break;
            }
        } while (true);
    }
}
