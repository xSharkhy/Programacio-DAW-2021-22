package aceptaElReto;

import java.util.Scanner;

public class problema533 {
    static final Scanner sc = new Scanner(System.in);
    static final int potsPerKilo = 8;

    public static void main(String[] args) {
        final int cases = sc.nextInt();
        int count = 0, bote = 0;

        for (int i = 0; i < cases; i++) {
            int meta = sc.nextInt() * potsPerKilo;
            do {
                int aux = sc.nextInt();
                if (aux == 0) break;
                bote += aux;
                count++;
                if (bote >= meta) break;
            } while (true);
            if (bote >= meta) System.out.println(count);
            else System.out.println("SIGAMOS RECICLANDO");
            count = 0;
            bote = 0;
            sc.nextLine();
        }
    }
}
