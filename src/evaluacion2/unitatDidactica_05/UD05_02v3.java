package evaluacion2.unitatDidactica_05;

import java.util.Scanner;

public class UD05_02v3 {
    static Scanner sc = new Scanner(System.in);

    public UD05_02v3() {
    }

    public static void main(String[] args) {
        UD05_02v3 program = new UD05_02v3();
        program.menu();

    }

    private void menu() {
        byte option = 0;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 2 ) o salir ( 3 ):");
            try {
                option = Byte.parseByte(sc.nextLine());
            } catch (Exception ignored) {
            }
            switch (option) {
                case 1 -> ejer77();
                case 2 -> ejer78();
                case 3 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);
    }

    private void ejer78() {
        System.out.println("\n>>> EJERCICIO 78 <<<");
        System.out.println("JUGADOR 1: Introduzca la palabra para adivinar:");
        StringBuilder palabra = new StringBuilder(sc.nextLine().toLowerCase());
        StringBuilder secreta = new StringBuilder();
        secreta.append("*".repeat(palabra.length()));
        System.out.println("JUGADOR 2: La palabra para adivinar es la siguiente:");
        System.out.println(secreta);

        do {
            try {
                validar(palabra, secreta);
            } catch (LetraNoEncontrada ex) {
                count++;
                System.out.println(ex.getMessage());
                if (count == 8) break;
            }
            System.out.printf("%s%n", secreta);
            if (secreta.indexOf(String.valueOf('*')) == -1) {
                System.out.println("Palabra adivinada! Gracias por jugar al ahorcado!");
                break;
            }
        } while (true);
    }

    public static class LetraNoEncontrada extends Exception {
        public LetraNoEncontrada(String message) {
            super(message);
        }
    }

    static int count = 0;
    static final String error1 = "Error 1 de 8: Te pinto la horca";
    static final String error2 = "Error 2 de 8: Te pinto la cabeza";
    static final String error3 = "Error 3 de 8: Te pinto el cuerpo";
    static final String error4 = "Error 4 de 8: Te pinto el brazo izquierdo";
    static final String error5 = "Error 5 de 8: Te pinto el brazo derecho";
    static final String error6 = "Error 6 de 8: Te pinto la pierna izquierda";
    static final String error7 = "Error 7 de 8: Te pinto la pierna derecha";
    static final String error8 = "Error 8 de 8: AHORCADO!";
    final String[] errorArray = {error1, error2, error3, error4, error5, error6, error7, error8};

    public void validar(StringBuilder palabra, StringBuilder secreta) throws LetraNoEncontrada {
        System.out.println("Introduzca letra:");
        char letra = sc.nextLine().charAt(0);
        if (palabra.indexOf(String.valueOf(letra)) == -1) {
            throw new LetraNoEncontrada(errorArray[count]);
        } else {
            int c = 0;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    c++;
                    secreta.setCharAt(i, letra);
                }
            }
            System.out.printf("La letra estaba en la palabra %d veces.%n", c);
        }
    }

    private void ejer77() {
        System.out.println("\n>>> EJERCICIO 77 <<<");
        System.out.println("Introduce el número a convertir a Palotes:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.printf("El número %s en sistema palote es: %s", n, convierteEnPalotes(n));
    }

    private String convierteEnPalotes(int n) {
        char[] num = String.valueOf(n).toCharArray();
        StringBuilder palotes = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            palotes.append("|".repeat(Character.getNumericValue(num[i])));
            if (i == num.length - 1) return palotes.toString();
            else palotes.append("-");
        }
        return palotes.toString();
    }
}