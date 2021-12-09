package aceptaElReto;

import java.util.Scanner;

public class problema362 {
    static final int dia = 25;
    static final int mes = 12;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int ciclos = sc.nextInt();
        for (int i = 0; i < ciclos; i++) {
            System.out.println(sc.nextInt() == dia && sc.nextInt() == mes ? "SI" : "NO");
        }
    }
}

class problema362b {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        for (int i = 0; i < c; i++) {
            int dia = s.nextInt();
            int mes = s.nextInt();
            System.out.print(dia == 25 && mes == 12 ? "SI" : "NO");
        }
    }
}