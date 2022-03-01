package evaluacion1.unitatDidactica_04;

import java.util.Scanner;

public class UD04_02v2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD04_02v2 program = new UD04_02v2();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 2 ) o salir ( 3 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer54();
                case 2 -> ejer55();
                case 3 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);
    }

    private void ejer55() {
        System.out.println("\nEjercicio 55:\n");
        byte option;
        do {
            System.out.print("""
                    \n<<< BIENVENIDO AL MENÚ >>>
                    1.- Longitud de una cadena.
                    2.- Comparación de dos cadenas.
                    3.- Concatenación de dos cadenas.
                    4.- Obtener subcadenas.
                    5.- Invertir cadenas.
                    6.- Es palíndromo.
                    9.- Salir.
                    Tu selección:\040""");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> {
                    System.out.println("Introduce una cadena: ");
                    System.out.println(sc.nextLine().length());
                }
                case 2 -> {
                    System.out.println("Introduce la primera cadena: ");
                    String str1 = sc.nextLine();
                    System.out.println("Introduce la segunda cadena: ");
                    String str2 = sc.nextLine();
                    String resultado = str1.compareToIgnoreCase(str2) > 0 ?
                            "La primera cadena es mayor." : str1.compareToIgnoreCase(str2) < 0 ?
                            "La segunda cadena es mayor." : "Las cadenas son iguales.";
                    System.out.println(resultado);
                }
                case 3 -> {
                    System.out.println("Introduce la primera cadena: ");
                    String str1 = sc.nextLine();
                    System.out.println("Introduce la segunda cadena: ");
                    String str2 = sc.nextLine();
                    System.out.println(str1 + str2);
                }
                case 4 -> {
                    System.out.println("Introduce una cadena: ");
                    String str1 = sc.nextLine();
                    System.out.println("Introduce dónde cortar la subcadena: ");
                    System.out.println(str1.substring(sc.nextInt(), sc.nextInt()));
                    sc.nextLine();
                }
                case 5 -> {
                    System.out.println("Introduce una cadena: ");
                    StringBuilder str = new StringBuilder(sc.nextLine());
                    System.out.println(str.reverse());
                }
                case 6 -> {
                    System.out.println("Introduce una cadena: ");
                    String str = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
                    StringBuilder textoPlano = new StringBuilder(str);
                    StringBuilder textoInvertido = textoPlano.reverse();
                    String resultado = textoInvertido.toString().equals(str) ? "Es palíndromo" : "No es palíndromo";
                    System.out.println(resultado);
                }
                case 9 -> {
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                }
                default -> System.out.println("Mal input, ¡inténtalo de nuevo!");
            }
        } while (true);
    }

    private void ejer54() {
        System.out.println("\nEjercicio 54:\n");
        System.out.print("Introduce ÚNICAMENTE los números del DNI: ");
        int DNI = Integer.parseInt(sc.nextLine());
        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int module = DNI % 23;
        System.out.println(Integer.toString(DNI) + letra[module]);
    }
}