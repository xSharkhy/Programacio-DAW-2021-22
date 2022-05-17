package evaluacion3.unitatDidactica_09.UD09_02v8;

public interface InterfazMesa {
    String obtenerDatosMesa();

    int getNumMesa();

    void liberarMesa();

    void ocuparMesa();

    void pedirPlato(Plato p);

    void detallePlatos();

    double calcularFactura();
}
