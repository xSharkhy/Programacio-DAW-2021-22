package javaCourse;

import java.util.Scanner;

class sumAtoB {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = 0;
        for (int i = a; i <= b; i++) {
            c += i;
        }
        System.out.println(c);
    }
}