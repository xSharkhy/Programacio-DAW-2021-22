package aceptaElReto;

import java.util.Scanner;

public class problema369 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int n = s.nextInt();
            if (n == 0) break;
            for (int i = 0; i < n; i++) System.out.print('1');
            System.out.println();
        }
    }
}
