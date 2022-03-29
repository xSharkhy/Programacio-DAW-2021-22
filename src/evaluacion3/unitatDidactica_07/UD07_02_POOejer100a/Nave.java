package evaluacion3.unitatDidactica_07.UD07_02_POOejer100a;

import java.util.ArrayList;

public class Nave {

    private final String nombre;
    private final ArrayList<Tripulante> tripulantes;

    public Nave(String nombre, ArrayList<Tripulante> tripulantes) {
        this.nombre = nombre;
        this.tripulantes = tripulantes;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Tripulante> getTripulantes() {
        return tripulantes;
    }

    public void addTripulantes(Tripulante tripulante) {
        tripulantes.add(tripulante);
    }
}
