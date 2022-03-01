package evaluacion2.unitatDidactica_05;

import java.util.Scanner;

public class UD05_02v1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD05_02v1 program = new UD05_02v1();
        program.menu();

    }

    private void menu() {
        byte option = 0;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 4 ) o salir ( 5 ):");
            try {
                option = Byte.parseByte(sc.nextLine());
            } catch (Exception ignored) {
            }
            switch (option) {
                case 1 -> ejer71();
                case 2 -> ejer71b();
                case 3 -> ejer72();
                case 4 -> ejer73();
                case 5 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);
    }

    private void ejer73() {

    }

    private void ejer72() {
        byte option = 0;
        int ene, eme;

        outerLoop:
        do {
            System.out.print("""
                    \n1.- Sumar
                    2.- Restar
                    3.- Multiplicar
                    4.- Dividir
                    5.- Potencia
                    6.- Raíz cuadrada
                    9.- Salir
                    Introduce un número:\040""");
            try {
                option = Byte.parseByte(sc.nextLine());
            } catch (Exception ignored) {
            }
            switch (option) {
                case 1 -> {
                    System.out.println("\n>>> SUMAR <<<");
                    System.out.println("Introduce dos números separados por un espacio: ");
                    try {
                        ene = Integer.parseInt(sc.next());
                        eme = Integer.parseInt(sc.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Mal input!");
                        break;
                    }
                    System.out.printf("La suma de %d y %d es: %d%n", ene, eme, ene + eme);
                }
                case 2 -> {
                    System.out.println("\n>>> RESTAR <<<");
                    System.out.println("Introduce dos números separados por un espacio: ");
                    try {
                        ene = Integer.parseInt(sc.next());
                        eme = Integer.parseInt(sc.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Mal input!");
                        break;
                    }
                    System.out.printf("La resta de %d y %d es: %d%n", ene, eme, ene - eme);
                }
                case 3 -> {
                    System.out.println("\n>>> MULTIPLICAR <<<");
                    System.out.println("Introduce dos números separados por un espacio: ");

                    try {
                        ene = Integer.parseInt(sc.next());
                        eme = Integer.parseInt(sc.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Mal input!");
                        break;
                    }
                    System.out.printf("El producto de %d y %d es: %d%n", ene, eme, ene * eme);
                }
                case 4 -> {
                    System.out.println("\n>>> DIVIDIR <<<");
                    System.out.println("Introduce dos números separados por un espacio: ");
                    try {
                        ene = Integer.parseInt(sc.next());
                        eme = Integer.parseInt(sc.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Mal input!");
                        break;
                    }
                    System.out.printf("La división de %d y %d es: %d%n", ene, eme, ene / eme);
                }
                case 5 -> {
                    System.out.println("\n>>> POTENCIA <<<");
                    System.out.println("Introduce dos números separados por un espacio: ");
                    try {
                        ene = Integer.parseInt(sc.next());
                        eme = Integer.parseInt(sc.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Mal input!");
                        break;
                    }
                    System.out.printf("La suma de %d y %d es: %d%n", ene, eme, (int) Math.pow(ene, eme));
                }
                case 6 -> {
                    System.out.println("\n>>> RAÍZ CUADRADA <<<");
                    System.out.println("Introduce un número: ");
                    try {
                        ene = Integer.parseInt(sc.next());
                    } catch (NumberFormatException e) {
                        System.out.println("Mal input!");
                        break;
                    }
                    System.out.printf("La raíz de %d es: %d%n", ene, (int) Math.sqrt(ene));
                }
                case 9 -> {
                    break outerLoop;
                }
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);
    }

    private void ejer71b() {
        int[] array = new int[4];
        int counter = 0;
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                array[counter] = i;
                counter++;
                if (counter == 4) {
                    counter = 0;
                    System.out.printf("%d\t%d\t%d\t%d%n", array[0], array[1], array[2], array[3]);
                }
            }
        }
    }

    private void ejer71() {
        int ene;
        do {
            try {
                System.out.println("Introduce un número por teclado:");
                ene = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);

        if (isPrime(ene)) System.out.printf("%d es primo.%n", ene);
        if (!isPrime(ene)) System.out.printf("%d no es primo.%n", ene);
    }

    private boolean isPrime(int ene) {
        if (ene <= 1) return false;
        for (int i = 2; i <= Math.sqrt(ene); i++)
            if (ene % i == 0) return false;
        return true;
    }
}
