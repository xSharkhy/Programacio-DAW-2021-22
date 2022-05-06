package evaluacion3.EV02_PracticaEv2.clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejer2 {

    public static void main(String[] args) {

        File entrada = new File("src/evaluacion3/EV02_PracticaEv2/ficheros/entrada2.txt");
        try {
            leer(entrada);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void leer(File entrada) throws IOException {
        Scanner sc = new Scanner(entrada);
        final int[] x = new int[1];
        final String[] s = new String[1];
        ArrayList<String> lineas = new ArrayList<>() {{
            x[0] = Integer.parseInt(sc.nextLine());
            s[0] = sc.nextLine();
            for (int i = 0; i < x[0]; i++) {
                add(sc.nextLine());
            }
        }};
        escribir(x[0], s[0], lineas);
    }

    private static void escribir(int x, String s, ArrayList<String> lineas) throws IOException {
        FileWriter salida = new FileWriter("src/evaluacion3/EV02_PracticaEv2/ficheros/salida2.txt");
        Collections.sort(lineas);
        salida.write(x + "\n");
        salida.write(s + "\n");
        for (String linea : lineas) {
            salida.write(linea + "\n");
        }
        salida.close();
    }
}
