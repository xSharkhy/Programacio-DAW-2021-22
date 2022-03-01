package evaluacion2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Ismael Morejón Blasco
 * @version 02/22/2022 v1.0
 */

public class EV02_EEv3 {

    static final Scanner sc = new Scanner(System.in);
    static Queue<String> cola = new LinkedList<>();
    static char[] butacas;

    public static void main(String[] args) {
        init();
        menu();
    }

    private static void init() {
        System.out.println("¡Bienvenidos al concierto de Kiko Rivera!");
        System.out.println("Introduce la capacidad de la sala de conciertos:");
        butacas = new char[Integer.parseInt(sc.nextLine())];
        Arrays.fill(butacas, 'L');
    }

    private static void menu() {
        while (true) {
            System.out.println();
            System.out.println("""
                    ---- TICKETEA -----
                    1-Añadir nombre a lista de interesados
                    2-Comprar entradas
                    3-Mostrar sala
                    4-Salir""");
            switch (sc.nextLine()) {
                case "1" -> introducirCola();
                case "2" -> comprarEntrada();
                case "3" -> mostrarSala();
                case "4" -> {
                    System.out.println("Gracias por usar Ticketea!");
                    System.exit(0);
                }
                default -> System.out.println("No te he entendido!\n");
            }
        }
    }

    private static void mostrarSala() {
        for (int i = 0; i < butacas.length; i++) {
            System.out.printf(" %d ", i);
        }
        System.out.println();
        for (char butaca : butacas) {
            System.out.printf("[%c]", butaca);
        }
        System.out.println();
    }

    private static void comprarEntrada() {
        if (hayButacas()) {
            if (!cola.isEmpty()) {
                System.out.printf("%s va a comprar su entrada, ¿qué butaca quiere comprar?%n", cola.element());
                int butaca = Integer.parseInt(sc.nextLine());
                while (true) {
                    if (butaca <= butacas.length) {
                        if (butacas[butaca] == 'X') {
                            System.out.println("Butaca ocupada, introduzca otro número:");
                            butaca = Integer.parseInt(sc.nextLine());
                        } else break;
                    } else {
                        System.out.println("Esa butaca no existe, introduzca otro número:");
                        butaca = Integer.parseInt(sc.nextLine());
                    }
                }
                System.out.printf("Butaca %d asignada a %s.%n", butaca, cola.element());
                butacas[butaca] = 'X';
                cola.remove();
            } else System.out.println("ERROR: ¡No existen personas interesadas!");
        } else System.out.println("SOLD OUT! No hay más tickets!");
    }

    private static void introducirCola() {
        if (hayButacas()) {
            int counter = butacas.length;
            System.out.println("Introduzca su nombre:");
            String nombre = sc.nextLine();
            cola.add(nombre);
            System.out.printf("%s, estás en la posición %d de la lista de interesados.%n", nombre, cola.size());
            for (char butaca : butacas) {
                if (butaca == 'X') counter--;
            }
            System.out.printf("Tenemos libres %d butacas para el concierto.%n", counter);
        } else System.out.println("SOLD OUT! No hay más tickets!");
    }

    private static boolean hayButacas() {
        int counter = butacas.length;
        for (char butaca : butacas) {
            if (butaca == 'X') counter--;
        }
        return counter > 0;
    }
}
