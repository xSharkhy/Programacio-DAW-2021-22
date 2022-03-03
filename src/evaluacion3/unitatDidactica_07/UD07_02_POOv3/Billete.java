package evaluacion3.unitatDidactica_07.UD07_02_POOv3;

import java.util.Random;

public class Billete {


    static final String hashAlphabet = "0123456789ABCDEF";
    private String origen;
    private String destino;
    private final String identificador;
    private int ida;
    private int vuelta;
    private boolean vigente;

    public Billete(String origen, String destino, int ida, int vuelta) {
        this.origen = origen;
        this.destino = destino;
        this.ida = ida;
        this.vuelta = vuelta;
        this.vigente = true;
        this.identificador = setIdentificador();
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
    }

    public int getVuelta() {
        return vuelta;
    }

    public void setVuelta(int vuelta) {
        this.vuelta = vuelta;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void cancelarBillete() {
        this.vigente = false;
    }

    public String getIdentificador() {
        return identificador;
    }

    private String setIdentificador() {
        StringBuilder sb = new StringBuilder();
        int hashLength = 6;
        for (int i = 0; i < hashLength; i++) {
            int index = (int) (new Random().nextDouble() * hashAlphabet.length());
            char rdChar = hashAlphabet.charAt(index);
            sb.append(rdChar);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        if (isVigente()) return String.format("%s : %s - %s IDA: dia %d VUELTA: dia %d", this.identificador, this.origen, this.destino, this.ida, this.vuelta);
        else return String.format("%s : %s - %s IDA: dia %d VUELTA: dia %d CANCELADO", this.identificador, this.origen, this.destino, this.ida, this.vuelta);
    }

}
