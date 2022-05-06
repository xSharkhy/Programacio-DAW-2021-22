package evaluacion3.EV02_PracticaEv2.clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ejer3 {

    public static void main(String[] args) {
        try {
            Scanner entrada1 = new Scanner(new File("src/evaluacion3/EV02_PracticaEv2/ficheros/salida1.txt"));

            HashMap<String, String> alumnos = new HashMap<>() {{
                int x = Integer.parseInt(entrada1.nextLine());
                entrada1.useDelimiter(";");
                for (int i = 0; i < x + 1; i++) {
                    put(entrada1.next(), entrada1.nextLine());
                }
            }};
            escribir(alumnos);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void escribir(HashMap<String, String> alumnos) throws IOException {
        Scanner entrada2 = new Scanner(new File("src/evaluacion3/EV02_PracticaEv2/ficheros/salida2.txt"));
        entrada2.useDelimiter(";");
        FileWriter salida = new FileWriter("src/evaluacion3/EV02_PracticaEv2/ficheros/salida3.txt");
        int x = Integer.parseInt(entrada2.nextLine());
        for (int i = 0; i < x + 1; i++) {
            String s = entrada2.next();
            salida.write(s + alumnos.get(s) + entrada2.nextLine() + "\n");
        }
        salida.close();
    }
}
