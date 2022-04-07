package aceptaElReto;

import java.util.Scanner;

public class problema535 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int cases = sc.nextInt();
            if (cases == 0) break;
            int[] arr = new int[cases];
            for (int i = 0; i < cases; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < cases - 1; i++) {
                count += (arr[arr.length - 1] - arr[i]);
            }
            System.out.println(count);
        }
    }
}
