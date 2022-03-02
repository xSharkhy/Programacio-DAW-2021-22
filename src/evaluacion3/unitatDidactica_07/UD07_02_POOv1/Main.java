package evaluacion3.unitatDidactica_07.UD07_02_POOv1;

public class Main {

    public static void main(String[] args) {
        Cafetera cafet1 = new Cafetera(1000) {{
            llenarCafetera();
            servirTaza(90);
            servirTaza(10);
            agregarCafe(50);
            servirTaza(960);
            servirTaza(1);
            agregarCafe(1200);
            agregarCafe(50);
            vaciarCafetera();
            llenarCafetera();
        }};
    }
}
