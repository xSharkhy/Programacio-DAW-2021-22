package evaluacion3.unitatDidactica_09.UD09_02v7;

public class Remolque {

    private int peso;

    public Remolque(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "El remolque pesa " + peso + " kg.";
    }
}
