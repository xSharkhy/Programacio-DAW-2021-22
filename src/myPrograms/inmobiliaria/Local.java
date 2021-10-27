package myPrograms.inmobiliaria;

public class Local extends Inmoble implements Comparable<Local> {
    protected int num_finestres;

    public Local(int num_finestres) {
        this.num_finestres = num_finestres;
    }

    public Local(String indentificador, String adreca, double metres_quadrats, boolean nou, float preu_base, String any_construccio, int num_finestres) {
        super(indentificador, adreca, metres_quadrats, nou, preu_base, any_construccio);
        this.num_finestres = num_finestres;
    }

    public int getNum_finestres() {
        return num_finestres;
    }

    public void setNum_finestres(int num_finestres) {
        this.num_finestres = num_finestres;
    }

    @Override
    public float calcularPreu() {
        return preu_base + (1000 * getNum_finestres());
    }

    @Override
    public String toString() {
        return "Local{" +
                "indentificador='" + indentificador + '\'' +
                ", adreca='" + adreca + '\'' +
                ", metres_quadrats=" + metres_quadrats +
                ", nou=" + nou +
                ", preu_base=" + preu_base +
                ", any_construccio='" + any_construccio + '\'' +
                ", num_finestres=" + num_finestres +
                '}';
    }

    @Override
    public int compareTo(Local local) {
        return (int) (local.getPreu_base() - this.getPreu_base());
    }
}
