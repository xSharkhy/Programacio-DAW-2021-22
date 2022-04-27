package evaluacion3.unitatDidactica_08.UD08_02v6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Agenda {

    static ArrayList<String> agenda = new ArrayList<>();
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Agenda menu = new Agenda();
        menu.init();
    }

    private void init() {
        try {
            System.out.println("""
                    -----MENU-----
                    1.- Dar de alta un contacto de la agenda
                    2.- Dar de baja un contacto de la agenda
                    3.- Listar Agenda
                    4.- Salir""");
            int opt = Integer.parseInt(sc.nextLine());
            switch (opt) {
                case 1 -> alta();
                case 2 -> baja();
                case 3 -> listar();
                case 4 -> salir();
                default -> throw new Exception("ERROR: Opción incorrecta");
            }

        } catch (InputMismatchException ime) {
            System.out.println("ERROR: Debes ingresar valores enteros");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void salir() {
    }

    private void listar() {
    }

    private void baja() {
    }

    private void alta() throws NombreRepetidoException {
        System.out.println("Introduzca nombre del nuevo contacto:");
        String name = sc.nextLine();
        if (!agenda.isEmpty()) {
            for (String s : agenda) {
                if (s.equalsIgnoreCase(name))
                    throw new NombreRepetidoException("ERROR: El contacto ya existe en la agenda");
            }
        }
        agenda.add(name);
        System.out.println("Alta realizada con éxito! Número de contactos en la agenda: " + agenda.size());
    }
}
