package evaluacion3.unitatDidactica_09.UD09_02v7;

public class Vehiculo {

    private final String matricula;
    protected float velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        velocidad = 0;
    }

    public void acelerar(float a) {
        velocidad += a;
    }

    @Override
    public String toString() {
        return "Matricula = " + matricula + ", velocidad actual = " + velocidad + " km/h.";
    }
}
