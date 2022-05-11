package evaluacion3.unitatDidactica_09.UD09_02v5;

public class Contenido {

    private String titulo;
    private String productora;
    private int anyo;
    private boolean visto;

    public Contenido(String titulo, String productora, int anyo, boolean visto) {
        this.titulo = titulo;
        this.productora = productora;
        this.anyo = anyo;
        this.visto = visto;
    }

    @Override
    public String toString() {
        return titulo + '|' + productora + '|' + anyo + '|' + visto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }
}
