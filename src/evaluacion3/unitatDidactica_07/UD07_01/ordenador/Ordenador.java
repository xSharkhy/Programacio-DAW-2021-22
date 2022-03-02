package evaluacion3.unitatDidactica_07.UD07_01.ordenador;

public class Ordenador {
    private String procesador;
    private int ram;
    private int disco;
    static int numOrdenadores = 0;

    public Ordenador() {
    }

    public Ordenador(String procesador, int ram, int disco) {
        this.procesador = procesador;
        this.ram = ram;
        this.disco = disco;
        numOrdenadores++;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    public void encenderOrdenador() {
        System.out.printf("Encendemos el ordenador con procesador: %s y memoria: %dGB y disco de %dGB.%n", procesador, ram, disco);
    }
}
