package evaluacion3.unitatDidactica_07.UD07_02_POOv6;

public class Cliente {
    private String nombre;
    private int edad;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\t" + this.nombre + " (" + this.edad + ").\n";
    }
}
