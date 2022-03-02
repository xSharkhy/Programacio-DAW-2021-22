package evaluacion3.unitatDidactica_07.UD07_01.ordenador;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Ordenador ordenador1 = new Ordenador("I7", 16, 512);
        Ordenador ordenador2 = new Ordenador("I5", 8, 256);
        Ordenador ordenador3 = new Ordenador("I3", 4, 128);

        System.out.println("De momento hemos creado " + Ordenador.numOrdenadores + " ordenadores.");

        ArrayList<Ordenador> listaOrdenadores = new ArrayList<>() {{
            add(ordenador1);
            add(ordenador2);
            add(ordenador3);
        }};

        for (Ordenador orde : listaOrdenadores) orde.encenderOrdenador();
    }
}
