package evaluacion3.unitatDidactica_07.UD07_02_POOv6;

import java.util.LinkedList;
import java.util.Queue;

public class Sala {
    private int id;
    private Queue<Cliente> clientes;

    public Sala(int id) {
        this.id = id;
        clientes = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public void addCliente(Cliente c) {
        clientes.add(c);
    }

    public void removeCliente() {
        clientes.remove();
    }

    public String toString() {
        return "La sala " + this.id + " tiene esperando a los siguientes clientes: \n" + clientes.toString();
    }
}
