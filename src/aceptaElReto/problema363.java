package aceptaElReto;

import java.util.Scanner;

public class problema363 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int calEntrenamiento, numeroComidas;
        do {
            calEntrenamiento = Integer.parseInt(sc.nextLine());
            int sumatorio = 0;
            if (calEntrenamiento < 2 || calEntrenamiento > 5000) break;
            numeroComidas = Integer.parseInt(sc.nextLine());
            if (numeroComidas == 0) break;
            String[] calArray = sc.nextLine().split(" ");
            int[] calComidas = new int[numeroComidas];
            for (int i = 0; i < numeroComidas; i++) {
                calComidas[i] = Integer.parseInt(calArray[i]);
                if (calComidas[i] == 0) break;
            }
            for (int i = 0; i < numeroComidas; i++) sumatorio += calComidas[i];
            if (sumatorio == 0) break;
            if (sumatorio % calEntrenamiento == 0) System.out.println(sumatorio / calEntrenamiento);
            else System.out.println((sumatorio / calEntrenamiento) + 1);
        } while (true);
    }
}
