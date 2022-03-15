package evaluacion3.unitatDidactica_07.UD07_02_POOv5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<String> escenarios = Arrays.asList("Base Aérea", "Callejón de los aprendices", "Callejón Bullicioso", "Ciudad del Caos", "Taberna Flamenca", "Cascada Olvidada", "High Roller Casino", "Plaza Hillside", "Playa Kanzuki", "Finca del Mediodía", "Guarida de los Cuatro Reyes", "Base Shadaloo", "Monte del Destino", "Cielos de Honor", "Templo de la Ascensión", "La Jaula");
        List<String> luchadores = Arrays.asList("Cammy", "Chun-Li", "Dhalsim", "Ken Masters", "M.Bison", "Ryu", "Vega", "Zangief", "Blanka", "Sagat", "Honda");

        Collections.shuffle(escenarios);
        Collections.shuffle(luchadores);
        Luchador player1 = new Luchador(luchadores.get(0));
        Luchador player2 = new Luchador(luchadores.get(1));
        Luchador player3 = new Luchador(luchadores.get(2));

        Escenario escenario1 = new Escenario(escenarios.get(0), player1, player2);
        Luchador semifinalista = escenario1.combate();

        Escenario escenario2 = new Escenario(escenarios.get(1), semifinalista, player3);
        escenario2.combate();
    }
}
