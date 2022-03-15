package myPrograms;

import java.util.Scanner;

public class Quadratic {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Quadratic program = new Quadratic();
        program.init();
    }

    private void init() {
        // TODO: 23/9/21 Surround with try/catch for NumberFormatException.
        // NumberFormat y no InputMismatch por el uso de parseDouble.
        System.out.println("Inserta valor de 'a':");
        double a = Double.parseDouble(input.nextLine());
        a = validateDoubleA(a);
        System.out.println("Inserta valor de 'b':");
        double b = Double.parseDouble(input.nextLine());
        System.out.println("Inserta valor de 'c':");
        double c = Double.parseDouble(input.nextLine());
        input.close();
        displayQuadratic(a, b, c);
        root1(a, b, c);
        root2(a, b, c);
        if (Double.isNaN(root1(a, b, c)) || Double.isNaN(root2(a, b, c))) {
            System.out.println("La respuesta contiene números imaginarios.");
        } else {
            System.out.println("Valores de las raíces para los valores introducidos son " + root1(a, b, c) + " y " + root2(a, b, c));
        }
    }

    private double validateDoubleA(double a) {
        boolean validate = false;
        while (!validate) {
            if (a == 0.0) {
                System.out.println("Eso traería problemas... Inserta un valor distinto a 0.");
                a = Double.parseDouble(input.nextLine());
            } else {
                validate = true;
            }
        }
        return a;
    }

    private void displayQuadratic(double a, double b, double c) {
        if (b > 0 && c > 0) System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
        if (b < 0 && c > 0) System.out.println(a + "x^2 " + b + "x + " + c + " = 0");
        if (b > 0 && c < 0) System.out.println(a + "x^2 + " + b + "x " + c + " = 0");
        if (b < 0 && c < 0) System.out.println(a + "x^2 " + b + "x " + c + " = 0");
    }

    private double root1(double a, double b, double c) {
        return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }

    private double root2(double a, double b, double c) {
        return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }
}