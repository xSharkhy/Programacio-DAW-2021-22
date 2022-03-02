package evaluacion3.unitatDidactica_07.UD07_01.lavadora;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Lavadora lavadora1 = new Lavadora("Siemens", 7.5F);
        Lavadora lavadora2 = new Lavadora("Bosch", 5F);
        Lavadora lavadora3 = new Lavadora("Samsung", 7F);

        System.out.println("De momento hemos creado " + Lavadora.numLavadoras + " ordenadores.");

        ArrayList<Lavadora> listaLavadoras = new ArrayList<>() {{
            add(lavadora1);
            add(lavadora2);
            add(lavadora3);
        }};

        for (Lavadora lavadora :
                listaLavadoras) {
            lavadora.centrifugar();
        }
        System.out.println("Maldita secadora...");
    }
}
