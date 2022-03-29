package evaluacion3.unitatDidactica_07.UD07_02_POOejer100a;

public class Tripulante {

    private String nombre;
    private int edad;
    private String rango;
    static final String[] rangos = {"Capitan", "Comandante", "Soldado"};

    public Tripulante(String nombre, int edad, String clase) {
        this.nombre = nombre;
        this.edad = edad;
        this.rango = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
}
