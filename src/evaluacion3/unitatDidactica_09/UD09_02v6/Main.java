package evaluacion3.unitatDidactica_09.UD09_02v6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final ArrayList<Mascota> mascotas = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    ---------------------------------
                    1-Dar de alta una mascota
                    2-Escuchar perros y gatos
                    3-Escuchar periquitos y conejos
                    4-Escuchar gatos y periquitos
                    5-Escuchar perros y conejos
                    6-Salir
                    ---------------------------------""");
            int opt = Integer.parseInt(sc.nextLine());
            switch (opt) {
                case 1 -> alta();
                case 2, 3, 4, 5 -> mascotas.forEach(mascota -> {
                    switch (opt) {
                        case 2 -> {
                            if (mascota instanceof Perro || mascota instanceof Gato)
                                System.out.println(mascota.sonido());
                        }
                        case 3 -> {
                            if (mascota instanceof Periquito || mascota instanceof Conejo)
                                System.out.println(mascota.sonido());
                        }
                        case 4 -> {
                            if (mascota instanceof Gato || mascota instanceof Periquito)
                                System.out.println(mascota.sonido());
                        }
                        case 5 -> {
                            if (mascota instanceof Perro || mascota instanceof Conejo)
                                System.out.println(mascota.sonido());
                        }
                    }
                });
                case 6 -> {
                    System.out.println("Gracias por utilizar el programa de Mascotas");
                    System.exit(0);
                }
                default -> {
                    try {
                        throw new IllegalStateException("Valor no válido: " + opt);
                    } catch (IllegalStateException ISE) {
                        System.out.println(ISE.getMessage());
                    }
                }
            }
        }
    }

    private static void alta() {
        String opt = "";
        while (!(opt.equalsIgnoreCase("P") || opt.equalsIgnoreCase("G") || opt.equalsIgnoreCase("Q") || opt.equalsIgnoreCase("C"))) {
            System.out.println("Introduzca el tipo de mascota a dar de alta (P-Perro/G-Gato/Q-Periquito/C-Conejo):");
            opt = sc.nextLine();
        }
        System.out.println("Introduzca el nombre de la mascota:");
        String name = sc.nextLine();
        if (opt.equalsIgnoreCase("P")) {
            mascotas.add(new Perro(name));
            opt = "perro";
        } else if (opt.equalsIgnoreCase("G")) {
            mascotas.add(new Gato(name));
            opt = "gato";
        } else if (opt.equalsIgnoreCase("Q")) {
            mascotas.add(new Periquito(name));
            opt = "periquito";
        } else {
            mascotas.add(new Conejo(name));
            opt = "conejo";
        }
        System.out.printf("Se ha dado de alta a un %s de nombre %s.%n", opt, name);
    }
}