package ejerciciosEvaluables;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class practica23 {
    static final Scanner sc = new Scanner(System.in);
    static String[][] libreria;

    private static void quitar_libro() {
        while (true) {
            boolean flag = false;
            System.out.println("Introduce el libro a quitar:");
            String libro = sc.nextLine();
            for (int i = 0; i < libreria.length; i++) {
                for (int j = 0; j < libreria[i].length; j++) {
                    if (libreria[i][j].equals(libro)) {
                        libreria[i][j] = "*";
                        System.out.printf("OK!: Quito %s de la posición [%d,%d]%n", libro, i, j);
                        flag = true;
                    }
                }
                if (i == libreria.length - 1 && !flag) {
                    System.out.printf("ERROR!: No puedo quitar a %s porque no existe!%n", libro);
                }
            }
            if (flag) break;
        }
    }

    private static void pintar_estanteria() {
        for (String[] strings : libreria) {
            for (int j = 0; j < libreria[0].length; j++) {
                System.out.print(strings[j] + " \t");
            }
            System.out.println();
        }
    }

    private static void colocar_libro() {
        System.out.println("Introduce el título del nuevo libro:");
        String libro = sc.nextLine();
        while (true) {
            System.out.printf("Introduzca posición para poner %s:%n", libro);
            int fila = sc.nextInt();
            int columna = sc.nextInt();
            sc.nextLine();
            if (fila < libreria.length) {
                if (columna < libreria[0].length) {
                    if (libreria[fila][columna].equals("*")) {
                        System.out.printf("OK!: Colocamos La Biblia en la posición [%d,%d]%n", fila, columna);
                        libreria[fila][columna] = libro;
                        break;
                    } else {
                        System.out.printf("ERROR!: Esa posición ya está ocupada por %s%n", libreria[fila][columna]);
                    }
                } else {
                    System.out.printf("ERROR!: El valor de col: %d no es correcto%n", columna);
                }
            } else {
                System.out.printf("ERROR!: El valor de fil: %d no es correcto%n", fila);
            }
        }
    }

    private static int pintar_menu() {
        System.out.println("---------------------------------");
        System.out.println("1 - Colocar libro");
        System.out.println("2 - Quitar libro");
        System.out.println("3 - Pintar estantería");
        System.out.println("4 - Salir");
        System.out.println("---------------------------------");
        System.out.print("Introduzca opción: ");
        return Integer.parseInt(sc.nextLine());
    }

    private static String leer_nombre() {
        System.out.println("¿Cómo quieres llamar a tu estantería?");
        while (true) {
            String estanteria = sc.nextLine().toUpperCase();
            if (Pattern.compile("[A-Z*&&[^AEIOU]]{3}").matcher(estanteria).find()) {
                return estanteria;
            } else {
                System.out.println("ERROR!: Nombre incorrecto!, Introduzca el nombre de nuevo:");
            }
        }
    }

    public static void main(String[] args) {
        final String estanteria = leer_nombre();
        System.out.println("Introduzca numero de estantes:");
        final int estantes = Integer.parseInt(sc.nextLine());
        System.out.println("Introduzca numero de libros por estantes:");
        final int libros = Integer.parseInt(sc.nextLine());
        libreria = new String[estantes][libros];
        for (String[] strings : libreria) {
            Arrays.fill(strings, "*");
        }
        while (true) {
            switch (pintar_menu()) {
                case 1 -> colocar_libro();
                case 2 -> quitar_libro();
                case 3 -> pintar_estanteria();
                case 4 -> {
                    System.out.println("¡Gracias por usar este software tan divertido!");
                    System.exit(0);
                }
                default -> System.out.println("¡No te entiendo!");
            }
        }
    }
}