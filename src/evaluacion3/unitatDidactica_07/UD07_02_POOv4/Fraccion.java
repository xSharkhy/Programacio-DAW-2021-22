package evaluacion3.unitatDidactica_07.UD07_02_POOv4;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public Fraccion invertir() {
        return new Fraccion(this.denominador, this.numerador);
    }

    public Fraccion multiplicar(Fraccion fraccion) {
        return new Fraccion(fraccion.numerador * this.numerador, fraccion.denominador * this.denominador);
    }

    public Fraccion dividir(Fraccion fraccion) {
        return new Fraccion(this.numerador * fraccion.denominador, this.denominador * fraccion.numerador);
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

    public void escribirFraccion() {
        System.out.println(this.numerador + "/" + this.denominador);
    }
}
