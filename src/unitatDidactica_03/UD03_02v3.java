package unitatDidactica_03;

import java.util.Scanner;

public class UD03_02v3 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD03_02v3 ejer35 = new UD03_02v3();
        ejer35.init();
    }

    private void init() {
        System.out.println("\nEjercicio 35:\n");
        System.out.print("Introduzca la altura de la bandera en centímetros (cm): ");
        int altura = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca la anchura de la bandera en centímetros (cm): ");
        int anchura = Integer.parseInt(sc.nextLine());
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        String booleano = sc.nextLine();
        double bandera;
        double envio = 3.25;
        int area = altura * anchura;
        double precio = area * 0.01;
        if (booleano.equalsIgnoreCase("s") || booleano.equalsIgnoreCase("n")) {
            System.out.print("Gracias. Aquí tiene el desglose de su compra.\n");
            System.out.printf("Bandera de %5d cm2:\t%-5.2f€\n", area, precio);
            if (booleano.equalsIgnoreCase("s")) {
                bandera = 2.50;
            } else {
                bandera = 0.00;
            }
            double total = precio + bandera + envio;
            System.out.printf("Con escudo:\t\t\t\t%-5.2f€\n", bandera);
            System.out.printf("Gastos de envío:\t\t%-5.2f€\n", envio);
            System.out.printf("Total:\t\t\t\t\t%-5.2f€", total);
        }
    }
}
