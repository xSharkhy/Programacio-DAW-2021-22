package aceptaElReto;

import java.util.Scanner;

public class problema149 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            int m = 0;
            int aux;
            for (int i = 0; i < n; i++) {
                aux = sc.nextInt();
                if (aux > m) m = aux;
            }
            System.out.println(m);
        }
    }
}