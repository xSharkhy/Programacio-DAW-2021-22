package evaluacion3.unitatDidactica_07.UD07_02_POOv6.ejer99b;

public class Jugador {

    private String nombre;
    private int dorsal;

    public Jugador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "\t " + this.dorsal + ":\t" + this.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }
}
