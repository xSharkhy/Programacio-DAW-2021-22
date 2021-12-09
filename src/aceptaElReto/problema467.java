package aceptaElReto;

import java.util.Scanner;

public class problema467 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String p, q;
        int c = s.nextInt();
        for (int i = 0; i < c; i++) {
            p = s.next();
            s.next();
            q = s.next();
            if (p.equalsIgnoreCase(q)) System.out.print("TAUTOLOGIA\n");
            else System.out.print("NO TAUTOLOGIA\n");
        }
    }
}
