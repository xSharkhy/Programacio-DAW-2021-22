package evaluacion3.unitatDidactica_09.UD09_02v5;

import evaluacion3.unitatDidactica_09.UD09_02v5.Excepciones.NumeroTemporadasExcepcion;

public class Serie extends Contenido {

    private int temporadas;
    private boolean finalizada;

    public Serie(String titulo, String productora, int anyo, boolean visto, int temporadas, boolean finalizada) {
        super(titulo, productora, anyo, visto);
        if (temporadas < 1) throw new NumeroTemporadasExcepcion("Debería tener, al menos, 1 temporada!");
        else this.temporadas = temporadas;
        this.finalizada = finalizada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
}
