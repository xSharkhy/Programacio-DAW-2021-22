package evaluacion3.unitatDidactica_09.UD09_02v4;

import java.util.Arrays;

public class ListaMultimedia {

    private Multimedia[] listaMultimedia;
    private final int maximo;

    public ListaMultimedia(int maximo) {
        this.maximo = maximo;
        listaMultimedia = new Multimedia[maximo];
    }

    public int size() {
        int contador = 0;
        for (Multimedia m : listaMultimedia) {
            if (m == null) contador++;
        }
        return maximo - contador;
    }

    public boolean add(Multimedia m) {
        boolean flag = false;
        for (Multimedia mu : listaMultimedia) {
            if (mu == null) {
                mu = m;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public Multimedia get(int i) {
        return listaMultimedia[i];
    }

    public int indexOf(Multimedia m) {
        for (int i = 0; i < maximo; i++) {
            if (listaMultimedia[i].equals(m)) return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "ListaMultimedia = " + Arrays.toString(listaMultimedia);
    }
}
