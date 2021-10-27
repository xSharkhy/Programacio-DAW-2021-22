package unitatDidactica_02;

import java.util.Scanner;

public class UD02_04v1 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD02_04v1 program = new UD02_04v1();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 2 ) o salir ( 3 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer17();
                case 2 -> ejer18();
                case 3 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);

    }

    private void ejer18() {
        System.out.println("\nEjercicio 18: \n");
        System.out.println("Introduce la cantidad de MegaBytes a transformar:");
        double mb = Double.parseDouble(sc.nextLine());
        double kb = mb * 1024;
        double gb = mb / 1024;
        double tb = mb / 1048576;
        String separadorAbsurdo = "#######################################################################################################";
        System.out.println("El valor introducido es " + mb);
        System.out.println(separadorAbsurdo);
        System.out.printf("# %-12s# %-20s# %-20s# %-20s# %-20s#\n", "Unidad", "kB", "MB", "GB", "TB");
        System.out.println(separadorAbsurdo);
        System.out.printf("# %-12s# %-20.3f# %-20.3f# %-20.3f# %-20.3f#\n", "Valor", kb, mb, gb, tb);
        System.out.println(separadorAbsurdo);
    }

    private void ejer17() {
        System.out.println("\nEjercicio 17: \n");
        System.out.println("Introduce el primer valor entero:");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el segundo valor entero:");
        int y = Integer.parseInt(sc.nextLine());
        System.out.println("Los valores introducidos son " + x + " y " + y);
        int suma = x + y;
        int resta = x - y;
        int producto = x * y;
        double cociente = (double) x / y;
        String separadorAbsurdo = "#####################################################################################";
        System.out.println(separadorAbsurdo);
        System.out.printf("# %-10s# %-16s# %-16s# %-16s# %-16s#\n", "OPERACIÓN", "SUMA", "RESTA", "PRODUCTO", "COCIENTE");
        System.out.println(separadorAbsurdo);
        System.out.printf("# %-4s%-6d# %-16d# %-16d# %-16d# %-16.3f#\n", "x = ", x, suma, resta, producto, cociente);
        System.out.printf("# %-4s%-6d# %-64s#\n", "y = ", y, "                #                 #                 #                 ");
        System.out.println(separadorAbsurdo);
    }
}