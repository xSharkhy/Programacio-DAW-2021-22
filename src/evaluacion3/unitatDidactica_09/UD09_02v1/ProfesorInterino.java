package evaluacion3.unitatDidactica_09.UD09_02v1;

public class ProfesorInterino extends Profesor{
    private char baja;
    private int duracion;

    public ProfesorInterino(String nombre, String DNI, int edad, String residencia, double sueldo, String centro, String localizacion, char baja, int duracion) {
        super(nombre, DNI, edad, residencia, sueldo, centro, localizacion);
        this.baja = baja;
        this.duracion = duracion;
    }

    public int[] tiempo() {
        int[] arr = new int[2];
        arr[0] = this.duracion / 30;
        arr[1] = this.duracion % 30;
        return arr.clone();
    }

    public char getBaja() {
        return baja;
    }

    public void setBaja(char baja) {
        this.baja = baja;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
