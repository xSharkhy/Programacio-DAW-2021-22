package myPrograms;

import java.util.Scanner;

public class Matricula {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Matricula program = new Matricula();
        program.init();
    }

    private void init() {
        System.out.println("Introduce el NIF y presiona la tecla Enter:");
        String NIF = input.nextLine();

        System.out.println("Introduce el nombre completo y presiona la tecla Enter:");
        String nombre = input.nextLine();

        System.out.println("Introduce la fecha de nacimiento (DD/MM/AAAA) y presiona la tecla Enter:");
        String fechaNacimiento = input.nextLine();

        System.out.println("Introduce la calle y número y presiona la tecla Enter:");
        String direccion = input.nextLine();

        System.out.println("Introduce el código postal y presiona la tecla Enter:");
        int codigoPostal = input.nextInt();
        input.nextLine();

        System.out.println("Introduce la población y presiona la tecla Enter:");
        String poblacion = input.nextLine();

        System.out.println("Introduce el teléfono fijo y presiona la tecla Enter:");
        int telFijo = input.nextInt();
        input.nextLine();

        System.out.println("Introduce el teléfono móvil y presiona la tecla Enter:");
        int telMovil = input.nextInt();
        input.nextLine();

        int datos;
        do {
            System.out.println("¿Son estos datos correctos? (0: sí, 1: no)" +
                    "\n NIF: " + NIF +
                    "\n Nombre: " + nombre +
                    "\n Fecha de nacimiento: " + fechaNacimiento +
                    "\n Dirección: " + direccion +
                    "\n Código Postal: " + codigoPostal +
                    "\n Población: " + poblacion +
                    "\n Teléfono fijo: " + telFijo +
                    "\n Teléfono móvil: " + telMovil);

            datos = input.nextInt();
            if (datos == 0) {
                System.out.println("El alumno " + nombre + " de NIF " + NIF + ", nacido el " + fechaNacimiento + "," +
                        "\ncon residencia en " + direccion + ", " + codigoPostal + ", " + poblacion + "\ny teléfonos de" +
                        " contacto fijo: " + telFijo + " y móvil: " + telMovil + ".");
                System.exit(0);
            } else if (datos == 1) {
                int incorrecto;
                do {
                    System.out.println("""
                            ¿Qué dato es incorrecto?
                            NIF: 0
                            Nombre: 1
                            Fecha de nacimiento: 2
                            Dirección: 3
                            Código Postal: 4
                            Población: 5
                            Teléfono fijo: 6
                            Teléfono móvil: 7
                            No hay datos incorrectos: 8""");
                    incorrecto = input.nextInt();
                    input.nextLine();
                    switch (incorrecto) {
                        case 0 -> {
                            System.out.println("Reintroduzca el NIF: ");
                            NIF = input.nextLine();
                        }
                        case 1 -> {
                            System.out.println("Reintroduzca el Nombre: ");
                            nombre = input.nextLine();
                        }
                        case 2 -> {
                            System.out.println("Reintroduzca el Fecha de nacimiento (DD/MM/AAAA): ");
                            fechaNacimiento = input.nextLine();
                        }
                        case 3 -> {
                            System.out.println("Reintroduzca el Dirección: ");
                            direccion = input.nextLine();
                        }
                        case 4 -> {
                            System.out.println("Reintroduzca el Código Postal: ");
                            codigoPostal = input.nextInt();
                            input.nextLine();
                        }
                        case 5 -> {
                            System.out.println("Reintroduzca el Población: ");
                            poblacion = input.nextLine();
                        }
                        case 6 -> {
                            System.out.println("Reintroduzca el Teléfono fijo: ");
                            telFijo = input.nextInt();
                            input.nextLine();
                        }
                        case 7 -> {
                            System.out.println("Reintroduzca el Teléfono móvil: ");
                            telMovil = input.nextInt();
                            input.nextLine();
                        }
                        case 8 ->
                                System.out.println("El alumno " + nombre + " de NIF " + NIF + ", nacido el " + fechaNacimiento + "," +
                                        "\ncon residencia en " + direccion + ", " + codigoPostal + ", " + poblacion + "\ny teléfonos de" +
                                        " contacto fijo: " + telFijo + " y móvil: " + telMovil + ".");
                        default -> System.out.println("Entrada Incorrecta.");
                    }
                } while (incorrecto != 8);
            } else System.out.println("Entrada Incorrecta");
        } while (datos != 0 && datos != 1);
    }
}
