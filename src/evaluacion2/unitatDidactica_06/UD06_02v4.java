package evaluacion2.unitatDidactica_06;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UD06_02v4 {
    static final Scanner sc = new Scanner(System.in);
    static Queue<String> cola = new LinkedList<>();
    static boolean caso = true;


    public static void main(String[] args) {
        while (true) {
            entrarCola();
            estadoCola();
            salirCola();
            estadoCola();
        }
    }

    private static void estadoCola() {
        if (caso) {
            System.out.println("Estado de la cola después de ENTRAR:");
            if (cola.isEmpty()) System.out.println("La cola está vacía.");
            else for (String s : cola) System.out.println(s);
            caso = false;
        } else {
            System.out.println("Estado de la cola después de SALIR:");
            if (cola.isEmpty()) System.out.println("La cola está vacía.");
            else for (String s : cola) System.out.println(s);
            caso = true;
        }
    }

    private static void salirCola() {
        while (true) {
            System.out.println("Introduzca número de personas para salir de la cola:");
            int salida = Integer.parseInt(sc.nextLine());
            if (cola.size() >= salida) {
                for (int i = 0; i < salida; i++) {
                    System.out.printf("Sale de la cola %s.%n", cola.element());
                    cola.remove();
                }
                break;
            } else
                System.out.printf("No pueden salir %d personas porque en la cola solo hay %d personas.%n", salida, cola.size());
        }
    }

    private static void entrarCola() {
        System.out.println("Introduzca nombres para ENTRAR  separados por @, 'nadie' para que no entre nadie o 'salir' para finalizar el programa:");
        String entrada = sc.nextLine();
        if (entrada.equalsIgnoreCase("salir")) System.exit(0);
        else if (entrada.equalsIgnoreCase("nadie")) System.out.print(' ');
        else if (entrada.indexOf('@') == -1) cola.add(entrada);
        else {
            String[] entradas = entrada.split("@");
            Collections.addAll(cola, entradas);
        }
    }
}
