package evaluacion3.unitatDidactica_09.UD09_02v8;

import java.util.ArrayList;

public class Plato implements InterfazPlato {

    private final String nombre;
    private final double precio;
    private final ArrayList<Ingrediente> listaIngredientes;

    public Plato(String nombre) {
        this.nombre = nombre;
        precio = "aeiouAEIOU".indexOf(nombre.charAt(0)) >= 0 ?  10.0 : 5.0;
        listaIngredientes = new ArrayList<>();
    }

    public void anadirIngrediente(Ingrediente i) {
        listaIngredientes.add(i);
    }

    public String consultarIngredientes() {
        StringBuilder lista = new StringBuilder();
        for (Ingrediente ingrediente : listaIngredientes) lista.append(ingrediente.detalleIngrediente().concat("\n"));
        return lista.toString();
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
