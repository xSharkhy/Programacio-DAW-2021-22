package evaluacion3.unitatDidactica_09.UD09_02v4;

import java.util.ArrayList;
import java.util.List;

public class Multimedia {

    private String titulo;
    private String autor;
    private String formato;
    private int duracion;

    public Multimedia(String titulo, String autor, String formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;

        var list = new ArrayList<>(List.of(new String[]{"wav", "mp3", "midi", "avi", "mov", "mpg", "cdAudio", "dvd"}));
        if (!list.contains(formato)) throw new ExcepcionFormatoNoValido("Formato no válido!");
        else this.formato = formato;
    }

    @Override
    public String toString() {
        return "Titulo = " + titulo +
                ", Autor = " + autor +
                ", Formato = " + formato +
                ", Duracion = " + duracion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Multimedia that)) return false;

        if (!titulo.equals(that.titulo)) return false;
        return autor.equals(that.autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
