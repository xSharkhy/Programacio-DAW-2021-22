package evaluacion3.unitatDidactica_09.UD09_02v2;

public class Pez {
    private String nombre;
    private int escamas;
    protected int peso;

    public Pez(String nombre, int escamas, int peso) {
        this.nombre = nombre;
        this.escamas = escamas;
        this.peso = peso;
    }

    public String calibre() {
        return peso < 100 ? "pequeño" : peso < 300 ? "mediano" : peso < 500 ? "grande" : "cachalote";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEscamas() {
        return escamas;
    }

    public void setEscamas(int escamas) {
        this.escamas = escamas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
