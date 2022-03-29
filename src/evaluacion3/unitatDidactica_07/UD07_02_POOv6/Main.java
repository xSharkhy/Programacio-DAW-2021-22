package evaluacion3.unitatDidactica_07.UD07_02_POOv6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<Sala> salas;
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.init();
        // Crea un menú de 5 opciones
        // 1. Encolar cliente en una sala
        // 2. Desencolar cliente de una sala
        // 3. Información de una sala
        // 4. Información de todas las salas
        // 5. Salir
        int opcion;
        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Encolar cliente en una sala");
            System.out.println("2. Desencolar cliente de una sala");
            System.out.println("3. Información de una sala");
            System.out.println("4. Información de todas las salas");
            System.out.println("5. Salir");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> m.encolarCliente();
                case 2 -> m.desencolarCliente();
                case 3 -> m.infoSala();
                case 4 -> m.infoSalas();
                case 5 -> System.out.println("Adiós");
                default -> System.out.println("Opción incorrecta");
            }
        } while (opcion != 5);

    }

    private void infoSalas() {
        // Imprimir la información de todas las salas
        for (Sala s : salas) {
            System.out.println(s.toString());
        }
    }

    private void infoSala() {
        // Pedir el número de la sala a la que quiere informar
        // Validar que exista la sala
        // Imprimir la información de la sala
        int numSala;
        do {
            System.out.println("Introduce el número de la sala a la que quieres informar: ");
            numSala = Integer.parseInt(sc.nextLine());
        } while (numSala < 1 || numSala > salas.size());
        Sala s = salas.get(numSala - 1);
        System.out.println(s.toString());
    }

    private void desencolarCliente() {
        // Pedir el número de la sala a la que quiere desencolar
        // Validar que exista la sala
        // Desencolar el cliente de la sala
        int numSala;
        do {
            System.out.println("Introduce el número de la sala a la que quieres desencolar: ");
            numSala = Integer.parseInt(sc.nextLine());
        } while (numSala < 1 || numSala > salas.size());
        Sala s = salas.get(numSala - 1);
        s.removeCliente();
    }

    private void encolarCliente() {
        // Pedir el número de la sala a la que quiere encolar
        // Validar que exista la sala
        // Pedir el nomre del cliente
        // Crear un cliente con el nombre introducido
        // Encolar el cliente en la sala
        int numSala;
        do {
            System.out.println("Introduce el número de la sala a la que quieres encolar: ");
            numSala = Integer.parseInt(sc.nextLine());
        } while (numSala < 1 || numSala > salas.size());
        Sala s = salas.get(numSala - 1);
        System.out.println("Introduce el nombre del cliente: ");
        String nom = sc.nextLine();
        System.out.println("Introduce la edad del cliente: ");
        int edad = Integer.parseInt(sc.nextLine());
        Cliente c = new Cliente(nom, edad);
        s.addCliente(c);
    }

    private void init() {
        // Crear salas en bucle con un input del usuario
        salas = new ArrayList<>();
        int numSalas;
        do {
            System.out.println("Introduce el número de salas que quieres crear: ");
            numSalas = Integer.parseInt(sc.nextLine());
        } while (numSalas < 1);
        for (int i = 0; i < numSalas; i++) {
            salas.add(new Sala(i + 1));
        }
    }
}
