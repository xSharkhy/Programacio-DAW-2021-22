package javaCourse.chattyBot;

import java.util.Scanner;

public class DivisibleN {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int counter = 0;
        for (int i = a; i <= b; i++) {
            counter = i % n == 0 ? counter + 1 : counter;
        }
        System.out.println(counter);
    }
}
