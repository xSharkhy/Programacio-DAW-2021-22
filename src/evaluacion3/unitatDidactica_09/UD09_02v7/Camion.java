package evaluacion3.unitatDidactica_09.UD09_02v7;

public class Camion extends Vehiculo {

    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    public void ponRemolque(Remolque r) {
        this.remolque = r;
    }

    public void quitaRemolque() {
        if (this.remolque == null) System.out.println("No hay remolque!");
        else this.remolque = null;
    }

    @Override
    public String toString() {
        if (remolque == null) return super.toString();
        else return super.toString() + " " + remolque.toString();
    }

    @Override
    public void acelerar(float a) {
        super.acelerar(a);
        if (this.remolque != null && velocidad > 100) throw new DemasiadoRapidoExcepcion("Frenando Alonso!");
    }
}
