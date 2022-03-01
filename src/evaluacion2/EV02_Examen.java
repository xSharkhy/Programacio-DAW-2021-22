package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ismael Morejón Blasco.
 * @version Thursday 24th February 2022, 16:45 CET.
 */

public class EV02_Examen {

    static final Scanner sc = new Scanner(System.in);
    static final String[] items = {"grupo", "CD", "Vinilo", "Cassete", "DVD"};
    static final String errVacio = "ERROR! Nombre del grupo vacío!";
    static ArrayList<String> grupos = new ArrayList<>();
    static ArrayList<String> cds = new ArrayList<>();
    static ArrayList<String> vinilos = new ArrayList<>();
    static ArrayList<String> cassetes = new ArrayList<>();
    static ArrayList<String> dvds = new ArrayList<>();

    /**
     * @param args - Array de argumentos del método default. No usado.
     */

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        byte option;
        do {
            System.out.println("""
                    ------------------
                    MENU DEL MELOMANO
                    ------------------
                    1-Gestion grupos musicales
                    2-Gestion cds
                    3-Gestion vinilos
                    4-Gestion cassetes
                    5-Gestion dvds
                    6-Listar informacion de un grupo
                    7-Salir""");
            try {
                option = Byte.parseByte(sc.nextLine());
                switch (option) {
                    case 1, 2, 3, 4, 5 -> gestion(option);
                    case 6 -> listar();
                    case 7 -> {
                        System.out.println("Gracias por utilizar este software!");
                        System.exit(0);
                    }
                    default -> System.out.println("No es una opción!");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Eso no es un número!");
            }
        } while (true);
    }

    private static void listar() {
        System.out.println("Introduzca nombre del grupo:");
        String grupo = sc.nextLine();
        System.out.println("Esto es lo que tengo de " + grupo + ":");
        System.out.println("-CDs:");
        boolean cdFound = false;
        for (String cd : cds) {
            if (cd.contains(grupo) && cd.indexOf(grupo) < cd.indexOf(":")) {
                String[] parts = cd.split(":");
                System.out.println("\t -" + parts[1]);
                cdFound = true;
            }
        }
        if (!cdFound) System.out.println("\tNada");
        System.out.println("-Vinilos:");
        boolean vinilFound = false;
        for (String vinilo : vinilos) {
            if (vinilo.contains(grupo) && vinilo.indexOf(grupo) < vinilo.indexOf(":")) {
                String[] parts = vinilo.split(":");
                System.out.println("\t -" + parts[1]);
                vinilFound = true;
            }
        }
        if (!vinilFound) System.out.println("\tNada");
        System.out.println("-Cassetes:");
        boolean cassFound = false;
        for (String cassete : cassetes) {
            if (cassete.contains(grupo) && cassete.indexOf(grupo) < cassete.indexOf(":")) {
                String[] parts = cassete.split(":");
                System.out.println("\t -" + parts[1]);
                cassFound = true;
            }
        }
        if (!cassFound) System.out.println("\tNada");
        System.out.println("-DVDs:");
        boolean dvdFound = false;
        for (String dvd : dvds) {
            if (dvd.contains(grupo) && dvd.indexOf(grupo) < dvd.indexOf(":")) {
                String[] parts = dvd.split(":");
                System.out.println("\t -" + parts[1]);
                dvdFound = true;
            }
        }
        if (!dvdFound) System.out.println("\tNada");
    }

    /**
     * @param option - Opción tecleada en el menú mediante input del usuario. Definirá el tipo de librería a actualizar.
     */

    private static void gestion(byte option) {
        boolean altaBaja;
        System.out.printf("¡Vamos a gestionar los %ss!%n", items[option - 1]);
        while (true) {
            System.out.printf("¿Damos de alta o de baja %ss? (a/b)%n", items[option - 1]);
            if (sc.hasNext("A") || sc.hasNext("a")) {
                altaBaja = true;
                sc.nextLine();
                break;
            } else if (sc.hasNext("B") || sc.hasNext("b")) {
                altaBaja = false;
                sc.nextLine();
                break;
            } else {
                sc.nextLine();
                System.out.println("ERROR! opcion f incorrecta!, solo se admiten valores a/b");
            }
        }
        if (option == 1) {
            if (altaBaja) {
                while (true) {
                    System.out.println("Introduzca el nombre del grupo a dar de alta:");
                    String grupo = sc.nextLine();
                    if (grupo.matches("^\\s*$")) System.out.println(errVacio);
                    else {
                        System.out.println("Grupo nuevo dado de alta: " + grupo);
                        System.out.println("Listado de grupos actualizado:");
                        grupos.add(grupo);
                        for (String grup : grupos) System.out.printf("- %s%n", grup);
                        break;
                    }
                }
            } else {
                System.out.println("Introduzca el nombre del grupo a dar de baja:");
                String grupo = sc.nextLine();
                if (grupos.contains(grupo)) grupos.remove(grupo);
                else System.out.printf("ERROR! El grupo %s no existe!%n", grupo);
            }
        } else {
            while (true) {
                System.out.printf("Introduzca datos del %s, (nombre del grupo:nombre del %s):%n", items[option - 1], items[option - 1]);
                String nombreLP = sc.nextLine();
                if (nombreLP.contains(":")) {
                    String[] parts = nombreLP.split(":");
                    if (grupos.contains(parts[0])) {
                        switch (option) {
                            case 2 -> {
                                if (altaBaja) cds.add(nombreLP);
                                else {
                                    if (cds.contains(nombreLP)) {
                                        System.out.printf("%s %s dado de baja para el grupo %s!%n", items[option - 1], parts[1], parts[0]);
                                        cds.remove(nombreLP);
                                    } else
                                        System.out.printf("ERROR! no existe el %s titulado %s para el grupo %s%n", items[option - 1], parts[1], parts[0]);
                                }
                                System.out.printf("Listado de %ss actualizado:%n", items[option - 1]);
                                for (String cd : cds) System.out.println("-" + cd);
                            }
                            case 3 -> {
                                if (altaBaja) vinilos.add(nombreLP);
                                else {
                                    if (vinilos.contains(nombreLP)) {
                                        System.out.printf("%s %s dado de baja para el grupo %s!%n", items[option - 1], parts[1], parts[0]);
                                        vinilos.remove(nombreLP);
                                    } else
                                        System.out.printf("ERROR! no existe el %s titulado %s para el grupo %s%n", items[option - 1], parts[1], parts[0]);
                                }
                                System.out.printf("Listado de %ss actualizado:%n", items[option - 1]);
                                for (String vinilo : vinilos) System.out.println("-" + vinilo);
                            }
                            case 4 -> {
                                if (altaBaja) cassetes.add(nombreLP);
                                else {
                                    if (cassetes.contains(nombreLP)) {
                                        System.out.printf("%s %s dado de baja para el grupo %s!%n", items[option - 1], parts[1], parts[0]);
                                        cassetes.remove(nombreLP);
                                    } else
                                        System.out.printf("ERROR! no existe el %s titulado %s para el grupo %s%n", items[option - 1], parts[1], parts[0]);
                                }
                                System.out.printf("Listado de %ss actualizado:%n", items[option - 1]);
                                for (String cassete : cassetes) System.out.println("-" + cassete);
                            }
                            case 5 -> {
                                if (altaBaja) dvds.add(nombreLP);
                                else {
                                    if (dvds.contains(nombreLP)) {
                                        System.out.printf("%s %s dado de baja para el grupo %s!%n", items[option - 1], parts[1], parts[0]);
                                        dvds.remove(nombreLP);
                                    } else
                                        System.out.printf("ERROR! no existe el %s titulado %s para el grupo %s%n", items[option - 1], parts[1], parts[0]);
                                }
                                System.out.printf("Listado de %s actualizado:%n", items[option - 1]);
                                for (String dvd : dvds) System.out.println("-" + dvd);
                            }
                        }
                        break;
                    } else System.out.printf("ERROR! El grupo %s no existe!%n", parts[0]);
                } else System.out.println("Formato incorrecto, faltan los 2 puntos (:)");
            }
        }
    }
}

