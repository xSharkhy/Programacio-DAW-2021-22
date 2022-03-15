package aceptaElReto.entrenamiento;

import java.util.Scanner;

public class problema619 {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int pasos = sc.nextInt();
            int multiplier = sc.nextInt();
            int time = sc.nextInt();

            if (pasos >= time) System.out.println(time * multiplier);
            else System.out.println((time % pasos - 1) * multiplier);
        }
    }
}