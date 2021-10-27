package aceptaElReto;

import java.util.Scanner;

public class problema217 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int entrada = 0;
        do {
            entrada = Integer.parseInt(sc.nextLine());
            if (entrada % 2 == 0 && entrada != 0) {
                System.out.println("DERECHA");
            } else if (entrada % 2 == 1) {
                System.out.println("IZQUIERDA");
            } else if (entrada == 0) {
                System.exit(0);
            }
        } while (entrada != 0);
    }
}
