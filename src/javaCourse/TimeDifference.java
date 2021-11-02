package javaCourse;

import java.util.Scanner;

public class TimeDifference {
    static final int HOUR = 3600;
    static final int MINUTE = 60;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        int timeSkip = h2 * HOUR + m2 * MINUTE + s2 - (h1 * HOUR + m1 * MINUTE + s1);
        System.out.println(timeSkip);
    }
}
