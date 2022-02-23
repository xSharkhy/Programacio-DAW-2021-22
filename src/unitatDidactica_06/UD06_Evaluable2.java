package unitatDidactica_06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UD06_Evaluable2 {
    static final Scanner sc = new Scanner(System.in);
    static final Random rd = new Random();
    static final String[] primeraPalabra = {"Big", "Small", "The", "Perfect", "Extraordinary"};
    static final String[] segundaPalabra = {"Fighter", "Neo", "Paco"};
    static ArrayList<Integer> evolucion = new ArrayList<>();

    public static void main(String[] args) {
        String nombre = pedirNombre();
        leerHistorial();
        System.out.println("Se ha dado de alta al youtuber " + nombre + " con la evolución siguiente:");
        for (int numero : evolucion) {
            System.out.print(numero + " ");
        }
    }

    private static void leerHistorial() {
        int counter = 1;
        int hist = 0;
        while (true) {
            System.out.println("Introduzca lectura " + counter + ":");
            int numero = sc.nextInt();
            if (numero == -1) {
                if (evolucion.size() >= 2) break;
                else System.out.println("necesitamos, al menos, 2 lecturas de followers!");
            } else if (hist > numero) System.out.println("Dato erróneo. Recuerda, las lecturas son solo ascendentes!");
            else {
                hist = numero;
                evolucion.add(numero);
                counter++;
            }
        }
    }

    private static String pedirNombre() {
        int r1 = (int) (rd.nextDouble() * 5);
        int r2 = (int) (rd.nextDouble() * 3);
        System.out.println("Vamos a generar de forma aleatoria tu nombre de youtuber:");
        System.out.println("Por ejemplo... " + primeraPalabra[r1] + segundaPalabra[r2]);
        while (true) {
            System.out.println("¿Te gusta? (S/N)");
            if (sc.hasNext("S") || sc.hasNext("s")) {
                sc.next();
                return primeraPalabra[r1] + segundaPalabra[r2];
            } else if (sc.hasNext("N") || sc.hasNext("n")) {
                sc.next();
                r1 = (int) (rd.nextDouble() * 5);
                r2 = (int) (rd.nextDouble() * 3);
                System.out.println("Vamos a generar de forma aleatoria tu nombre de youtuber:");
                System.out.println("Por ejemplo... " + primeraPalabra[r1] + segundaPalabra[r2]);
            } else {
                sc.next();
                System.out.println("No te entiendo!");
            }
        }
    }
}
