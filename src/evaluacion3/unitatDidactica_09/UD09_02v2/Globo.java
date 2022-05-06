package evaluacion3.unitatDidactica_09.UD09_02v2;

public class Globo extends Pez{
    private int toxina;

    public Globo(String nombre, int escamas, int peso, int toxina) {
        super(nombre, escamas, peso);
        this.toxina = toxina;
    }

    public String toxicidad() {
        double pToxina = ((this.toxina / 1000D) * 100) / this.peso;
        return pToxina < 10 ? "inofensivo" : pToxina < 20 ? "riesgo moderado" : "yo no lo haría";
    }

    public int getToxina() {
        return toxina;
    }

    public void setToxina(int toxina) {
        this.toxina = toxina;
    }
}
