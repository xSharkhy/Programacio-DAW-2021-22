package evaluacion3.unitatDidactica_09.UD09_02v4;

public class Pelicula extends Multimedia{

    private String actor;
    private String actriz;

    public Pelicula(String titulo, String autor, String formato, int duracion, String actor, String actriz) {
        super(titulo, autor, formato, duracion);
        this.actor = actor;
        this.actriz = actriz;
    }

    @Override
    public String toString() {
        return super.toString() + ", Actor = " + actor + ", Actriz = " + actriz;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActriz() {
        return actriz;
    }

    public void setActriz(String actriz) {
        this.actriz = actriz;
    }
}
