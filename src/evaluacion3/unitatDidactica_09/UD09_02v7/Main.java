package evaluacion3.unitatDidactica_09.UD09_02v7;

public class Main {

    public static void main(String[] args) {

        Vehiculo[] vehiculos = new Vehiculo[4];

        Camion c1 = new Camion("4988-BCN");
        Camion c2 = new Camion("1514-NAV");

        Coche a1 = new Coche("V-1719-GX", 5);
        Coche a2 = new Coche("2090-GTX", 3);

        vehiculos[0] = c1;
        vehiculos[1] = c2;
        vehiculos[2] = a1;
        vehiculos[3] = a2;

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Camion) ((Camion) vehiculo).ponRemolque(new Remolque(5000));
        }

        for (Vehiculo vehiculo : vehiculos) System.out.println(vehiculo);

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Coche) vehiculo.acelerar(120);
            if (vehiculo instanceof Camion) vehiculo.acelerar(90);
        }

        c2.quitaRemolque();

        for (Vehiculo vehiculo : vehiculos) System.out.println(vehiculo);

        c1.acelerar(20);

        System.out.println(c1);
    }
}
