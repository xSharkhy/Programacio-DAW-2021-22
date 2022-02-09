package ejerciciosEvaluables;

import java.util.Scanner;

public class practica22 {
    static final Scanner sc = new Scanner(System.in);
    static String[] ciudad1;
    static String[] ciudad2;
    static String[] ciudad3;
    static String[] ciudad4;
    static int c = 0;

    public static void main(String[] args) {
        while (true) practica22.pintar_menu();
    }

    private static void pintar_menu() {
        System.out.println();
        System.out.println("1 - Introduce temperaturas de una ciudad");
        System.out.println("2 - Listar temperaturas de todas las ciudades");
        System.out.println("3 - Salir");
        byte options = Byte.parseByte(sc.nextLine());
        switch (options) {
            case 1 -> {
                c++;
                switch (c) {
                    case 1 -> {
                        ciudad1 = new String[5];
                        ciudad1[0] = introducir_nombre_ciudad();
                        for (int i = 1; i < 5; i++) ciudad1[i] = String.valueOf(leer_temperatura(ciudad1[0], i));
                    }
                    case 2 -> {
                        ciudad2 = new String[5];
                        ciudad2[0] = introducir_nombre_ciudad();
                        for (int i = 1; i < 5; i++) ciudad2[i] = String.valueOf(leer_temperatura(ciudad2[0], i));
                    }
                    case 3 -> {
                        ciudad3 = new String[5];
                        ciudad3[0] = introducir_nombre_ciudad();
                        for (int i = 1; i < 5; i++) ciudad3[i] = String.valueOf(leer_temperatura(ciudad3[0], i));
                    }
                    case 4 -> {
                        ciudad4 = new String[5];
                        ciudad4[0] = introducir_nombre_ciudad();
                        for (int i = 1; i < 5; i++) ciudad4[i] = String.valueOf(leer_temperatura(ciudad4[0], i));
                    }
                    default -> System.out.println("Ya hay 4 ciudades!");
                }
            }
            case 2 -> listar_temperaturas();
            case 3 -> System.exit(0);
            default -> System.out.println("No te entiendo :(");
        }
    }

    private static void listar_temperaturas() {
        if (c == 0) System.out.println(pintar_registros());
        if (c == 1) pintar_registros(ciudad1);
        if (c == 2) pintar_registros(ciudad1, ciudad2);
        if (c == 3) pintar_registros(ciudad1, ciudad2, ciudad3);
        if (c >= 4) pintar_registros(ciudad1, ciudad2, ciudad3, ciudad4);
    }

    private static String pintar_registros() {
        return "No hay registros!";
    }

    private static void pintar_registros(String[] ciudad1) {
        System.out.printf("%s tiene registradas las siguientes temperaturas: %s, %s, %s, %s.%n", ciudad1[0], ciudad1[1], ciudad1[2], ciudad1[3], ciudad1[4]);
    }

    private static void pintar_registros(String[] ciudad1, String[] ciudad2) {
        System.out.printf("%s tiene registradas las siguientes temperaturas: %s, %s, %s, %s.%n", ciudad1[0], ciudad1[1], ciudad1[2], ciudad1[3], ciudad1[4]);
        System.out.printf("%s tiene registradas las siguientes temperaturas: %s, %s, %s, %s.%n", ciudad2[0], ciudad2[1], ciudad2[2], ciudad2[3], ciudad2[4]);
    }

    private static void pintar_registros(String[] ciudad1, String[] ciudad2, String[] ciudad3) {
        System.out.printf("%s tiene registradas las siguientes temperaturas: %s, %s, %s, %s.%n", ciudad1[0], ciudad1[1], ciudad1[2], ciudad1[3], ciudad1[4]);
        System.out.printf("%s tiene registradas las siguientes temperaturas: %s, %s, %s, %s.%n", ciudad2[0], ciudad2[1], ciudad2[2], ciudad2[3], ciudad2[4]);
        System.out.printf("%s tiene registradas las siguientes temperaturas: %s, %s, %s, %s.%n", ciudad3[0], ciudad3[1], ciudad3[2], ciudad3[3], ciudad3[4]);
    }

    private static void pintar_registros(String[] ciudad1, String[] ciudad2, String[] ciudad3, String[] ciudad4) {
        System.out.printf("%s tiene registradas las siguientes temperaturas: %s, %s, %s, %s.%n", ciudad1[0], ciudad1[1], ciudad1[2], ciudad1[3], ciudad1[4]);
        System.out.printf("%s tiene registradas las siguientes temperaturas: %s, %s, %s, %s.%n", ciudad2[0], ciudad2[1], ciudad2[2], ciudad2[3], ciudad2[4]);
        System.out.printf("%s tiene registradas las siguientes temperaturas: %s, %s, %s, %s.%n", ciudad3[0], ciudad3[1], ciudad3[2], ciudad3[3], ciudad3[4]);
        System.out.printf("%s tiene registradas las siguientes temperaturas: %s, %s, %s, %s.%n", ciudad4[0], ciudad4[1], ciudad4[2], ciudad4[3], ciudad4[4]);
    }

    private static int leer_temperatura(String nombre_ciudad, int orden_temperatura) {
        System.out.printf("Vamos a introducir la temperatura %d de %s:%n", orden_temperatura, nombre_ciudad);
        return Integer.parseInt(sc.nextLine());
    }

    public static String introducir_nombre_ciudad() {
        System.out.println("Introduzca nombre de la ciudad:");
        return sc.nextLine();
    }
}
