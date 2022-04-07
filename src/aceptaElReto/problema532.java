package aceptaElReto;

import java.util.Scanner;

public class problema532 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            System.out.println(Math.abs(sc.nextInt() - sc.nextInt()));
        }
    }
}
