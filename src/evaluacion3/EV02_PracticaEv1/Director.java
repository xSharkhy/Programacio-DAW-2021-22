package evaluacion3.EV02_PracticaEv1;

public class Director {

    private String nombre;
    private int edad;
    private int premiosOscar;

    public Director(String nombre, int edad, int premiosOscar) {
        this.nombre = nombre;
        this.edad = edad;
        this.premiosOscar = premiosOscar;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPremiosOscar() {
        return premiosOscar;
    }
}
