package javaCourse.chattyBot;

import java.util.Scanner;

public class Desks {
    static final int PAIR = 2;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int deskA = a % PAIR == 0 ? a / 2 : a / 2 + 1;
        int deskB = b % PAIR == 0 ? b / 2 : b / 2 + 1;
        int deskC = c % PAIR == 0 ? c / 2 : c / 2 + 1;
        System.out.println(deskA + deskB + deskC);
    }
}
