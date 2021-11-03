package javaCourse.chattyBot;

import java.util.Scanner;

public class squirrelNuts {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        short squirrel = sc.nextShort();
        short nut = sc.nextShort();
        short a = (short) (nut / squirrel);
        System.out.println(a);
    }
}
