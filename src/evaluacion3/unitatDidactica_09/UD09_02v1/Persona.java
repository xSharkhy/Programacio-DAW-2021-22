package evaluacion3.unitatDidactica_09.UD09_02v1;

public class Persona {
    private String nombre;
    private String DNI;
    private int edad;
    protected String residencia;

    public Persona(String nombre, String DNI, int edad, String residencia) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.residencia = residencia;
    }

    public int edadJubilación() {
        return 65 - this.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }
}
