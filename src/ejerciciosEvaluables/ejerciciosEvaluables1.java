package ejerciciosEvaluables;

import java.util.Scanner;

public class ejerciciosEvaluables1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejerciciosEvaluables1 program = new ejerciciosEvaluables1();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 3 ) o salir ( 4 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> eval11();
                case 2 -> eval12();
                case 3 -> eval13();
                case 4 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);
    }

    private void eval13() {
        System.out.println("\n<<< EJERCICIO EVALUABLE 3 >>>\n");
        System.out.println("Introduce un número positivo: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.printf("Par %d,%d: %d + %d + 2 * %d + %d vale %d\n", i, j, i, j, i, j, (i + j + 2 * i * j));
            }
        }
    }

    private void eval12() {
        System.out.println("\n<<< EJERCICIO EVALUABLE 2 >>>\n");
        System.out.println("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
        int filas = sc.nextInt();
        if (filas % 2 == 0 || filas < 5) {
            System.out.println("La altura introducida no es correcta");
            System.exit(0);
        }
        for (int i = 0; i < filas; i++) {
            if (i == 0 || i == filas - 1 || i == (filas / 2)) {
                System.out.println("MMMMMM");
            } else {
                System.out.println("M    M");
            }
        }
    }

    private void eval11() {
        System.out.println("\n<<< EJERCICIO EVALUABLE 1 >>>\n");
        String clave = "0000";
        System.out.println("Bienvenido al ejercicio de la caja fuerte.");
        for (int i = 0; i < 15; i++) {
            System.out.println("------------------------------------------");
            System.out.printf("Intento número %d de 15:\n", (i + 1));
            String intento = "";
            for (int j = 0; j < 4; j++) {
                System.out.printf("Introduzca el dígito número %d:\n", (j + 1));
                intento += sc.next();
            }
            if (intento.equals(clave)) {
                System.out.printf("Correcto! La clave era %s\n", clave);
                i += 15;
            } else {
                System.out.printf("Lo siento, la clave %s no es correcta\n", intento);
            }
            if (i == 14) {
                System.out.println("Caja Bloqueada.");
            }
        }

    }
}