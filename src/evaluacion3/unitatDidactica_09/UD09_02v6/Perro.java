package evaluacion3.unitatDidactica_09.UD09_02v6;

public class Perro extends Mascota{

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String sonido() {
        return "Hola me llamo " + nombre + ", soy un perro y hago guauuu";
    }
}