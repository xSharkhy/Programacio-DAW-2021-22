package aceptaElReto;

import java.util.Scanner;

public class problema456 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, r, c = s.nextInt(), t;
        for (int i = 0; i < c; i++) {
            a = s.nextInt();
            b = s.nextInt();
            r = s.nextInt();
            if (a * b > r) t = 1;
            else if (r % (a * b) == 0) t = r / (a * b);
            else t = r / (a * b) + 1;
            System.out.print(t + "\n");
        }
    }
}
//System.out.printf("%d%n", a * b > r ? 1 : r % (a * b) == 0 ? r / (a * b) : r / (a * b) + 1);
