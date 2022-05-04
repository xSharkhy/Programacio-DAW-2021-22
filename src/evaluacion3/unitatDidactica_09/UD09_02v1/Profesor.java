package evaluacion3.unitatDidactica_09.UD09_02v1;

public class Profesor extends Persona{

    private double sueldo;
    private String centro;
    private String localizacion;

    public Profesor(String nombre, String DNI, int edad, String residencia, double sueldo, String centro, String localizacion) {
        super(nombre, DNI, edad, residencia);
        this.sueldo = sueldo;
        this.centro = centro;
        this.localizacion = localizacion;
    }

   public boolean sitio() {
        return this.localizacion.equals(getResidencia());
   }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
}
