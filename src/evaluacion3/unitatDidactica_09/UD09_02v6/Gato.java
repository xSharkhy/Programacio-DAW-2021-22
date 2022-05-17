package evaluacion3.unitatDidactica_09.UD09_02v6;

public class Gato extends Mascota{

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String sonido() {
        return "Hola me llamo " + nombre + ", soy un gato y hago miauuu";
    }
}

