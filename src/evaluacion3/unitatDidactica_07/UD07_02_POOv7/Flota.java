package evaluacion3.unitatDidactica_07.UD07_02_POOv7;

import java.util.ArrayList;

public class Flota {

    private String nombre;
    private final ArrayList<Nave> naves;

    public Flota(String nombre, ArrayList<Nave> naves) {
        this.nombre = nombre;
        this.naves = naves;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Nave> getNaves() {
        return naves;
    }

    public void addNaves(Nave nave) {
        this.naves.add(nave);
    }
}
