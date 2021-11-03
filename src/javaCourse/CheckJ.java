package javaCourse;

import java.util.Scanner;

public class CheckJ {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        boolean verify = chars[0] == 'J' || chars[0] == 'j';
        System.out.println(verify);
    }
}
