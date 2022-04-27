package evaluacion3.unitatDidactica_08.UD08_02v2;

import java.io.FileWriter;
import java.io.IOException;

public class ejer102 {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("src/evaluacion3/unitatDidactica_08/UD08_02v2/pares.txt");
        FileWriter writer2 = new FileWriter("src/evaluacion3/unitatDidactica_08/UD08_02v2/nones.txt");
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) writer.write(i + "\n");
            else writer2.write(i + "\n");
        }
        writer.close();
        writer2.close();
    }
}
