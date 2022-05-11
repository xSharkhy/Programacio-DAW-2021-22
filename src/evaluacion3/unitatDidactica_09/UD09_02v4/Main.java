package evaluacion3.unitatDidactica_09.UD09_02v4;

public class Main {

    public static void main(String[] args) {
        ListaMultimedia lista = new ListaMultimedia(10);

        lista.add(new Pelicula("El Bicho Pelao", "El Bicho", "avi", 120, "El Bicho SUUU", "El Bicho SUUUU"));
        lista.add(new Pelicula("OLE BETI", "Joaquin", "wav", 132, "Mi Beti", "Furbo"));
        lista.add(new Multimedia("No es Gumersindo", "Teleoyentes", "midi", 92));

        System.out.println(lista);

        Pelicula pelicula = new Pelicula("El Bicho Pelao", "El Bicho", "avi", 120, "El Bicho SUUU", "El Bicho SUUUU");

        int i = lista.indexOf(pelicula);
        System.out.println(i);

        lista.get(i);

    }
}
