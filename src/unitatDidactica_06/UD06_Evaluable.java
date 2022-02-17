package unitatDidactica_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UD06_Evaluable {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> ricos = new ArrayList<>();
        int numero = 0;
        while (numero < 2000) {
            System.out.println("Introduzca el numero de la revista:");
            numero = Integer.parseInt(sc.nextLine());
        }

        boolean validarNombre;
        boolean validarDinero;
        while (true) {
            System.out.printf("Introduzca nombre de rico para la revista %d:%n", numero);
            String nombre_rico = sc.nextLine();
            if (nombre_rico.equalsIgnoreCase("salir")) break;
            validarNombre = decidir_nombre_rico(nombre_rico);
            System.out.printf("Introduzca dinero que dice tener %s:%n", nombre_rico);
            int pasta_rico = Integer.parseInt(sc.nextLine());
            validarDinero = decidir_pasta_rico(pasta_rico);
            if (validarDinero && validarNombre) {
                ricos.add(nombre_rico);
                System.out.printf("%s insertado en el ArrayList de forbes en la posición %d.%n%n", nombre_rico, ricos.size());
            }
            else System.out.printf("%s es muy pobre y no puede aparecer en Forbes!%n%n", nombre_rico);
        }

        System.out.println("Los ricos introducidos son los siguientes:");
        Iterator<String> iterator = ricos.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }

    private static boolean decidir_pasta_rico(int pasta_rico) {
        return pasta_rico > 6000;
    }

    private static boolean decidir_nombre_rico(String nombre_rico) {
        return nombre_rico.indexOf('e') > -1 && nombre_rico.indexOf('o') > -1;
    }
}
