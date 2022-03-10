package evaluacion3.unitatDidactica_07.UD07_02_POOv4;

public class Main {

    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(2, 3);
        Fraccion f2 = new Fraccion(2, 3);
        Fraccion fmul = f1.multiplicar(f2);
        fmul.escribirFraccion();
        fmul = fmul.invertir();
        fmul.escribirFraccion();
        Fraccion fdiv = f1.dividir(f2);
        fdiv.escribirFraccion();
    }
}
