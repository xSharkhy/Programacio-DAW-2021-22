package unitatDidactica_02;

import java.util.Scanner;

public class UD02_02v4 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD02_02v4 program = new UD02_02v4();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 5 ) o salir ( 6 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer11();
                case 2 -> ejer12();
                case 3 -> ejer13();
                case 4 -> ejer14();
                case 5 -> ejer15();
                case 6 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);

    }

    private void ejer15() {

    }

    private void ejer14() {

    }

    private void ejer13() {

    }

    private void ejer12() {
        System.out.println("\nEjercicio 12:\n");
        System.out.println("Introduce los votos del partido PODEMOS:");
        int vPodem = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce los votos del partido PSOE:");
        int vPsoe = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce los votos del partido PP:");
        int vPopu = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce los votos del partido CIUDADANOS:");
        int vCiud = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce los votos del partido VOX:");
        int vAsco = Integer.parseInt(sc.nextLine());
        int izquierda = vPodem + vPsoe;
        int derecha = vPopu + vCiud + vAsco;
        int total = izquierda + derecha;
        double pIzq = (double) izquierda * 100 / total;
        double pDer = (double) derecha * 100 / total;
        System.out.printf("Los votos de la izquierda son %d, que constituyen el %.3f%% del total.\n", derecha, pDer);
        System.out.printf("Los votos de la derecha son %d, que constituyen el %.3f%% del total.\n", izquierda, pIzq);
    }

    private void ejer11() {
        System.out.println("\nEjercicio 11:\n");
        System.out.println("Introduce tu peso en gramos (g):");
        int peso = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce tu altura en centímetros (cm):");
        int altura = Integer.parseInt(sc.nextLine());
        double imc = (double) peso / 1000 / Math.pow((double) altura / 100, 2);
        System.out.println("El IMC calculado es " + imc + ".");
    }
}