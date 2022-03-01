package evaluacion1.unitatDidactica_02;

import java.util.Scanner;

public class UD02_02v1 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD02_02v1 program = new UD02_02v1();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 3 ) o salir ( 4 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer1();
                case 2 -> ejer2();
                case 3 -> ejer3();
                case 4 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);

    }

    private void ejer3() {
        System.out.println("Ejercicio 3: \n");
        System.out.println("Introduce el NIF y presiona la tecla Enter:");
        String nif = sc.nextLine();
        System.out.println("Introduce el nombre completo y presiona la tecla Enter:");
        String nombre = sc.nextLine();
        System.out.println("Introduce la fecha de nacimiento (DD/MM/AAAA) y presiona la tecla Enter:");
        String fechaNacimiento = sc.nextLine();
        System.out.println("Introduce la calle y número y presiona la tecla Enter:");
        String direccion = sc.nextLine();
        System.out.println("Introduce el código postal y presiona la tecla Enter:");
        int codigoPostal = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce la población y presiona la tecla Enter:");
        String poblacion = sc.nextLine();
        System.out.println("Introduce el teléfono fijo y presiona la tecla Enter:");
        int telFijo = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el teléfono móvil y presiona la tecla Enter:");
        int telMovil = Integer.parseInt(sc.nextLine());

        System.out.println("El alumno " + nombre + " de NIF " + nif + ", nacido el " + fechaNacimiento + "," +
                "\ncon residencia en " + direccion + ", " + codigoPostal + ", " + poblacion + "\ny teléfonos de" +
                " contacto fijo: " + telFijo + " y móvil: " + telMovil + ".");
    }

    private void ejer2() {
        System.out.println("Ejercicio 2: \n");
        System.out.println("Introduce tu nombre y presiona la tecla Enter:");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu edad y presiona la tecla Enter:");
        byte edad = Byte.parseByte(sc.nextLine());
        System.out.println("Introduce tu altura en metros y presiona la tecla Enter:");
        float altura = Float.parseFloat(sc.nextLine());
        System.out.printf("Te llamas %s, tienes %s años y mides %s metros. Soy adivino!%n", nombre, edad, altura);
    }

    private void ejer1() {
        System.out.println("Ejercicio 1: \n");
        short year = 2021;
        System.out.println("Buenas noches. En estos días tan especiales a finales del año " +
                year + "\nen los que siempre nos deben unirlos mejores sentimientos os deseo,\n" +
                "junto a la Reina y nuestras hijas, una Feliz Navidad y que en el próximo \n" +
                "año " + year++ + " podáis ver cumplidos vuestros anhelos y aspiraciones");
    }
}
