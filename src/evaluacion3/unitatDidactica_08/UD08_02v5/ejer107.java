package evaluacion3.unitatDidactica_08.UD08_02v5;

import java.io.File;
import java.util.Scanner;

public class ejer107 {

    public static void main(String[] args) {

        System.out.println("¿Cuántas carpetas quiere crear en el escritorio?");
        int num = new Scanner(System.in).nextInt();
        System.out.println("¿Qué nombre quiere que aparezca en las carpetas?");
        String name = new Scanner(System.in).nextLine();

        for (int i = 0; i < num; i++) {
            try {
                new File("/home/ismbla01/Escriptori/" + name + (i + 1)).mkdir();
            } catch (Exception e) {
                System.out.println("Excepción!");
            }
        }
    }
}
