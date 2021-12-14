package myPrograms;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class RandomizeList {
    static final Scanner sc = new Scanner(System.in);
    static final int twoMimir = 2;

    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<>();
        System.out.println("Bienvenido al creador de equipos!");
        System.out.println("Hay que formar equipos de 3!");
        anadirAlumnos(alumnos);
    }

    private static void anadirAlumnos(ArrayList<String> alumnos) {
        int ciclos = preguntarAlumnos();
        for (int i = 0; i < ciclos; i++) {
            System.out.printf("Añadiendo alumno %d: ", i + 1);
            String alumno = sc.nextLine();
            alumnos.add(alumno);
        }
        verificarAlumnos(alumnos);
    }

    private static void verificarAlumnos(ArrayList<String> alumnos) {
        System.out.println("\n¿Es esta lista correcta? (s/n)");
        for (int i = 0; i < alumnos.toArray().length; i++) {
            System.out.printf("%d. %s%n", i + 1, alumnos.get(i));
        }
        while (true) {
            String bool = sc.next();
            if (bool.equalsIgnoreCase("n")) {
                sc.nextLine();
                byte mod;
                while (true) {
                    try {
                        System.out.println("¿Qué número está mal?");
                        mod = Byte.parseByte(sc.nextLine());
                        if (mod < 1) {
                            System.out.println("¡No puede ser menor a 1!");
                        } else if (mod > alumnos.toArray().length) {
                            System.out.println("¡La lista no es tan grande!");
                        } else break;
                    } catch (InputMismatchException e) {
                        System.out.println("Error!");
                    }
                }
                System.out.print("Modifica ahora el nombre: ");
                mod--;
                alumnos.set(mod, sc.nextLine());
                verificarAlumnos(alumnos);
            } else if (bool.equalsIgnoreCase("s")) {
                System.out.println("¡Perfecto! ¡Vamos a Randomizar la lista!");
                randomizarAlumnos(alumnos);
                System.exit(0);
            } else {
                System.out.println("Mal input!");
                System.out.println("¿Es esta lista correcta? (s/n)");
            }
        }
    }

    private static void randomizarAlumnos(ArrayList<String> alumnos) {
        System.out.println("\n¡¡¡EL SORTEO DE LA CHAMPIONS DEL SERPIS EMPIEZA!!!");
        System.out.println("¿¡PREPARADOS!?");
        try {
            TimeUnit.SECONDS.sleep(twoMimir);
            System.out.println("3...");
            TimeUnit.SECONDS.sleep(twoMimir);
            System.out.println("2...");
            TimeUnit.SECONDS.sleep(twoMimir);
            System.out.println("1...");
            TimeUnit.SECONDS.sleep(twoMimir);
        } catch (InterruptedException e) {
            System.out.println("Vaya lío!");
        }

        Collections.shuffle(alumnos);
        byte count = 0;
        for (int i = 0; i < alumnos.toArray().length; i++) {
            if (i % 3 == 0) {
                count++;
                try {
                    TimeUnit.SECONDS.sleep(twoMimir);
                } catch (InterruptedException e) {
                    System.out.println("Vaya lío!");
                }
                System.out.printf("\nEN EL GRUPO %d TENEMOS...%n", count);
            }
            System.out.printf("\t%d. %s%n", i + 1, alumnos.get(i));
        }

        try {
            TimeUnit.SECONDS.sleep(twoMimir);
        } catch (InterruptedException e) {
            System.out.println("Vaya lío!");
        }
        System.out.println("\n¡Gracias a todos por participar!");
    }

    private static byte preguntarAlumnos() {
        byte noEquip;
        while (true) {
            System.out.println("¿Cuántos alumnos están sin equipo?");
            try {
                noEquip = Byte.parseByte(sc.nextLine());
                if (noEquip < 1) {
                    System.out.println("¿Para qué me llamas, entonces?");
                } else if (noEquip < 3) {
                    System.out.println("¡No puedo formar equipos de menos de 3!");
                } else if (noEquip > 24) {
                    System.out.println("¡No somos tantos en clase!");
                } else break;
            } catch (InputMismatchException e) {
                System.out.println("Error!");
                sc.next();
            }
        }
        return noEquip;
    }
}
