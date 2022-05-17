package evaluacion3.unitatDidactica_09.UD09_02v7;

public class Coche extends Vehiculo {

    private int puertas;

    public Coche(String matricula, int puertas) {
        super(matricula);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }
}
