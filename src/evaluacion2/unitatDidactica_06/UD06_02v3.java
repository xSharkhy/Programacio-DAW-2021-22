package evaluacion2.unitatDidactica_06;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class UD06_02v3 {
    static final Scanner sc = new Scanner(System.in);
    static final Random rd = new Random();

    public static void main(String[] args) {
        System.out.println("¡Bienvenidos al festival de Eurovisión!");
        HashMap<String, Integer> paises = new HashMap<>();
        int i = 1;
        while (true) {
            String pais = insertarPaises(i);
            if (pais.equalsIgnoreCase("salir")) {
                if (paises.size() > 3) break;
            } else {
                paises.put(pais, (int) (rd.nextDouble() * 11 + 1));
                i++;
            }
        }
        String llave = buscarMayor(paises);
        System.out.printf("Con las puntuaciones repartidas, el ganador es: %s con %d puntos.%n", llave, paises.get(llave));
        System.out.println("Introduzca nombre de país para saber su puntuación:");
        while (true) {
            String pais = sc.nextLine();
            if (pais.equalsIgnoreCase("salir")) break;
            else {
                if (paises.containsKey(pais)) System.out.printf("%s ha recibido %d votos.%n", pais, paises.get(pais));
                else System.out.printf("%s no ha participado en el festival.%n", pais);
            }
        }
    }

    private static String buscarMayor(HashMap<String, Integer> paises) {
        int mayor = 0;
        String llave = "";
        for (String key : paises.keySet()) {
            if (paises.get(key) > mayor) {
                mayor = paises.get(key);
                llave = key;
            }
        }
        return llave;
    }

    private static String insertarPaises(int i) {
        System.out.printf("Introduzca el nombre del país %d:%n", i);
        return sc.nextLine();
    }
}
