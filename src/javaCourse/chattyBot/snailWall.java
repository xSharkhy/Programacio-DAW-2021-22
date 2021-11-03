package javaCourse.chattyBot;

import java.util.Scanner;

public class snailWall {
    public static final int UPPER_LIMIT = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h, a, b;
        do {
            System.out.println("Insert the pole height: ");
            h = Integer.parseInt(scanner.nextLine());
            System.out.println("Insert the feet up per day: ");
            a = Integer.parseInt(scanner.nextLine());
            System.out.println("Insert the feet down per night: ");
            b = Integer.parseInt(scanner.nextLine());
            if (h > 100) {
                System.out.println("It would cost ages to the snail!");
            } else if (a > 100) {
                System.out.println("Snails aren't that fast!");
            } else if (a <= b || h <= b) {
                System.out.println("The snail would never get to the top!");
            }
        } while (h <= b || a <= b || h > UPPER_LIMIT || a > UPPER_LIMIT);

        int countPerDay = a - b;
        int var = a;
        int day = 1;
        while (h > var) {
            var += countPerDay;
            day++;
        }

        System.out.println(day);
    }
}
