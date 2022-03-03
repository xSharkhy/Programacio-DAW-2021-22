package evaluacion3.unitatDidactica_07.UD07_02_POOv3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static ArrayList<Billete> billetes = new ArrayList<>();

    public static void main(String[] args) {
        Main program = new Main();
        program.menu();
    }

    private void menu() {
        System.out.println("""
                Bienvenido a las aerolíneas Paco Airways, ¿qué desea hacer?
                ---------------------------------------------------------------""");
        do {
            System.out.println("""
                    
                    1. - Comprar billete de Avión.
                    2. - Cancelar billete de Avión.
                    3. - Estado de mi reserva.
                    S. - Salir""");
            System.out.print("OPCION: ");
            String option = sc.nextLine();
            switch (option) {
                case "1" -> comprarBillete();
                case "2" -> cancelarBillete();
                case "3" -> estadoReserva();
                case "S", "s" -> {
                    System.out.println("Paco Airways no le agradece su confianza. Gracias por nada.");
                    System.exit(0);
                }
                default -> System.out.println("No te entiendo!");
            }
        } while (true);
    }

    private void estadoReserva() {
        System.out.println("¿Qué vuelos desea ver? (V - vigentes, C - cancelados, T - todos)");
        String option = sc.nextLine().toUpperCase();
        switch (option) {
            case "V" -> {
                for (Billete billete : billetes) {
                    if (billete.isVigente()) System.out.println(billete);
                }
            }
            case "C" -> {
                for (Billete billete : billetes) {
                    if (!billete.isVigente()) System.out.println(billete);
                }
            }
            case "T" -> {
                for (Billete billete : billetes) {
                    System.out.println(billete.toString());
                }
            }
        }

    }

    private void cancelarBillete() {
        System.out.println("Introduzca id del billete a cancelar:");
        String id = sc.nextLine();
        for (Billete billete : billetes) {
            if (billete.getIdentificador().equals(id)) {
                System.out.println("Billete encontrado, ¿Confirma su cancelación (S/N)?");
                String confirm = sc.nextLine();
                if (confirm.equalsIgnoreCase("s")) {
                    billete.cancelarBillete();
                    System.out.println("Billete Cancelado!!");
                } else System.out.println("Operación de cancelación cancelada a su vez.");
                break;
            }
        }
    }

    private void comprarBillete() {
        System.out.println("Introduzca orígen, destino, día de ida y día de vuelta separados por @:");
        String[] entrada = sc.nextLine().split("@");
        billetes.add(new Billete(entrada[0], entrada[1], Integer.parseInt(entrada[2]), Integer.parseInt(entrada[3])));
        System.out.println("Billete comprado!");
    }
}
