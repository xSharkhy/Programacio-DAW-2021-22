package evaluacion3.unitatDidactica_09.UD09_02v3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        Poligono poligono = new Poligono(new Punto[]{new Punto(0, 0), new Punto(2, 0), new Punto(2, 2), new Punto(0, 2)});
        System.out.println(poligono);
        poligono.trasladar(4, -3);
        System.out.println(poligono);
        poligono.escalar(2, 2);
        System.out.println(poligono);
        System.out.println(poligono.numVertices());
    }
}
