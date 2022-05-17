package evaluacion3.unitatDidactica_09.UD09_02v8;

public class Ingrediente implements InterfazIngrediente{

    private String nombre;
    private int cantidad;

    public Ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String detalleIngrediente() {
        return nombre + ", cantidad: " + cantidad;
    }
}
