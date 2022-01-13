package aceptaElReto.entrenamiento;

import java.util.Scanner;

public class problema616 {
    static final Scanner sc = new Scanner(System.in);
    public static final String[] TYPES = {"PIC", "POC", "PONG!"};

    public static void main(String[] args) {
        do {
            int cases = sc.nextInt();
            if (cases == 0) break;
            String[] game = new String[cases];
            int counterIZ = 0;
            int counterDE = 0;
            int pic = 0;
            for (int i = 0; i < game.length; i++) {
                game[i] = sc.next();
            }
            for (String s : game) {
                if (s.equals(TYPES[0])) pic++;
                if (s.equals(TYPES[2])) {
                    if (pic % 2 == 0) counterIZ++;
                    else if (pic % 2 == 1) counterDE++;
                    pic = 0;
                }
            }
            System.out.printf("%d %d%n", counterIZ, counterDE);
        } while (true);
    }
}
