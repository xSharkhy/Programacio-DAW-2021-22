package evaluacion3.unitatDidactica_09.UD09_02v8;

public class Reserva {

    private final String fecha;
    private final int hora;
    private final int personas;
    private final Cliente cliente;
    private final Mesa mesa;

    public Reserva(String fecha, int hora, int personas, Mesa mesa, Cliente cliente) {
        this.fecha = fecha;
        this.hora = hora;
        this.personas = personas;
        this.cliente = cliente;
        this.mesa = mesa;
        this.mesa.ocuparMesa();
    }
}
