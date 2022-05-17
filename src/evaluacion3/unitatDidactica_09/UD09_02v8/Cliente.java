package evaluacion3.unitatDidactica_09.UD09_02v8;

public class Cliente implements InterfazCliente{

    private final String nombre;
    private final String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}
