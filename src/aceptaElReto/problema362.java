package aceptaElReto;

import java.util.Scanner;

public class problema362 {
    static final int dia = 25;
    static final int mes = 12;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            System.out.println(sc.nextInt() == dia && sc.nextInt() == mes ? "SI" : "NO");
        }
    }
}