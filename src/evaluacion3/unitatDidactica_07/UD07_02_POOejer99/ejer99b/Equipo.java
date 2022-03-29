package evaluacion3.unitatDidactica_07.UD07_02_POOejer99.ejer99b;

public class Equipo {

    private String nombre;
    private Jugador[] jugadores;

    public Equipo(String nombre, Jugador[] jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + this.nombre +
                "\nJUGADORES:" +
                toString(this.jugadores);
    }

    public String toString(Jugador[] jugadores) {
        StringBuilder sb = new StringBuilder();
        for (Jugador jugador : jugadores) {
            String s = "%n\t%d:\t%s".formatted(jugador.getDorsal(), jugador.getNombre());
            sb.append(s);
        }
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public Jugador[] getJugadores() {
        return jugadores.clone();
    }
}
