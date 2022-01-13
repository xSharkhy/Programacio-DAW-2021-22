package aceptaElReto.entrenamiento;

import java.util.Scanner;

public class problema617 {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int cases = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cases; i++) {
            int punc = sc.nextInt();
            sc.nextLine();
            String[] punctuations = new String[punc];
            for (int j = 0; j < punctuations.length; j++) {
                punctuations[j] = sc.nextLine();
            }
            for (int j = 0; j < 3; j++) {
                for (String punctuation : punctuations) {
                    System.out.printf("%c", punctuation.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
