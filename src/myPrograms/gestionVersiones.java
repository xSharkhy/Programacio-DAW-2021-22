package myPrograms;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class gestionVersiones {
    static final Scanner sc = new Scanner(System.in);
    static final Random rd = new Random();
    static final String hashAlphabet = "0123456789abcdef";
    static boolean isInitiated = false;
    static HashMap<String, String> commits = new HashMap<>();
    static ArrayList<String> archivos = new ArrayList<>();
    static ArrayList<String> archivosFinal = new ArrayList<>();
    static ArrayList<String> archivosStaged = new ArrayList<>();
    static ArrayList<String> archivosCommit = new ArrayList<>();
    static ArrayList<String> archivosPushed = new ArrayList<>();
    static String filePath = "user@PC:~$ ";

    public static void main(String[] args) {
        System.out.println("""
                ¡Bienvenido a nuestro innovador sistema de control de versiones GutHib!
                ¡Tus proyectos se actualizarán automáticamente, no necesitarás el PULL!
                Estamos en fase beta todavía, no hemos implementado gestión de ramas :(
                Pero podrás tener un track de todos tus cambios muy bonito, bienvenido!
                """);
        gestionVersiones programa = new gestionVersiones();
        programa.menu();
    }

    private void menu() {
        String opcion;
        System.out.println("""
                ¿Qué deseas hacer?
                \t /git add         -> Añade los cambios al stage.
                \t /git commit      -> Crea una versión de los cambios.
                \t /git init        -> Inicia un repositorio.
                \t /git log         -> Muestra todos los commits.
                \t /git push        -> Sube los cambios al repositorio.
                \t /ls              -> Muestra los archivos del directorio.
                \t /nano            -> Crea un archivo .txt.
                \t /rm              -> Elimina un archivo .txt.
                \t /exit            -> Sale de la línea de comandos.
                """);
        while (true) {
            System.out.println();
            System.out.print(filePath);
            opcion = sc.nextLine();
            switch (opcion) {
                case "git add" -> add();
                case "git commit" -> commit();
                case "git init" -> {
                    isInitiated = true;
                    System.out.println("Se ha inicializado un repositorio vacío.");
                }
                case "git log" -> log();
                case "git push" -> push();
                case "git status" -> status();
                case "ls" -> {
                    System.out.println("Tus archivos:");
                    for (String archivo : archivosFinal) System.out.println(archivo);
                }
                case "nano" -> createData();
                case "rm" -> removeData();
                case "exit" -> {
                    System.out.println("Adiós!");
                    System.exit(0);
                }
                default -> System.out.println("Orden no encontrada!");
            }
        }
    }

    private void removeData() {
        System.out.println("¿Qué archivo quieres eliminar?");
        String nombre = sc.nextLine().concat(".txt");
        if (archivosFinal.contains(nombre)) {
            archivosFinal.remove(nombre);
            archivos.remove(nombre);
        } else System.out.println("No existe un archivo con ese nombre");
    }

    private void createData() {
        System.out.println("Ponle un nombre al archivo:");
        String nombre = sc.nextLine().concat(".txt");
        archivos.add(nombre);
        archivosFinal.add(nombre);
        System.out.println("Has creado un nuevo archivo!");
    }

    private void status() {
        if (!isInitiated) System.out.println("No hay un repositorio iniciado!");
        else {
            if (archivos.isEmpty()) System.out.println("No tienes archivos sin seguir.");
            else {
                System.out.println("Tienes estos archivos sin seguir:");
                archivos.forEach(System.out::println);
            }
            if (archivosStaged.isEmpty()) System.out.println("No tienes archivos en stage.");
            else {
                System.out.println("Tienes estos archivos en stage:");
                archivosStaged.forEach(System.out::println);
            }
            if (archivosPushed.isEmpty()) System.out.println("No tienes archivos en tu repositorio.");
            else {
                System.out.println("Tienes estos archivos en tu repositorio:");
                archivosPushed.forEach(System.out::println);
            }
        }
    }


    private void push() {
        if (!isInitiated) System.out.println("No hay un repositorio iniciado!");
        else {
            if (archivosCommit.isEmpty()) System.out.println("No hay commits preparados!");
            else {
                System.out.println("Se han subido todos los commits a tu repositorio.");
                archivosPushed.addAll(archivosCommit);
                archivosCommit.removeAll(archivosPushed);
            }
        }
    }

    private void log() {
        if (!isInitiated) System.out.println("No hay un repositorio iniciado!");
        else {
            if (commits.isEmpty()) System.out.println("No hay commits a seguir!");
            else {
                System.out.println("El registro de tu repositorio:");
                for (String key : commits.keySet()) {
                    System.out.println(key + " : " + commits.get(key));
                }
            }
        }
    }

    private void commit() {
        if (!isInitiated) System.out.println("No hay un repositorio iniciado!");
        else {
            if (archivosStaged.isEmpty()) System.out.println("No hay ningún archivo staged!");
            else {
                StringBuilder sb = new StringBuilder("[");

                System.out.println("Escribe un mensaje de Commit:");
                String mensaje = sc.nextLine();
                int hashLength = 14;
                for (int i = 0; i < hashLength; i++) {
                    int index = (int) (rd.nextDouble() * hashAlphabet.length());
                    char rdChar = hashAlphabet.charAt(index);
                    sb.append(rdChar);
                }
                String hash = sb.append("] ").append(ZonedDateTime.now().format(DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss"))).toString();
                commits.put(hash, mensaje);
                archivosCommit.addAll(archivosStaged);
                archivosStaged.removeAll(archivosCommit);
            }
        }
    }

    private void add() {
        if (!isInitiated) System.out.println("No hay un repositorio iniciado!");
        else {
            if (archivos.isEmpty()) System.out.println("No hay ningun archivo para confirmar!");
            else {
                System.out.println("Se han añadido los siguientes archivos al stage:");
                archivos.forEach(System.out::println);
                archivosStaged.addAll(archivos);
                archivos.removeAll(archivosStaged);
            }
        }
    }
}
