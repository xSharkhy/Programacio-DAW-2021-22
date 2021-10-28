package aceptaElReto;

import java.util.*;

public class problema411 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        problema411 programa = new problema411();
        programa.menu();
    }

    private void menu() {
        byte option;
        while (true) {
            System.out.println("Selecciona un ejemplo ( 1 - 3 ) o salir ( 4 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejemplo1();
                case 2 -> ejemplo2();
                case 3 -> ejemplo3();
                case 4 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        }
    }

    private void ejemplo3() {
        System.out.println("Ejemplo 3: Más compacto <<MEMORY LIMIT EXCEEDED>>");
        int peso;
        while (true) {
            peso = Integer.parseInt(sc.nextLine());
            if (peso == 0) break;
            String[] tamano = sc.nextLine().split(" ");
            int sum = 0;
            for (int i = 0; i < tamano.length; i++) {
                sum += Integer.parseInt(tamano[i]);
                if (sum > peso) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    private void ejemplo2() {
        System.out.println("Ejemplo 2: Primer Intento <<MEMORY LIMIT EXCEEDED>>");
        int peso;
        do {
            peso = Integer.parseInt(sc.nextLine());
            if (peso != 0) {
                String tamano = sc.nextLine();
                String[] separar = tamano.split(" ");
                List<String> elefantes;
                elefantes = Arrays.asList(separar);
                int sum = 0;
                for (int i = 0; i < elefantes.size(); i++) {
                    sum += Integer.parseInt(elefantes.get(i));
                    if (sum > peso) {
                        System.out.println(i);
                        break;
                    }
                }
            } else {
                break;
            }
        } while (true);
    }

    private void ejemplo1() {
        System.out.println("Ejemplo 1: El más compacto <<WRONG ANSWER>>");
        int pesoMaximo, sumatorio, peso;
        while (true) {
            pesoMaximo = sc.nextInt();
            if (pesoMaximo == 0) break;
            sumatorio = 0;
            while (true) {
                peso = sc.nextInt();
                if (peso == 0) break;
                pesoMaximo -= peso;
                if (pesoMaximo >= 0) ++sumatorio;
            }
            System.out.println(sumatorio);
        }
    }
}