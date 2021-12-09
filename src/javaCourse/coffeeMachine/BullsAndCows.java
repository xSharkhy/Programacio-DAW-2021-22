package javaCourse.coffeeMachine;

import java.util.Random;

public class BullsAndCows {

    public static void main(String[] args) {
        Random r = new Random();
        int bulls, cows, ran1 = (int) (r.nextDouble() * 10 + 1);

        System.out.println("The secret code is prepared: ****.");
        for (int i = 0; i < ran1; i++) {
            System.out.printf("Turn %d. Answer:%n", i + 1);
            int ran2 = (int) (r.nextDouble() * 9999 + 1);
            System.out.printf("%04d%n", ran2);
            while (true) {
                cows = (int) (r.nextDouble() * 4);
                bulls = (int) (r.nextDouble() * 4);
                if (bulls + cows < 4) break;
            }
            if (bulls == 0 && cows == 0) System.out.println("Grade: None.");
            else if (bulls == 1 && cows == 0) System.out.printf("Grade: %d bull%n", bulls);
            else if (bulls == 0 && cows == 1) System.out.printf("Grade: %d cow%n", cows);
            else if (bulls > 1 && cows == 0) System.out.printf("Grade: %d bulls%n", bulls);
            else if (bulls == 0 && cows > 1) System.out.printf("Grade: %d cows%n", cows);
            else if (bulls == 1 && cows > 1) System.out.printf("Grade: %d bull and %d cows%n", bulls, cows);
            else if (bulls > 1 && cows == 1) System.out.printf("Grade: %d bulls and %d cow%n", bulls, cows);
            else if (bulls > 1 && cows > 1) System.out.printf("Grade: %d bulls and %d cows%n", bulls, cows);
            System.out.println();

            if (i == ran1 - 1) System.out.printf("Congrats! The secret code is %04d", ran2);
        }
    }
}
