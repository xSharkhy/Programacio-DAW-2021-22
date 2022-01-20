package aceptaElReto;

import java.util.Scanner;

public class problema171 {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            int picos = sc.nextInt();
            if (picos == 0) break;
            int[] abadias = new int[picos];
            for (int i = 0; i < picos; i++) abadias[i] = sc.nextInt();
            int max = 0;
            int output = 0;
            for (int i = picos - 1; i > -1; i--) {
                if (abadias[i] > max) {
                    max = abadias[i];
                    output++;
                }
            }
            System.out.println(output);
        } while (true);
    }
}
