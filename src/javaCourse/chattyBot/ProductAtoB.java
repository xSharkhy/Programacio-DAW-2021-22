package javaCourse.chattyBot;

import java.util.Scanner;

public class ProductAtoB {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        long product = a;
        for (int i = a + 1; i < b; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
