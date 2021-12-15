package aceptaElReto;

import java.util.Scanner;

public class problema124 {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String s1 = sc.next(), s2 = sc.next();
            if (s1.equals("0") && s2.equals("0")) break;
            System.out.println(acarreo(s1, s2));
        }
    }

    private static int acarreo(String s1, String s2) {
        int counter = 0;
        int add = 0;
        int pos = 0;
        while (true) {
            int val1 = pos < s1.length() ? Character.getNumericValue(s1.charAt(s1.length() - pos - 1)) : 0;
            int val2 = pos < s2.length() ? Character.getNumericValue(s2.charAt(s2.length() - pos - 1)) : 0;
            int sum = add + val1 + val2;
            add = sum > 9 ? 1 : 0;
            counter += add;
            pos++;
            if (add <= 0 && (pos >= s1.length() || pos >= s2.length())) break;
        }
        return counter;
    }
}