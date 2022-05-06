package evaluacion3.EV02_PracticaEv1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static final Scanner sc = new Scanner(System.in);
    static ArrayList<Actor> actores = new ArrayList<>();
    static ArrayList<Productor> productores = new ArrayList<>();
    static ArrayList<Director> directores = new ArrayList<>();
    static ArrayList<Pelicula> peliculas = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }

    private void menu() {
        while (true) {
            System.out.println("--VIDEOCLUB BE KIND - REWIND --");
            System.out.println("1.- Dar de alta un Director");
            System.out.println("2.- Dar de alta un Actor");
            System.out.println("3.- Dar de alta un Productor");
            System.out.println("4.- Dar de alta una Película");
            System.out.println("5.- Listado de películas");
            System.out.println("6.- Salir");
            String option = sc.nextLine();
            switch (option) {
                case "1", "2", "3" -> altaCineasta(option);
                case "4" -> altaPelicula();
                case "5" -> listadoPeliculas();
                case "6" -> {
                    System.out.println("Gracias por utilizar nuestro Videoclub.");
                    System.exit(0);
                }
                default -> System.out.println("No te entiendo!");
            }
        }
    }

    private void listadoPeliculas() {
        System.out.println("Peliculas: " + peliculas.size());
        System.out.println("Directores: " + directores.size());
        System.out.println("Productores: " + productores.size());
        System.out.println("Actores: " + actores.size());
        peliculas.forEach(pelicula -> {
            System.out.println("--");
            System.out.println(pelicula.toString());
            System.out.printf("Entre el director, productor y actores, %s tiene %d Oscars.%n", pelicula.getTitulo(), pelicula.getOscars());
            System.out.println("--");
        });

    }

    private void altaPelicula() {
        System.out.println("Introduzca el título de la nueva película:");
        String titulo = sc.nextLine();
        System.out.printf("Introduzca el director de %s:%n", titulo);
        Director director = validarDirector();
        System.out.printf("Introduzca el productor de %s:%n", titulo);
        Productor productor = validarProductor();
        System.out.printf("Ahora vamos a introdcir los actores de %s, pulse en cualquier momento 'salir' para dejar de introducirlos:%n", titulo);
        ArrayList<Actor> actoresPelicula = new ArrayList<>() {{
            int contador = 0;
            while (true) {
                contador++;
                System.out.printf("Introduzca nombre del actor numero %d:%n", contador);
                String nombre = sc.nextLine();
                if (nombre.equalsIgnoreCase("salir")) break;
                add(validarActor(nombre));
            }
        }};
        peliculas.add(new Pelicula(titulo, director, productor, actoresPelicula));
    }

    private Actor validarActor(String nombre) {
        while (true) {
            String finalNombre = nombre;
            boolean encontrado = actores.stream().anyMatch(actor -> actor.getNombre().equalsIgnoreCase(finalNombre));
            if (encontrado) {
                for (Actor actor : actores) {
                    if (actor.getNombre().equalsIgnoreCase(nombre)) return actor;
                }
            } else {
                System.out.println("Actor no encontrado! Introduce de nuevo el nombre:");
                nombre = sc.nextLine();
            }
        }
    }

    private Productor validarProductor() {
        while (true) {
            String nombre = sc.nextLine();
            boolean encontrado = productores.stream().anyMatch(productor -> productor.getNombre().equalsIgnoreCase(nombre));
            if (encontrado) {
                for (Productor productor : productores) {
                    if (productor.getNombre().equalsIgnoreCase(nombre)) return productor;
                }
            } else System.out.println("Productor no encontrado! Introduce de nuevo el nombre:");
        }
    }

    private Director validarDirector() {
        while (true) {
            String nombre = sc.nextLine();
            boolean encontrado = directores.stream().anyMatch(director -> director.getNombre().equalsIgnoreCase(nombre));
            if (encontrado) {
                for (Director director : directores) {
                    if (director.getNombre().equalsIgnoreCase(nombre)) return director;
                }
            } else System.out.println("Director no encontrado! Introduce de nuevo el nombre:");
        }
    }

    private void altaCineasta(String option) {
        String cineasta = setCineasta(option);
        System.out.printf("Vamos a dar de alta un %s:%n", cineasta);
        System.out.println("Introduzca nombre:");
        String nombre = sc.nextLine();
        System.out.printf("Introduzca la edad de %s:%n", nombre);
        int edad = Integer.parseInt(sc.nextLine());
        System.out.printf("Introduzca el número de Oscar que ha ganado %s:%n", nombre);
        int oscar = Integer.parseInt(sc.nextLine());
        System.out.printf("%s numero %d dado de alta!%n", cineasta, addCineasta(option, nombre, edad, oscar));
    }

    private int addCineasta(String option, String nombre, int edad, int oscar) {
        switch (option) {
            case "1" -> {
                directores.add(new Director(nombre, edad, oscar));
                return directores.size();
            }
            case "2" -> {
                actores.add(new Actor(nombre, edad, oscar));
                return actores.size();
            }
            case "3" -> {
                productores.add(new Productor(nombre, edad, oscar));
                return productores.size();
            }
        }
        return 0;
    }

    private String setCineasta(String option) {
        return option.equals("1") ? "Director" : option.equals("2") ? "Actor" : "Productor";
    }
}
