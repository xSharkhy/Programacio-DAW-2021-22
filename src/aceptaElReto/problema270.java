package aceptaElReto;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class problema270 {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            final int n = Integer.parseInt(sc.nextLine());
            if (n == 0) break;
            TreeMap<String, Integer> list = new TreeMap<>() {{
                for (int i = 0; i < n; i++) {
                    String s = sc.nextLine().concat(", ");
                    if (!containsKey(s)) put(s, 0);
                    boolean bool = sc.nextLine().equals("CORRECTO");
                    if (bool) put(s, get(s) + 1);
                    else put(s, get(s) - 1);
                }
            }};
            for (Map.Entry<String, Integer> entry : list.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if (value != 0) System.out.println(key + value);
            }
            System.out.println("---");
        }
    }
}