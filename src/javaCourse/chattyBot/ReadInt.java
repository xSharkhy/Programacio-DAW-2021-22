package javaCourse.chattyBot;

import java.util.Scanner;

public class ReadInt {
    static Scanner sc = new Scanner(System.in);
    static final int MAX_VALUE = 4;

    public static void main(String[] args) {
        for (int i = 0; i < MAX_VALUE; i++) {
            System.out.println(sc.nextInt());
        }
    }
}
