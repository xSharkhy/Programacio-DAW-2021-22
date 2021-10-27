package aceptaElReto;

import java.util.Scanner;

public class problema411 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int maximo, sum, peso;
        while (true) {
            maximo = sc.nextInt();
            if (maximo == 0) break;
            sum = 0;
            while (true) {
                peso = sc.nextInt();
                if (peso == 0) break;
                maximo -= peso;
                if (maximo >= 0) ++sum;
            }
            System.out.println(sum);
        }
    }
}
