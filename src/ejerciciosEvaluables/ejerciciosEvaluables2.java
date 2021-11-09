package ejerciciosEvaluables;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejerciciosEvaluables2 {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    static final String IES = "IES PACO PEREZ";

    public static void main(String[] args) {
        System.out.printf("BIENVENIDO AL %s%n", IES);
        System.out.println("PASO 1: Introduzca el numero de asignaturas");
        int asignaturaLenght = Integer.parseInt(sc.nextLine());
        String[] nAsignaturas = new String[asignaturaLenght];
        for (int i = 0; i < asignaturaLenght; i++) {
            System.out.printf("Introduzca nombre de la asignatura %d/%d:%n", i + 1, asignaturaLenght);
            nAsignaturas[i] = sc.nextLine();
            if (i > 0) {
                int j = 0;
                do {
                    if (nAsignaturas[i].equalsIgnoreCase(nAsignaturas[j])) {
                        System.out.printf("%s ya estaba dada de alta!%n", nAsignaturas[i]);
                        System.out.printf("Introduzca nombre de la asignatura %d/%d:%n", i + 1, asignaturaLenght);
                        nAsignaturas[i] = sc.nextLine();
                        if (nAsignaturas[i].equalsIgnoreCase(nAsignaturas[j])) {
                            continue;
                        } else {
                            j++;
                        }
                    } else {
                        break;
                    }
                } while (j < i);
            }
        }
        System.out.println("Se han dado de alta las siguientes asignaturas: ");
        for (int i = 0; i < asignaturaLenght; i++) {
            if (i != asignaturaLenght - 1) {
                System.out.printf("%s, ", nAsignaturas[i]);
            } else {
                System.out.printf("%s.", nAsignaturas[i]);
            }
        }
        System.out.println("\nPASO 2: Introduzca número de alumnos");
        int alumnoLenght = Integer.parseInt(sc.nextLine());
        String[] nAlumnos = new String[alumnoLenght];
        String[] nEmails = new String[alumnoLenght];
        int[] nNia = new int[alumnoLenght];
        for (int i = 0; i < alumnoLenght; i++) {
            nNia[i] = (int) (rd.nextDouble() * 401 + 100);
            System.out.printf("Introduzca los datos del alumno %d/%d:%n", i + 1, alumnoLenght);
            System.out.println("Introduzca el nombre: ");
            nAlumnos[i] = sc.nextLine();
            System.out.println("Introduzca el email: ");
            nEmails[i] = sc.nextLine();
            char firstChar = nEmails[i].charAt(0);
            while (firstChar == '@') {
                System.out.println("ERROR: El mail no puede comenzar por el caracter @.");
                nEmails[i] = sc.nextLine();
                firstChar = nEmails[i].charAt(0);
            }
            while (nEmails[i].indexOf('@') == -1) {
                System.out.println("ERROR: Debe haber un @ en el correo.");
                nEmails[i] = sc.nextLine();
            }
            String[] partes = nEmails[i].split("@");
            while (partes[1].contains(".com") && partes[1].contains(".es")) {
                System.out.println("ERROR: El correo no tiene dominio .com ni .es");
                System.out.println("Introduzca el email:");
                nEmails[i] = sc.nextLine();
            }
            while (nEmails[i].indexOf('@') < 4) {
                System.out.println("ERROR: Antes de @ debe contener 4 caracteres.");
                nEmails[i] = sc.nextLine();
            }
        }
        Arrays.sort(nNia);
        System.out.println("Se han dado de alta los alumnos siguientes: ");
        for (int i = 0; i < alumnoLenght; i++) {
            System.out.printf("%d: %s, email: %s%n", nNia[i], nAlumnos[i], nEmails[i]);
        }
        System.out.println("\nPASO 3: Vamos a matricular a los alumnos");
        String[] matricula = new String[alumnoLenght];
        for (int i = 0; i < alumnoLenght; i++) {
            matricula[i] = "";
        }
        do {
            System.out.println("Introduzca nombre del alumno o salir");
            String nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }
            while (true) {
                if (Arrays.asList(nAlumnos).contains(nombre)) {
                    break;
                } else {
                    System.out.printf("El alumno %s no existe!%n", nombre);
                    System.out.println("Introduzca nombre del alumno o salir");
                    nombre = sc.nextLine();
                    if (nombre.equalsIgnoreCase("salir")) {
                        break;
                    }
                }
            }
            System.out.println("Introduzca nombre de la asignatura o salir");
            String asignatura = sc.nextLine();
            if (asignatura.equalsIgnoreCase("salir")) {
                break;
            }
            while (true) {
                if (Arrays.asList(nAsignaturas).contains(asignatura)) {
                    System.out.printf("Se ha matriculado a %s en %s.%n", nombre, asignatura);
                    break;
                } else {
                    System.out.printf("La asignatura %s no existe!%n", asignatura);
                    System.out.println("Introduzca nombre de la asignatura o salir");
                    asignatura = sc.nextLine();
                    if (asignatura.equalsIgnoreCase("salir")) {
                        break;
                    }
                }
            }
            for (int i = 0; i < matricula.length; i++) {
                if (nombre.equalsIgnoreCase(nAlumnos[i])) {
                    matricula[i] += (asignatura + ", ");
                }
            }
        } while (true);
        System.out.println("\nPASO 4: Resultado de la matricula:");
        for (int i = 0; i < alumnoLenght; i++) {
            System.out.printf("%d: %s, email: %s %s%n", nNia[i], nAlumnos[i], nEmails[i], matricula[i]);
        }
    }
}
