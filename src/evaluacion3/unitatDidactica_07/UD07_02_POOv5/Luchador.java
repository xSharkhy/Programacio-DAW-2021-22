package evaluacion3.unitatDidactica_07.UD07_02_POOv5;

public class Luchador {

    private final String nombre;
    private int vida;

    public Luchador(String nombre) {
        this.nombre = nombre;
        vida = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
