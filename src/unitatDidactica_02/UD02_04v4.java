package unitatDidactica_02;

import java.util.Scanner;

public class UD02_04v4 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD02_04v4 program = new UD02_04v4();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 3 ) o salir ( 4 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer26();
                case 2 -> ejer27();
                case 3 -> ejer28();
                case 4 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);

    }

    private void ejer28() {
        System.out.println("\nEjercicio 28:\n");
        System.out.println("Bienvenido al programa donde todo sale redondo!");
        System.out.println("-----------------------------------------------");
        System.out.println("Introduzca el valor del radio:");
        double radius = Double.parseDouble(sc.nextLine());
        System.out.println("La longitud de la circunferencia es: " + (Math.PI * 2 * radius));
        System.out.println("El area de la circunferencia es: " + (Math.PI * Math.pow(radius,2)));
        System.out.println("Si fuera una esfera, su volumen sería: " + ((4.0/3.0) * Math.PI * Math.pow(radius,3)));
    }

    private void ejer27() {
        System.out.println("\nEjercicio 27:\n");
        int x = 10;
        System.out.println(x + "\t(PRINT X)\tEl programa imprime el valor de la variable \"x\" ( 10 ).");
        x++;
        System.out.println(x + "\t(PRINT X)\tEl programa tras sumar 1, imprime el valor de la variable \"x\" ( 11 ).");
        System.out.println(++x + "\t(PRINT ++X)\tEl programa suma 1 Y LUEGO imprime el valor de la variable \"x\" ( 12 ).");
        System.out.println(x++ + "\t(PRINT X++)\tEl programa imprime el valor de la variable Y LUEGO suma 1 \"x\" ( 13 ).");    //printa valor de X y luego suma 1 (12 + 1)
        System.out.println(x + "\t(PRINT X)\tEl programa imprime el valor de la variable \"x\" ( 13 ).");      //printa valor de X (X = 13)
        System.out.println(x++ + "\t(PRINT X++)\tEl programa imprime el valor de la variable Y LUEGO suma 1 \"x\" ( 14 )");    //printa valor de X y luego suma 1 (13 + 1)
        System.out.println(++x + "\t(PRINT ++X)\tEl programa suma 1 Y LUEGO imprime el valor de la variable \"x\" ( 15 ).");    //suma y printa nuevo valor de X (X = 14 + 1)
    }

    private void ejer26() {

    }
}