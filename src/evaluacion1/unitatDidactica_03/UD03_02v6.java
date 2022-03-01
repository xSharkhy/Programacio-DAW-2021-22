package evaluacion1.unitatDidactica_03;

import java.util.Scanner;

public class UD03_02v6 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD03_02v6 program = new UD03_02v6();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 2 ) o salir ( 3 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer37();
                case 2 -> ejer38();
                case 3 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);
    }

    private void ejer38() {
        System.out.println("\nEjercicio 38:\n");
        System.out.print("Escribe el primer número: ");
        double num1 = Double.parseDouble(sc.nextLine());
        System.out.print("Escribe el segundo número: ");
        double num2 = Double.parseDouble(sc.nextLine());
        if (num1 > 0 && num2 > 0) System.out.println("El producto es positivo.");
        if (num1 < 0 && num2 > 0) System.out.println("El producto es negativo.");
        if (num1 < 0 && num2 < 0) System.out.println("El producto es positivo.");
        if (num1 > 0 && num2 < 0) System.out.println("El producto es negativo.");
        if (num1 == 0 || num2 == 0) System.out.println("El producto es 0.");
    }

    private void ejer37() {
        System.out.println("\nEjercicio 37:\n");
        System.out.print("Escribe la coordenada X: ");
        double x = Double.parseDouble(sc.nextLine());
        System.out.print("Escribe la coordenada Y: ");
        double y = Double.parseDouble(sc.nextLine());
        if (x > 0 && y > 0) System.out.println("Está en el primer cuadrante.");
        if (x < 0 && y > 0) System.out.println("Está en el segundo cuadrante.");
        if (x < 0 && y < 0) System.out.println("Está en el tercer cuadrante.");
        if (x > 0 && y < 0) System.out.println("Está en el cuarto cuadrante.");
        if (x != 0 && y == 0) System.out.println("Está en el eje de abscisas.");
        if (x == 0 && y != 0) System.out.println("Está en el eje de ordenadas.");
        if (x == 0 && y == 0) System.out.println("Está en el origen de coordenadas.");
    }
}