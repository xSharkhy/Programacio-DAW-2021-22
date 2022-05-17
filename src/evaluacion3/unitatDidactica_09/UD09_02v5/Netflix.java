package evaluacion3.unitatDidactica_09.UD09_02v5;

import evaluacion3.unitatDidactica_09.UD09_02v5.Excepciones.NumeroPremiosExcepcion;
import evaluacion3.unitatDidactica_09.UD09_02v5.Excepciones.NumeroTemporadasExcepcion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.*;

public class Netflix {

    private static final Scanner sc = new Scanner(System.in);
    private ArrayList<Contenido> lista = new ArrayList<>();

    public static void main(String[] args) {
        Netflix netflix = new Netflix();
        netflix.start();
    }

    private void start() {
        System.out.println("""
                ▀███▄   ▀███▀ ▀███▀▀▀███  ███▀▀██▀▀███ ▀███▀▀▀███ ▀████▀     ▀████▀ ▀███▀   ▀██▀
                  ███▄    █     ██    ▀█  █▀   ██   ▀█   ██    ▀█   ██         ██     ███▄  ▄█
                  █ ███   █     ██   █         ██        ██   █     ██         ██      ▀██▄█▀
                  █  ▀██▄ █     ██████         ██        ██▀▀██     ██         ██        ███
                  █   ▀██▄█     ██   █  ▄      ██        ██   █     ██     ▄   ██      ▄█▀▀██▄
                  █     ███     ██     ▄█      ██        ██         ██    ▄█   ██     ▄█   ▀██▄
                ▄███▄    ██   ▄██████████    ▄████▄    ▄████▄     ██████████ ▄████▄ ▄██▄▄  ▄▄███▄
                """);
        while (true) {
            try {
                menu();
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número!");
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void menu() throws IllegalStateException {
        System.out.println("""
                -----------------------------
                1-Dar de alta una pelicula
                2-Dar de alta una serie
                3-Ver un contenido
                4-Listar contenido
                5-Listar contenido pendiente por ver
                6-Salir
                -----------------------------""");
        int opt = parseInt(sc.nextLine());
        switch (opt) {
            case 1, 2 -> alta(opt);
            case 3 -> System.out.println(visualizar());
            case 4 -> lista.forEach(System.out::println);
            case 5 -> lista.stream().filter(contenido -> !contenido.isVisto()).forEach(System.out::println);
            case 6 -> {
                System.out.println("Gracias por utilizar Netflix");
                System.exit(0);
            }
            default -> throw new IllegalStateException("Valor no válido: " + opt);
        }

    }

    private String visualizar() {
        System.out.println("Introduzca el titulo del contenido que quiere visualizar:");
        String s = sc.nextLine();
        for (Contenido c : lista) {
            if (c.getTitulo().equalsIgnoreCase(s)) {
                c.setVisto(true);
                return "El contenido %s marcado como visto!%n".formatted(s);
            }
        }
        return "El contenido %s no existe en Netflix.".formatted(s);
    }

    private void alta(int i) {
        String tipo = i == 1 ? "pelicula" : "serie";
        System.out.printf("Introduzca título de la %s:%n", tipo);
        String titulo = sc.nextLine();
        System.out.printf("Introduzca productora de la %s:%n", tipo);
        String productora = sc.nextLine();
        System.out.println("Introduzca año de publicación:");
        int anyo = parseInt(sc.nextLine());
        switch (i) {
            case 1:
                while (true) {
                    try {
                        System.out.println("Numero de nominaciones a los oscars:");
                        int nominaciones = parseInt(sc.nextLine());
                        System.out.println("Numero de oscars ganados:");
                        int oscar = parseInt(sc.nextLine());
                        lista.add(new Pelicula(titulo, productora, anyo, false, nominaciones, oscar));
                        break;
                    } catch (NumeroPremiosExcepcion NPE) {
                        System.out.println(NPE.getMessage());
                    }
                }
                break;
            case 2:
                while (true) {
                    try {
                        System.out.println("Introduzca numero de temporadas:");
                        int temporadas = parseInt(sc.nextLine());
                        boolean finalizada;
                        while (true) {
                            System.out.println("¿La serie está finalizada o no? (S/N):");
                            String s = sc.nextLine();
                            finalizada = s.equalsIgnoreCase("s");
                            if (finalizada || s.equalsIgnoreCase("n")) break;
                        }
                        lista.add(new Serie(titulo, productora, anyo, false, temporadas, finalizada));
                        break;
                    } catch (NumeroTemporadasExcepcion NTE) {
                        System.out.println(NTE.getMessage());
                    }
                }
                break;
        }
        System.out.printf("La %s %s ha sido dada de alta correctamente!%n", tipo, titulo);
    }
}
