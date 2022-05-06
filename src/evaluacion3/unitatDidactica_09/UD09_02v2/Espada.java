package evaluacion3.unitatDidactica_09.UD09_02v2;

public class Espada extends Pez{
    private String procedencia;

    public Espada(String nombre, int escamas, int peso, String procedencia) {
        super(nombre, escamas, peso);
        this.procedencia = procedencia;
    }

    public boolean autenticidad() {
        return this.procedencia.equalsIgnoreCase("Atlántico") || this.procedencia.equalsIgnoreCase("Pacífico");
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
}
