package aceptaElReto;

import java.util.Scanner;

public class problema313 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int caso = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < caso; i++) {
            String entrada = sc.nextLine();
            String[] partes = entrada.split(" ");
            int a = Integer.parseInt(partes[0]);
            int b = Integer.parseInt(partes[1]);
            if (a + b >= 0) System.out.println("SI");
            else System.out.println("NO");
        }
    }
}
