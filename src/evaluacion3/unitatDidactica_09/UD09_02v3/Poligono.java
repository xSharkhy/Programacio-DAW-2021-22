package evaluacion3.unitatDidactica_09.UD09_02v3;

import java.util.Arrays;

public class Poligono {
    private Punto[] puntos;

    public Poligono(Punto[] puntos) {
        this.puntos = puntos;
    }

    public void trasladar(int x, int y) {
        for (Punto punto : this.puntos) {
            punto.setX(punto.getX() + x);
            punto.setY(punto.getY() + y);
        }
    }

    public void escalar(int x, int y) {
        for (Punto punto: this.puntos) {
            punto.setX(punto.getX() * x);
            punto.setY(punto.getY() * y);
        }
    }

    public int numVertices() {
        return puntos.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(puntos);
    }

    public Punto[] getPuntos() {
        return puntos.clone();
    }

    public void setPuntos(Punto[] puntos) {
        this.puntos = puntos;
    }
}
