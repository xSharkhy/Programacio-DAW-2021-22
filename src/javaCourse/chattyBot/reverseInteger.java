package javaCourse.chattyBot;

import java.util.Scanner;

public class reverseInteger {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = new int[2];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.printf("%d ", array[i]);
        }
    }
}
