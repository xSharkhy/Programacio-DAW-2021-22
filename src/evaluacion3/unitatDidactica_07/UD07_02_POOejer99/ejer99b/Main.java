package evaluacion3.unitatDidactica_07.UD07_02_POOejer99.ejer99b;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Equipo> equipos = new ArrayList<>();
    static boolean counter = false;

    public static void main(String[] args) {

        System.out.println("Introduce el número de equipos a dar de alta:");
        int c = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < c; i++) {
            System.out.println("\nIntroduzca el nombre del equipo " + (i + 1) + ":");
            String nombre = sc.nextLine();
            Jugador[] jugadores = new Jugador[3];
            for (int j = 0; j < 3; j++) {
                System.out.printf("Para el %s, introduzca dorsal y nombre del jugador %d:%n", nombre, j + 1);
                int dorsal = sc.nextInt();
                String jugador = sc.nextLine();
                jugadores[j] = new Jugador(jugador, dorsal);
            }
            equipos.add(new Equipo(nombre, jugadores));
            System.out.println(equipos.get(i));
        }
        System.out.println();
        print();
        print();
    }

    public static void print() {
        System.out.printf("Lista de jugadores con los dorsales %spares:%n", counter ? "" : "im");
        equipos.forEach(equipo -> {
            Jugador[] jugadores = equipo.getJugadores();
            for (Jugador jugador : jugadores) {
                if (jugador.getDorsal() % 2 == (counter ? 0 : 1)) System.out.println(jugador);
            }
        });
        counter = true;
    }
}
