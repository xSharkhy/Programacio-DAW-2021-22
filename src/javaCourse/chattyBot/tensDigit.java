package javaCourse.chattyBot;

import java.util.Scanner;

public class tensDigit {
    static Scanner sc = new Scanner(System.in);
    static final int TEN = 10;

    public static void main(String[] args) {
        int a = sc.nextInt();
        int tens = (a / TEN) % TEN;
        System.out.println(tens);
    }
}
