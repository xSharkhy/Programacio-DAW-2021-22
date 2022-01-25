package ejerciciosEvaluables;

import java.util.Arrays;
import java.util.Scanner;

public class practica21 {
    static final Scanner sc = new Scanner(System.in);
    static char[][] tablero = new char[6][6];
    static char[][] juego = new char[6][6];
    static String nombre = "Capitán ";
    static String[] embarcaciones = {"transatlántico", "carguero", "lancha"};
    static byte transa = 0;
    static byte carguero = 0;
    static byte lancha = 0;
    static byte contador = 0;

    private static void jugar() {
        for (char[] chars : juego) Arrays.fill(chars, '_');
        System.out.println("\nAhora es el turno de jugar, grumete! Has de haer frente a %d transatlánticos, %d cargueros y %d lanchas.");
        System.out.println("Acuérdate que solo puedes hacer agua en 5 ocasiones!");
        byte aguas = 0;
        byte i = 0;
        int x, y;
        imprimir(juego);
        while (true) {
            i++;
            System.out.printf("Cuál será tu disparo número %d?%n", i);
            String s = sc.nextLine();
            if (s.matches("[0-9] [0-9]")) {
                String[] parts = s.split(" ");
                x = Integer.parseInt(parts[0]);
                y = Integer.parseInt(parts[1]);
                if (tablero[x][y] != '_') {
                    System.out.println("IMPACTO! Parece que le hemos dado a algo!");
                    juego[x][y] = tablero[x][y];
                    imprimir(juego);
                } else {
                    aguas++;
                    System.out.printf("AGUA! Y llevas: %d%n", aguas);
                    imprimir(juego);
                }
                if (aguas == 5) {
                    System.out.println("GAME OVER! Has hecho 5 aguas!");
                    break;
                }
                if (Arrays.deepEquals(juego, tablero)) {
                    System.out.printf("¡Enhorabuena grumete! Has ganado la partida en solo %d tiradas!%n", i);
                    System.out.println("GAME OVER");
                    break;
                }
            } else {
                System.out.println("No es un input válido!");
            }
        }
    }

    private static void colocar() {
        final int max3 = 3;
        for (int i = 0; i < 3; i++) {
            System.out.printf("Introduzca la posición de su transatlántico número %d de 3 o 'stop' para dejar de introducir datos: ", i + 1);
            if (validar(i, max3)) {
                contador++;
                break;
            }
        }
        System.out.println(nombre + " aquí están sus transatlánticos...");
        imprimir(tablero);
        System.out.println("Ahora vamos a ubicar los cargueros...");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Introduzca la posición de su carguero número %d de 3 o 'stop' para dejar de introducir datos: ", i + 1);
            if (validar(i, max3)) {
                contador++;
                break;
            }
        }
        System.out.println(nombre + " aquí están sus transatlánticos y sus cargueros...");
        imprimir(tablero);
        System.out.println("Ahora vamos a ubicar las lanchas...");
        final int max5 = 5;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Introduzca la posición de su lancha número %d de 5 o 'stop' para dejar de introducir datos: ", i + 1);
            if (validar(i, max5)) break;
        }
        System.out.println(nombre + " aquí están sus transatlánticos, sus cargueros y sus lanchas...");
        imprimir(tablero);
    }

    private static boolean validar(int numero, int maximo) {
        int x, y, aux = 0;
        char[] barco = {'T', 'C', 'L'};
        if (contador == 0) aux = 4;
        if (contador == 1) aux = 3;
        if (contador == 2) aux = 1;
        String s = sc.nextLine();
        do {
            if (s.matches("[0-9] [0-9]")) {
                String[] parts = s.split(" ");
                x = Integer.parseInt(parts[0]);
                y = Integer.parseInt(parts[1]);
                if (x >= 0 && x <= 5 && y >= 0 && y <= 5) {
                    if (tablero[x][y] == '_' && contador == 2) {
                        tablero[x][y] = barco[contador];
                        lancha++;
                        return false;
                    } else if (contador == 1 && x + aux <= tablero.length) {
                        int cont = 1;
                        for (int i = 1; i < aux; i++) {
                            if (tablero[x + i][y] == '_') cont++;
                        }
                        if (cont == aux) {
                            for (int i = 0; i < aux; i++) {
                                carguero++;
                                tablero[x + i][y] = barco[contador];
                            }
                            return false;
                        }
                    } else if (contador == 0 && y + aux <= tablero.length) {
                        int cont = 1;
                        for (int i = 1; i < aux; i++) {
                            if (tablero[x][y + i] == '_') cont++;
                        }
                        if (cont == aux) {
                            for (int i = 0; i < aux; i++) {
                                transa++;
                                tablero[x][y + i] = barco[contador];
                            }
                            return false;
                        }
                    } else {
                        System.out.printf("No puedo ubicar ahí %s, %s. Se solapa con algo.%n", embarcaciones[contador], nombre);
                        System.out.println("Se lo vuelvo a preguntar...");
                        System.out.printf("Introduzca la posición de su %s número %d de %d o 'stop' para dejar de introducir datos: ", embarcaciones[contador], numero + 1, maximo);
                        s = sc.nextLine();
                    }
                } else {
                    System.out.printf("Esa embarcación no la puedo ubicar en el tablero, %s. Acuérdese que el tablero es 6x6%n", nombre);
                    System.out.println("Se lo vuelvo a preguntar...");
                    System.out.printf("Introduzca la posición de su %s número %d de %d o 'stop' para dejar de introducir datos: ", embarcaciones[contador], numero + 1, maximo);
                    s = sc.nextLine();
                }
            } else if (s.equalsIgnoreCase("stop")) {
                return true;
            } else {
                System.out.println("Se lo vuelvo a preguntar...");
                System.out.printf("Introduzca la posición de su %s número %d de %d o 'stop' para dejar de introducir datos: ", embarcaciones[contador], numero + 1, maximo);
                s = sc.nextLine();
            }
        } while (true);
    }

    private static void imprimir(char[][] matriz) {
        for (char[] chars : matriz)
            for (int j = 0; j < matriz.length; j++)
                if (j < matriz.length - 1) System.out.print(chars[j] + " ");
                else System.out.print(chars[j] + "\n");
    }

    public static void main(String[] args) {
        for (char[] chars : tablero) Arrays.fill(chars, '_');
        System.out.println("Bienvenido al juego de hundir la flota 6x6, introduzca su nombre:");
        nombre += sc.nextLine();
        System.out.println("Hola, " + nombre + ". Déjeme que le ayude a configurar su flota.");
        colocar();
        jugar();
    }
}
