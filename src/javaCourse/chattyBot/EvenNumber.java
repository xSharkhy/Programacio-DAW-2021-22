package javaCourse.chattyBot;

import java.util.Scanner;

public class EvenNumber {
    static final int EVEN = 2;
    static final int ODD = 1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int evenNumber = n + (n % EVEN == 0 ? EVEN : ODD);
        System.out.println(evenNumber);
    }
}

