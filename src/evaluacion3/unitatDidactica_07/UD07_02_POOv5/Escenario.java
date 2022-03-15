package evaluacion3.unitatDidactica_07.UD07_02_POOv5;

import java.util.Random;

public class Escenario {

    private final String nombre;
    private final Luchador ladoRojo;
    private final Luchador ladoAzul;
    static int contadorRojo;
    static int contadorAzul;

    public Escenario(String nombre, Luchador ladoRojo, Luchador ladoAzul) {
        this.nombre = nombre;
        this.ladoRojo = ladoRojo;
        this.ladoAzul = ladoAzul;
        contadorRojo = 0;
        contadorAzul = 0;
    }

    public String getNombre() {
        return nombre;
    }

    private void round(int i) throws InterruptedException {
        String lrNombre = ladoRojo.getNombre();
        String laNombre = ladoAzul.getNombre();
        ladoRojo.setVida(100);
        ladoAzul.setVida(100);
        boolean ganador;
        System.out.printf("%nROUND %d....FIGHT!!!%n", i + 1);
        while (true) {
            golpe(ladoRojo, ladoAzul);
            System.out.printf("%s: %d - %s: %d%n", lrNombre, ladoRojo.getVida(), laNombre, ladoAzul.getVida());
            Thread.sleep(1000);
            ganador = true;
            if (ladoAzul.getVida() <= 0) break;
            golpe(ladoAzul, ladoRojo);
            System.out.printf("%s: %d - %s: %d%n", lrNombre, ladoRojo.getVida(), laNombre, ladoAzul.getVida());
            Thread.sleep(1000);
            ganador = false;
            if (ladoRojo.getVida() <= 0) break;
        }
        System.out.printf("El ganador de este round es: %s%n", ganador ? ladoRojo.getNombre() : ladoAzul.getNombre());
        Thread.sleep(1000);
        if (ganador) contadorRojo++;
        else contadorAzul++;
    }

    private void golpe(Luchador golpeador, Luchador golpeado) {
        int golpe = (int) (new Random().nextDouble() * 49 + 1);
        golpeado.setVida(Math.max(golpeado.getVida() - golpe, 0));
        System.out.printf("%s golpea a %s con una intensidad de %d\t\t", golpeador.getNombre(), golpeado.getNombre(), golpe);
    }

    public Luchador combate() throws InterruptedException {
        System.out.println("\n============================================================================");
        System.out.printf("Comienza la pelea entre %s y %s en %s%n", ladoRojo.getNombre(), ladoAzul.getNombre(), this.nombre);
        for (int i = 0; i < 3; i++) {
            if (contadorAzul == 2 || contadorRojo == 2) break;
            else round(i);
        }
        if (Math.max(contadorRojo, contadorAzul) == contadorRojo) {
            System.out.println("El ganador de la pelea ha sido: " + ladoRojo.getNombre());
            return ladoRojo;
        } else {
            System.out.println("El ganador de la pelea ha sido: " + ladoAzul.getNombre());
            return ladoAzul;
        }
    }
}
