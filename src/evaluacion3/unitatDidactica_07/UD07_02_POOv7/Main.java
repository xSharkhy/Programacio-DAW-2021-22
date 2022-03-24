package evaluacion3.unitatDidactica_07.UD07_02_POOv7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final Scanner sc = new Scanner(System.in);
    static final ArrayList<Nave> naves = new ArrayList<>();
    static final ArrayList<Flota> flotas = new ArrayList<>();

    public static void main(String[] args) {
        new Main().menu();
    }

    private void menu() {
        do {
            System.out.println("""
                    ----------- Menú de la galaxia ----------
                    1-Alta de nave          4-Consultar nave
                    2-Alta de tripulante    5-Consultar flota
                    3-Alta de flota         0-Salir
                    -----------------------------------------""");
            System.out.print("Introduzca una opción: ");
            byte option = Byte.parseByte(sc.nextLine());
            System.out.println();
            switch (option) {
                case 1 -> altaNave();
                case 2 -> altaTripulante();
                case 3 -> altaFlota();
                case 4 -> consultaNave();
                case 5 -> consultaFlota();
                case 0 -> {
                    System.out.println("Que la fuerza te acompañe...");
                    System.exit(0);
                }
                default -> System.out.println("Eso no es una opción!");
            }
        } while (true);
    }

    private void consultaFlota() {
        System.out.println("Introduzca el nombre de la flota:");
        String nombre = sc.nextLine();
        boolean encontrada = flotas.stream().anyMatch(flota -> flota.getNombre().equalsIgnoreCase(nombre));
        if (encontrada) {
            flotas.forEach(flota -> {
                if (flota.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.printf("Encontrada la flota %s con %d naves:%n", nombre, flota.getNaves().size());
                    flota.getNaves().forEach(nave -> System.out.printf("\t- %s%n", nave.getNombre()));
                }
            });
        } else System.out.println("No se ha encontrado la flota!");
    }

    private void consultaNave() {
        System.out.println("Introduzca el nombre de la nave:");
        String nombre = sc.nextLine();
        boolean encontrada = naves.stream().anyMatch(nave -> nave.getNombre().equalsIgnoreCase(nombre));
        if (encontrada) {
            naves.forEach(nave -> {
                if (nave.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.printf("Encontrada la nave %s con %d tripulantes:%n", nombre, nave.getTripulantes().size());
                    nave.getTripulantes().forEach(tripulante -> System.out.printf("\t- %s %s (%d)%n", tripulante.getRango(), tripulante.getNombre(), tripulante.getEdad()));
                }
            });
        }
    }

    private void altaFlota() {
        System.out.println("Introduzca nombre para su flota:");
        String nombre = sc.nextLine();
        flotas.add(new Flota(nombre, new ArrayList<>() {{
            while (true) {
                System.out.printf("Introduzca nombre de nave para añadir a la flota %s (hasta teclear 'salir'):%n", nombre);
                String nombreNave = sc.nextLine();
                if (nombreNave.equalsIgnoreCase("salir")) break;
                else {
                    boolean encontrada = naves.stream().anyMatch(nave -> nave.getNombre().equalsIgnoreCase(nombreNave));
                    if (encontrada) {
                        for (Nave nave : naves) {
                            if (nave.getNombre().equalsIgnoreCase(nombreNave)) {
                                add(nave);
                                System.out.printf("La nave %s se añade a la flota %s.%n", nombreNave, nombre);
                                break;
                            }
                        }
                    } else System.out.println("No se encontró la nave!");
                }
            }
        }}));
    }

    private void altaTripulante() {
        System.out.println("Introduzca nombre de la nave donde desea dar de alta al tripulante:");
        String nombreNave = sc.nextLine();
        boolean encontrada = naves.stream().anyMatch(nave -> nave.getNombre().equalsIgnoreCase(nombreNave));
        if (encontrada) {
            System.out.printf("Introduzca el nombre del tripulante para la nave %s:%n", nombreNave);
            String nombre = sc.nextLine();
            System.out.println("Introduzca la edad del nuevo tripulante:");
            int edad = Integer.parseInt(sc.nextLine());
            String rango;
            do {
                System.out.println("Introduzca su rango (Soldado, Capitan, Comandante):");
                rango = sc.nextLine();
                String finalRango = rango;
                boolean isRank = Arrays.stream(Tripulante.rangos).anyMatch(rang -> rang.equalsIgnoreCase(finalRango));
                if (!isRank) System.out.println("No es un rango válido!");
                else break;
            } while (true);
            for (Nave nave : naves) {
                if (nave.getNombre().equalsIgnoreCase(nombreNave)) {
                    nave.addTripulantes(new Tripulante(nombre, edad, rango));
                    break;
                }
            }
        } else System.out.println("La nave " + nombreNave + " no existe!");
    }

    private void altaNave() {
        System.out.println("Introduzca nombre de la nave:");
        String nombre = sc.nextLine();
        naves.add(new Nave(nombre, new ArrayList<>()));
    }
}
