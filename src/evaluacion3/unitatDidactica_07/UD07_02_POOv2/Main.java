package evaluacion3.unitatDidactica_07.UD07_02_POOv2;

public class Main {

    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "mediana");
        System.out.println(p1.estadoPizza());
        Pizza p2 = new Pizza("hawaiiana", "familiar");
        System.out.println(p2.estadoPizza());

        System.out.println(Pizza.totalPedidas);

        p1.servir();
        System.out.println(p1.estadoPizza());
        p1.servir();

        System.out.println(Pizza.totalPedidas);
        System.out.println(Pizza.totalServidas);
    }
}
