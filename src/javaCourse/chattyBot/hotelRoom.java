package javaCourse.chattyBot;

import java.util.Scanner;

public class hotelRoom {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int dimension = 8;
        String[] guest = new String[dimension];
        for (int i = 0; i < guest.length; i++) {
            guest[i] = sc.next();
        }
        for (int i = guest.length - 1; i >= 0; i--) {
            System.out.println(guest[i]);
        }
    }
}
