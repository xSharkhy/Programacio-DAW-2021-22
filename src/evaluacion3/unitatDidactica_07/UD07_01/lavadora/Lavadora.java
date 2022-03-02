package evaluacion3.unitatDidactica_07.UD07_01.lavadora;

import java.util.Random;

public class Lavadora {

    private String marca;
    private float capacidad;
    private int numero;
    static int numLavadoras = 0;

    public Lavadora() {
    }

    public Lavadora(String marca, float capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
        numero = (int) (new Random().nextDouble() * 99 + 1);
        numLavadoras++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void centrifugar() {
        System.out.println("¡VENGA LAVADORA " + getNumero() + "!");
    }
}
