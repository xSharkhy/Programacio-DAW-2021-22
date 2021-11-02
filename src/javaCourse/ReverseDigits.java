package javaCourse;

import java.util.Scanner;

public class ReverseDigits {
    static Scanner sc = new Scanner(System.in);
    static final int TEN = 10;
    static final int HUNDRED = 100;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int one = n % TEN;
        int tens = (n / TEN) % TEN;
        int hundred = (n / HUNDRED) % TEN;
        int m = one * HUNDRED + tens * TEN + hundred;
        System.out.println(m);
    }
}
