package evaluacion3.unitatDidactica_09.UD09_02v8;

import java.util.ArrayList;

public class Mesa implements InterfazMesa {

    private byte numeroMesa;
    private final int numeroPersonas;
    private String estado = "LIBRE";
    private final String localizacion;
    private double factura = 0.0;
    private final ArrayList<Plato> listaplatos;

    public Mesa(int numeroPersonas, String localizacion) {
        numeroMesa++;
        this.numeroPersonas = numeroPersonas;
        this.localizacion = localizacion;
        listaplatos = new ArrayList<>();
    }

    public String obtenerDatosMesa() {
        return "Mesa número: " + numeroMesa +
                ", Capacidad: " + numeroPersonas +
                ", Estado: " + estado +
                ", Localizacion: " + localizacion;
    }

    public int getNumMesa() {
        return numeroMesa;
    }

    public void liberarMesa() {
        estado = "LIBRE";
    }

    public void ocuparMesa() {
        estado = "OCUPADA";
    }

    public void pedirPlato(Plato p) {
        listaplatos.add(p);
    }

    @Override
    public void detallePlatos() {
        for (Plato plato : listaplatos) {
            System.out.println(plato.getNombre());
        }
    }

    @Override
    public double calcularFactura() {
        listaplatos.forEach(plato -> factura += plato.getPrecio());
        return factura;
    }
}
