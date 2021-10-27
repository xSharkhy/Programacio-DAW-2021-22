package myPrograms;

import java.util.Scanner;

public class Horoscopo {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Horoscopo program = new Horoscopo();
        program.init();
    }

    private void init() {
        int modulo = validarNumero() % 12;
        menuHoroscopo(modulo);
    }

    private int validarNumero() {
        int nacimiento;
        do {
            System.out.println("Introduce el año de nacimiento:");
            while (!input.hasNextInt()) {
                System.out.println("no es un número válido");
                input.next();
            }
            nacimiento = input.nextInt();
        } while (nacimiento < 0);
        return nacimiento;
        // System.out.println("Introduce el año de nacimiento:");
        // int nacimiento = input.nextInt();
        // try {
        //     int validar = Integer.parseInt(String.valueOf(nacimiento));
        // } catch (NumberFormatException e) {
        //     System.out.println("No es un número válido");
        // }
    }

    private void menuHoroscopo(int modulo) {
        switch (modulo) {
            case 0, -12 -> System.out.println("La persona nacida en este año pertenece al calendario del Mono");
            case 1, -11 -> System.out.println("La persona nacida en este año pertenece al calendario del Gallo");
            case 2, -10 -> System.out.println("La persona nacida en este año pertenece al calendario del Perro");
            case 3, -9 -> System.out.println("La persona nacida en este año pertenece al calendario del Cerdo");
            case 4, -8 -> System.out.println("La persona nacida en este año pertenece al calendario del Rata");
            case 5, -7 -> System.out.println("La persona nacida en este año pertenece al calendario del Buey");
            case 6, -6 -> System.out.println("La persona nacida en este año pertenece al calendario del Tigre");
            case 7, -5 -> System.out.println("La persona nacida en este año pertenece al calendario del Conejo");
            case 8, -4 -> System.out.println("La persona nacida en este año pertenece al calendario del Dragón");
            case 9, -3 -> System.out.println("La persona nacida en este año pertenece al calendario del Serpiente");
            case 10, -2 -> System.out.println("La persona nacida en este año pertenece al calendario del Caballo");
            case 11, -1 -> System.out.println("La persona nacida en este año pertenece al calendario del Cabra");
        }
    }
}
