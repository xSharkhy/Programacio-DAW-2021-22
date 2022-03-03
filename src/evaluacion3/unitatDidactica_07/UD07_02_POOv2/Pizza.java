package evaluacion3.unitatDidactica_07.UD07_02_POOv2;

public class Pizza {

    private String tamanyo;
    private String tipo;
    private boolean servida;

    static int totalServidas = 0;
    static int totalPedidas = 0;


    public Pizza(String tipo, String tamanyo) {
        this.tamanyo = tamanyo;
        this.tipo = tipo;
        servida = false;
        totalPedidas++;
    }

    public String getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(String tamanyo) {
        this.tamanyo = tamanyo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isServida() {
        return servida;
    }

    public void setServida(boolean servida) {
        this.servida = servida;
    }

    public String estadoPizza() {
        return isServida() ?
                String.format("Pizza de tipo %s y tamaño %s. Estado: servida", this.tipo, this.tamanyo)
                : String.format("Pizza de tipo %s y tamaño %s. Estado: pedida", this.tipo, this.tamanyo);
    }

    public void servir() {
        if (this.servida) System.out.println("Esta pizza ya se ha servido");
        else {
            this.servida = true;
            totalPedidas--;
            totalServidas++;
        }
    }
}
