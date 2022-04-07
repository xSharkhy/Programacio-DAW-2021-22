package aceptaElReto;

import java.util.Scanner;

public class problema536 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            Terreno millor = null;
            int cases = sc.nextInt();
            for (int i = 0; i < cases; i++) {
                int tamanyo = sc.nextInt();
                int abono = sc.nextInt();
                int agua = sc.nextInt();
                int distancia = sc.nextInt();
                String nombre = sc.nextLine();
                Terreno actual = new Terreno(tamanyo, abono, agua, distancia, nombre);

                if (millor == null || actual.esMillor(millor)) millor = actual;
            }
            assert millor != null;
            System.out.println(millor.getPropietario().trim());
        }
    }
}

class Terreno {
    private int tamany;
    private int abono;
    private int aigua;
    private int distancia;
    private String propietario;

    public Terreno(int tamany, int abono, int aigua, int distancia, String propietario) {
        this.tamany = tamany;
        this.abono = abono;
        this.aigua = aigua;
        this.distancia = distancia;
        this.propietario = propietario;
    }

    public boolean esMillor(Terreno o) {
        if (this.tamany != o.tamany) return this.tamany > o.tamany;
        else if (this.aigua != o.aigua) return this.aigua < o.aigua;
        else if (this.distancia != o.distancia) return this.distancia < o.distancia;
        else if (this.abono != o.abono) return this.abono < o.abono;
        else return false;
    }

    public String getPropietario() {
        return propietario;
    }
}