package evaluacion3.unitatDidactica_09.UD09_02v6;

public abstract class Mascota {

    protected String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public abstract String sonido();
}
