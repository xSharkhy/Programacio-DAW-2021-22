package evaluacion3.unitatDidactica_07.UD07_02_POOv1;

public class Cafetera {

    private int capacidad;
    int cafe = 0;

    public Cafetera() {
    }

    public Cafetera(int capacidad) {
        this.capacidad = capacidad;
    }

    private int getCapacidad() {
        return capacidad;
    }

    private void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    private void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public void llenarCafetera() {
        setCafe(capacidad);
        System.out.printf("La cafetera está llena, hay disponibles %d cl.%n", cafe);
    }

    public void vaciarCafetera() {
        System.out.println("Cafetera vacía.");
        setCafe(0);
    }

    public void agregarCafe(int cafe) {
        if (cafe > capacidad || this.cafe + cafe > capacidad) {
            System.out.printf("La cantidad actual es %dcl. en una cafetera de %dcl.%n", this.cafe, this.capacidad);
            System.out.printf("No se puede agregar %dcl. porque desbordaría la cafetera!!%n", cafe);
        } else {
            this.cafe += cafe;
            System.out.printf("Agregamos %dcl. y quedan en la cafetera %dcl.%n", cafe, this.cafe);
        }
    }

    public void servirTaza(int cafe) {
        if (this.cafe == 0) System.out.println("Lo siento, la cafetera está vacía.");
        else if (this.cafe - cafe < 0) {
            System.out.printf("Lo siento, solo te he podido servir %dcl.%n", this.cafe);
            this.cafe = 0;
        } else {
            this.cafe -= cafe;
            System.out.printf("Servimos una taza de %dcl. y quedan en la cafetera %dcl.%n", cafe, this.cafe);
        }
    }
}
