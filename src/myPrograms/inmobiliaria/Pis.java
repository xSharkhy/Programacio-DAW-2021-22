package myPrograms.inmobiliaria;

public class Pis extends Inmoble implements Comparable<Pis> {
    protected int banys;

    public Pis(int banys) {
        this.banys = banys;
    }

    public Pis(String indentificador, String adreca, double metres_quadrats, boolean nou, float preu_base, String any_construccio, int banys) {
        super(indentificador, adreca, metres_quadrats, nou, preu_base, any_construccio);
        this.banys = banys;
    }

    public int getBanys() {
        return banys;
    }

    public void setBanys(int banys) {
        this.banys = banys;
    }

    @Override
    public float calcularPreu() {
        return preu_base + (3000 * getBanys());
    }

    @Override
    public String toString() {
        return "Pis{" +
                "indentificador='" + indentificador + '\'' +
                ", adreca='" + adreca + '\'' +
                ", metres_quadrats=" + metres_quadrats +
                ", nou=" + nou +
                ", preu_base=" + preu_base +
                ", any_construccio='" + any_construccio + '\'' +
                ", banys=" + banys +
                '}';
    }

    @Override
    public int compareTo(Pis pis) {
        return (int) (pis.getMetres_quadrats() - this.getMetres_quadrats());
    }
}
