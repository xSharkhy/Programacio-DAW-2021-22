package evaluacion3.EV02_PracticaEv1;

import java.util.ArrayList;

public class Pelicula {

    private String titulo;
    private Director director;
    private Productor productor;
    private ArrayList<Actor> actores;
    private int oscars;

    public Pelicula(String titulo, Director director, Productor productor, ArrayList<Actor> actores) {
        this.titulo = titulo;
        this.director = director;
        this.productor = productor;
        this.actores = actores;
        setOscars();
    }

    public String getTitulo() {
        return titulo;
    }

    public Director getDirector() {
        return director;
    }

    public Productor getProductor() {
        return productor;
    }

    public ArrayList<Actor> getActores() {
        return actores;
    }

    public int getOscars() {
        return oscars;
    }

    public void setOscars() {
        this.oscars = this.director.getPremiosOscar() + this.productor.getPremiosOscar();
        for (Actor actor : actores) this.oscars += actor.getPremiosOscar();
    }

    @Override
    public String toString() {
        return " + '" + this.titulo + "'," + "\n\tDirigida por: " + this.director.getNombre() + "\n\tProducida por: " + this.productor.getNombre() + "\n\tInterpretada por: " + this.actores.toString();
    }
}
