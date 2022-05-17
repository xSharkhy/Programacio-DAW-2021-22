package evaluacion3.unitatDidactica_09.UD09_02v8;

import java.util.ArrayList;

public class Restaurante implements InterfazRestaurante {

    private final String nombre;
    private final String telefono;
    private final ArrayList<Mesa> listaMesas;

    public Restaurante(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        listaMesas = new ArrayList<>();
    }

    public void montarMesa(Mesa m) {
        listaMesas.add(m);
    }

    public void recogerMesa(Mesa m) {
        listaMesas.remove(m);
    }

    public void listarMesas() {
        if (listaMesas.isEmpty()) System.out.println("Todas las mesas están recogidas.");
        else listaMesas.forEach(Mesa::obtenerDatosMesa);
    }

    public double hacerCaja() {
        return listaMesas.stream().mapToDouble(Mesa::calcularFactura).sum();
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public ArrayList<Mesa> getListaMesas() {
        return listaMesas;
    }
}
