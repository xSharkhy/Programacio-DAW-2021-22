package evaluacion3.unitatDidactica_08.UD08_02v2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejer103 {

    public static void main(String[] args) throws IOException {
        Scanner pares = new Scanner("src/evaluacion3/unitatDidactica_08/UD08_02v2/pares.txt");
        Scanner nones = new Scanner("src/evaluacion3/unitatDidactica_08/UD08_02v2/nones.txt");
        FileWriter out = new FileWriter("src/evaluacion3/unitatDidactica_08/UD08_02v2/output.txt");

        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) out.write(pares.next());
            else out.write(nones.next());
            out.write("\n");
        }
    }
}
