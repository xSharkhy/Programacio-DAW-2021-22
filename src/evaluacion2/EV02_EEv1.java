package evaluacion2;

import java.util.Random;
import java.util.Scanner;

public class EV02_EEv1 {
    static final Scanner sc = new Scanner(System.in);
    static final Random rd = new Random();
    static final String bienvenida = "Bienvenido a 'Un partido con NoVac YoCovid'";
    static final String errVacio = "ERROR! El nombre está vacío!";
    static final String errJuegos = "ERROR! Al menos deberían jugar 1 juego!";
    static final String errAustralia = "ERROR! El Sr YoCovid prefiere no jugar en Australia!";
    static final String negacionista = "YoCovid";
    static final String marcador = "==============================================";
    static final int CERO = 0;
    static final int QUINCE = 15;
    static final int TREINTA = 30;
    static final int CUARENTA = 40;

    public static String leer_nombre() {
        System.out.println(bienvenida);
        do {
            System.out.println("Introduzca su nombre:");
            String nombre = sc.nextLine();
            if (nombre.matches("^\\s*$")) System.out.println(errVacio);
            else return nombre;
        } while (true);
    }

    public static int leer_numjuegos() {
        do {
            System.out.println("¿Cuántos juegos se necesitan para ganar este partido?");
            int numero = Integer.parseInt(sc.nextLine());
            if (numero <= 0) System.out.println(errJuegos);
            else return numero;
        } while (true);
    }

    public static String leer_lugar() {
        do {
            System.out.println("¿Dónde te gustaría jugar con NoVac?");
            String lugar = sc.nextLine();
            if (lugar.equalsIgnoreCase("australia")) System.out.println(errAustralia);
            else return lugar;
        } while (true);
    }

    private static void partido(String nombre, int numero, String lugar) {
        int marcadorFinalCovid = 0;
        int marcadorFinalJugador = 0;
        int i = 0;
        do {
            int marcaCovid = 0;
            int marcaJugador = 0;
            System.out.println(marcador);
            System.out.printf("RESULTADO: %s %d - %s %d%n", negacionista, marcadorFinalCovid, nombre, marcadorFinalJugador);
            System.out.println(marcador);
            boolean servicio = i % 2 == 0;
            while (true) {
                if (servicio) {
                    System.out.println("Saca " + negacionista);
                } else {
                    System.out.println("Saca " + nombre);
                }
                int k;
                boolean pelota = servicio;
                while (true) {
                    i++;
                    int random = (int) (rd.nextDouble() * 2);
                    if (random == 1) {
                        if (pelota) {
                            pelota = false;
                            System.out.println("Devuelve la pelota " + nombre);
                        } else {
                            pelota = true;
                            System.out.println("Devuelve la pelota " + negacionista);
                        }
                    } else {
                        if (pelota) {
                            System.out.println("Y punto de " + negacionista);
                            k = 0;
                        } else {
                            System.out.println("Y punto de " + nombre);
                            k = 1;
                        }
                        break;
                    }

                }
                if (k == 0 && marcaCovid == CERO) {
                    marcaCovid = QUINCE;
                    System.out.printf("%s: %d - %s: %d%n", negacionista, marcaCovid, nombre, marcaJugador);
                } else if (k == 0 && marcaCovid == QUINCE) {
                    marcaCovid = TREINTA;
                    System.out.printf("%s: %d - %s: %d%n", negacionista, marcaCovid, nombre, marcaJugador);
                } else if (k == 0 && marcaCovid == TREINTA) {
                    marcaCovid = CUARENTA;
                    System.out.printf("%s: %d - %s: %d%n", negacionista, marcaCovid, nombre, marcaJugador);
                } else if (k == 0) {
                    marcadorFinalCovid++;
                    System.out.printf("%s: %s - %s: %d%n", negacionista, "GANA EL JUEGO", nombre, marcaJugador);
                    i++;
                    break;
                } else if (marcaJugador == CERO) {
                    marcaJugador = QUINCE;
                    System.out.printf("%s: %d - %s: %d%n", negacionista, marcaCovid, nombre, marcaJugador);
                } else if (marcaJugador == QUINCE) {
                    marcaJugador = TREINTA;
                    System.out.printf("%s: %d - %s: %d%n", negacionista, marcaCovid, nombre, marcaJugador);
                } else if (marcaJugador == TREINTA) {
                    marcaJugador = CUARENTA;
                    System.out.printf("%s: %d - %s: %d%n", negacionista, marcaCovid, nombre, marcaJugador);
                } else {
                    marcadorFinalJugador++;
                    System.out.printf("%s: %d - %s: %s%n", negacionista, marcaCovid, nombre, "GANA EL JUEGO");
                    i++;
                    break;
                }
            }
        } while (marcadorFinalCovid != numero && marcadorFinalJugador != numero);
        System.out.println(marcador);
        System.out.printf("RESULTADO: %s %d - %s %d%n", negacionista, marcadorFinalCovid, nombre, marcadorFinalJugador);
        System.out.println(marcador);
        if (marcadorFinalCovid > marcadorFinalJugador)
            System.out.printf("Ganador del partido disputado en %s... NoVac YoCovid!!", lugar);
        else System.out.printf("Ganador del partido disputado en %s... %s!!", lugar, nombre);
    }

    public static void main(String[] args) {
        partido(leer_nombre(), leer_numjuegos(), leer_lugar());
    }
}