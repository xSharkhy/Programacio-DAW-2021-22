package unitatDidactica_06;

import java.util.ArrayList;
import java.util.Scanner;

public class UD06_02v2 {
    static final Scanner sc = new Scanner(System.in);
    static ArrayList<String> grupos = new ArrayList<>();

    public static void main(String[] args) {
        UD06_02v2 program = new UD06_02v2();
        program.menu();
    }

    private void menu() {
        String option;
        do {
            System.out.println("""
                                        
                    - GRUPOS MUSICALES -
                    \t1 - Agregar grupos al final de la lista.
                    \t2 - Agregar grupos en una posición concreta.
                    \t3 - Recuperar grupo en una posición determinada.
                    \t4 - Modificar grupo en una posición determinada.
                    \t5 - Posición del grupo en la lista.
                    \t6 - Imprimir lista.
                    \t7 - Salir del programa.
                    """);
            System.out.print("Introduzca una opción: ");
            option = sc.nextLine();
            System.out.println();
            switch (option) {
                case "1" -> agregarGrupos();
                case "2" -> agregarPosicion();
                case "3" -> recuperarGrupo();
                case "4" -> modificarGrupo();
                case "5" -> posicionGrupo();
                case "6" -> imprimirLista();
                case "7" -> {
                    System.out.println("Gracias por utilizar este menú.");
                    System.exit(0);
                }
                default -> System.out.println("No entiendo lo que dices con \"" + option + "\"! :(");
            }
        } while (true);
    }

    private void imprimirLista() {
        for (String grupo : grupos) System.out.println(grupo);
    }

    private void posicionGrupo() {
        System.out.println("Introduzca el grupo a buscar:");
        String grup = sc.nextLine();
        if (grupos.contains(grup)) System.out.printf("%s está en la posición: %d%n", grup, grupos.indexOf(grup));
        else System.out.println("El grupo no se encuentra en la Lista!");
    }

    private void modificarGrupo() {
        while (true) {
            System.out.printf("Introduzca la posición del grupo a modificar ( 0 - %d ):%n", grupos.size());
            try {
                byte pos = Byte.parseByte(sc.nextLine());
                System.out.printf("El grupo de la posición %d es: %s. ¿Cuál quieres que sea ahora?%n", pos, grupos.get(pos));
                grupos.set(pos, sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Eso no es una posición!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Posición fuera de límites!");
            }
        }
    }

    private void recuperarGrupo() {
        while (true) {
            System.out.printf("Introduzca la posición del grupo a recuperar ( 0 - %d ):%n", grupos.size());
            try {
                byte pos = Byte.parseByte(sc.nextLine());
                System.out.printf("El grupo contenido en la posición %d es: %s%n", pos, grupos.get(pos));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Eso no es una posición!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Posición fuera de límites!");
            }
        }
    }

    private void agregarPosicion() {
        System.out.println("Introduzca el nombre del grupo:");
        String grup = sc.nextLine();
        while (true) {
            System.out.printf("Introduzca posición del grupo ( 0 - %d ):%n", grupos.size());
            try {
                grupos.add(Integer.parseInt(sc.nextLine()), grup);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Eso no es una posición!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Posición fuera de límites!");
            }
        }
    }

    private void agregarGrupos() {
        System.out.printf("Introduzca el nombre del grupo que irá en la posición %d%n", grupos.size());
        grupos.add(sc.nextLine());
    }
}
