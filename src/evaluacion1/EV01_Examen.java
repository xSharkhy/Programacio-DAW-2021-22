package evaluacion1;

import java.util.Random;
import java.util.Scanner;

public class EV01_Examen {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        EV01_Examen program = new EV01_Examen();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 2 ) o salir ( 3 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> exam1();
                case 2 -> exam2();
                case 3 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);
    }

    private void exam1() {
        final int min = 4;
        final int precioMayuscula = 10;
        final int precioMinuscula = 5;
        String paco = "Paco";
        int x;
        int y;

        do {
            System.out.println("Introduzca las dimensiones de la bandera de Paco (min. 4x4):");
            String[] s = sc.nextLine().split(" ");
            x = Integer.parseInt(s[0]);
            y = Integer.parseInt(s[1]);
            if (x < min) System.out.println("La dimensión en X es inferior a 4.");
            if (y < min) System.out.println("La dimensión en Y es inferior a 4.");
            if (x >= min && y >= min) break;
        } while (true);

        for (int i = 0; i < y + x; i++) {
            if (i % 4 == 0) paco += paco;
            if (i == y + x - 1) paco += paco;
        }
        char[] francisco = paco.toCharArray();
        for (int i = 0; i < x; i++) {
            if (i == 0) for (int j = 0; j < y + 2; j++) {
                System.out.print('@');
                if ((y + 2) % 2 == 1 && j == y + 1) System.out.print('@');
                if (j == y + 1) System.out.print("\n");
            }
            System.out.print('@');
            for (int j = 0; j < y; j++) {
                System.out.print(francisco[i + j]);
                if (j == y - 1) System.out.print("@\n");
            }
            if (i == x - 1) for (int j = 0; j < y + 2; j++) {
                System.out.print('@');
                if ((y + 2) % 2 == 1 && j == x + 1) System.out.print('@');
                if (j == y + 1) System.out.print("\n");
            }
        }
        int count = x * y;
        int breakCount = (x * y) % 4;
        int total;
        int pPrecio = (count / min) * precioMayuscula;
        int aPrecio = (count / min) * precioMinuscula;
        int cPrecio = (count / min) * precioMinuscula;
        int oPrecio = (count / min) * precioMinuscula;
        if (breakCount == 1) {
            pPrecio += precioMayuscula;
        }
        if (breakCount == 2) {
            pPrecio += precioMayuscula;
            aPrecio += precioMinuscula;
        }
        if (breakCount == 3) {
            pPrecio += precioMayuscula;
            aPrecio += precioMinuscula;
            cPrecio += precioMinuscula;
        }
        total = pPrecio + aPrecio + cPrecio + oPrecio;
        System.out.printf("\nImprimir esta bandera costaría %d€ ya que hay que imprimir:\n", total);
        System.out.printf("- %d letras P por valor de: %d€\n", (pPrecio / precioMayuscula), pPrecio);
        System.out.printf("- %d letras P por valor de: %d€\n", (aPrecio / precioMinuscula), aPrecio);
        System.out.printf("- %d letras P por valor de: %d€\n", (cPrecio / precioMinuscula), cPrecio);
        System.out.printf("- %d letras P por valor de: %d€\n", (oPrecio / precioMinuscula), oPrecio);
    }

    private void exam2() {
        final int rondas = 5;
        final String separador = "----------------------------------------------";

        System.out.println("Introduzca el número de jugadores para el juego:");
        int[] jugadores = new int[sc.nextInt()];
        int[] eliminados = new int[jugadores.length];
        int restantes = jugadores.length;
        int restanteAlto = 0;
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = i + 1;
        }
        int random;
        for (int i = 0; i < rondas; i++) {
            if (i == 0) System.out.println(separador);
            System.out.printf("Ronda número: %d%n", i + 1);
            System.out.printf("Luz verde%nya puedes correr...%ny parar!%n");
            random = (int) (new Random().nextDouble() * restantes);
            System.out.printf("De %d, vamos a eliminar a %d concursantes.%n", restantes, random);
            restantes -= random;
            for (int j = 0; j < random; j++) {
                int jEliminado;
                do {
                    for (int k = jugadores.length - 1; k >= 0; k--) {
                        if (eliminados[k] == 0) {
                            restanteAlto = k;
                            break;
                        }
                    }
                    jEliminado = (int) (new Random().nextDouble() * restanteAlto + 1);
                    if (!(jEliminado == eliminados[jEliminado])) {
                        eliminados[jEliminado] = jEliminado;
                        break;
                    }
                } while (true);
                System.out.printf("Jugador %d: ELIMINADO%n", jEliminado);

            }
            System.out.printf("Quedan vivos %d concursantes: ", restantes);
            for (int j = 0; j < jugadores.length; j++) {
                if (eliminados[j] == 0) System.out.printf("%d ", j + 1);
            }
            System.out.println();
            System.out.println(separador);
            if (restantes == 0) {
                System.out.println("GAME OVER");
                break;
            }
            if (i == rondas - 1) System.out.println("GAME OVER");
        }
    }
}
