package myPrograms.inmobiliaria;

public abstract class Inmoble {
    protected String indentificador;
    protected String adreca;
    protected double metres_quadrats;
    protected boolean nou;
    protected float preu_base;
    protected String any_construccio;

    public Inmoble() {
    }

    public Inmoble(String indentificador, String adreca, double metres_quadrats, boolean nou, float preu_base, String any_construccio) {
        this.indentificador = indentificador;
        this.adreca = adreca;
        this.metres_quadrats = metres_quadrats;
        this.nou = nou;
        this.preu_base = preu_base;
        this.any_construccio = any_construccio;
    }

    public String getIndentificador() {
        return indentificador;
    }

    public void setIndentificador(String indentificador) {
        this.indentificador = indentificador;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public double getMetres_quadrats() {
        return metres_quadrats;
    }

    public void setMetres_quadrats(double metres_quadrats) {
        this.metres_quadrats = metres_quadrats;
    }

    public boolean isNou() {
        return nou;
    }

    public void setNou(boolean nou) {
        this.nou = nou;
    }

    public double getPreu_base() {
        return preu_base;
    }

    public void setPreu_base(float preu_base) {
        this.preu_base = preu_base;
    }

    public String getAny_construccio() {
        return any_construccio;
    }

    public void setAny_construccio(String any_construccio) {
        this.any_construccio = any_construccio;
    }

    public abstract float calcularPreu();

    @Override
    public String toString() {
        return "Inmoble{" +
                "indentificador='" + indentificador + '\'' +
                ", adreca='" + adreca + '\'' +
                ", metres_quadrats=" + metres_quadrats +
                ", nou=" + nou +
                ", preu_base=" + preu_base +
                ", any_construccio='" + any_construccio + '\'' +
                '}';
    }
}
