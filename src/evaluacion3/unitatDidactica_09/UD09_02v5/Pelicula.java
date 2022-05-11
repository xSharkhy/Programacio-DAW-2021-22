package evaluacion3.unitatDidactica_09.UD09_02v5;

import evaluacion3.unitatDidactica_09.UD09_02v5.Excepciones.NumeroPremiosExcepcion;

public class Pelicula extends Contenido {

    private int nominaciones;
    private int oscar;

    public Pelicula(String titulo, String productora, int anyo, boolean visto, int nominaciones, int oscar) {
        super(titulo, productora, anyo, visto);
        if (oscar > nominaciones) throw new NumeroPremiosExcepcion("Más Oscar ganados que nominaciones!");
        else {
            this.nominaciones = nominaciones;
            this.oscar = oscar;
        }
    }

    public int getNominaciones() {
        return nominaciones;
    }

    public void setNominaciones(int nominaciones) {
        this.nominaciones = nominaciones;
    }

    public int getOscar() {
        return oscar;
    }

    public void setOscar(int oscar) {
        this.oscar = oscar;
    }
}
