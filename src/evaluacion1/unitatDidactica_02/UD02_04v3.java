package evaluacion1.unitatDidactica_02;

import java.util.Scanner;

public class UD02_04v3 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD02_04v3 program = new UD02_04v3();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 4 ) o salir ( 5 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer22();
                case 2 -> ejer23();
                case 3 -> ejer24();
                case 4 -> ejer25();
                case 5 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);

    }

    private void ejer25() {
        System.out.println("\nEjercicio 25:\n");
        System.out.println("Inserta valor de 'a':");
        double lado1 = Double.parseDouble(sc.nextLine());
        System.out.println("Inserta valor de 'b':");
        double lado2 = Double.parseDouble(sc.nextLine());
        double hipo = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
        System.out.println("El valor de la hipotenusa es " + hipo);
    }

    private void ejer24() {
        System.out.println("\nEjercicio 24:\n");
        System.out.println("Inserta valor de 'a':");
        double a = Double.parseDouble(sc.nextLine());
        boolean validate = false;
        while (!validate) {
            if (a == 0.0) {
                System.out.println("Eso traería problemas... Inserta un valor distinto a 0.");
                a = Double.parseDouble(sc.nextLine());
            } else {
                validate = true;
            }
        }
        System.out.println("Inserta valor de 'b':");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Inserta valor de 'c':");
        double c = Double.parseDouble(sc.nextLine());
        if (b > 0 && c > 0) System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
        if (b < 0 && c > 0) System.out.println(a + "x^2 " + b + "x + " + c + " = 0");
        if (b > 0 && c < 0) System.out.println(a + "x^2 + " + b + "x " + c + " = 0");
        if (b < 0 && c < 0) System.out.println(a + "x^2 " + b + "x " + c + " = 0");
        double radical = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        double root1 = (-b + radical) / (2 * a);
        double root2 = (-b - radical) / (2 * a);
        if (Double.isNaN(root1) || Double.isNaN(root2)) {
            System.out.println("La respuesta contiene números imaginarios.");
        } else {
            System.out.println("Valores de las raíces para los valores introducidos son " + root1 + " y " + root2);
        }
    }

    private void ejer23() {
        System.out.println("\nEjercicio 23:\n");
        System.out.println("Introduzca fecha de nacimiento en formato AAAA MM DD:");
        String fechaNacimiento = sc.nextLine();
        String[] parts = fechaNacimiento.split(" ");
        System.out.println("Introduzca NIF:");
        String nif = sc.nextLine();
        System.out.println("Introduzca nombre completo:");
        String nombre = sc.nextLine();
        System.out.println("Introduzca dirección:");
        String direccion = sc.nextLine();
        System.out.println("Introduzca salario:");
        double salario = Double.parseDouble(sc.nextLine());
        System.out.println("Introduzca retención:");
        byte retencion = Byte.parseByte(sc.nextLine());
        double salarioNeto = salario * ((100 - (double) retencion) / 100);
        String separadorAbsurdo = "---------------------------------------------------------------";
        System.out.println("\nINFORME DEL TRABAJADOR");
        System.out.println(separadorAbsurdo);
        System.out.printf("Nombre..........................: %s\n", nombre);
        System.out.printf("Dirección.......................: %s\n\n", direccion);
        System.out.printf("NIF.............................: %s\n", nif);
        System.out.printf("Fecha de nacimiento.............: %s del mes %s del año %s\n\n", parts[2], parts[1], parts[0]);
        System.out.printf("Salario bruto...................: %.2f\n", salario);
        System.out.printf("Retención.......................: %d%%\n", retencion);
        System.out.printf("Salario neto....................: %.2f\n", salarioNeto);
        System.out.println(separadorAbsurdo);

    }

    private void ejer22() {
        System.out.println("\nEjercicio 22:\n");
        System.out.println("Introduzca número de estudiante:");
        byte numEstudiante = Byte.parseByte(sc.nextLine());
        System.out.println("Introduzca nombre del alumno:");
        String nombreEstudiante = sc.nextLine();
        double[] array = new double[3];
        double v = 0;
        System.out.println("Introduzca TRES notas, pulse ENTER entre cada una:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            array[i] = Double.parseDouble(sc.nextLine());
        }
        for (double value : array) {
            v = v + value;
        }
        double average = v / array.length;
        System.out.printf("\nAlumno %d - %-32sex.1\tex.2\tex.3\tmedia\n", numEstudiante, nombreEstudiante);
        System.out.printf("Notas 1era evaluación:\t\t\t\t\t\t%.2f \t%.2f \t%.2f\t%.2f\n", array[0], array[1], array[2], average);
    }
}