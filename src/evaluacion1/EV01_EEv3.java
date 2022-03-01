package evaluacion1;

import java.util.Arrays;
import java.util.Scanner;

public class EV01_EEv3 {
    static Scanner sc = new Scanner(System.in);
    static final String barName = "VEGGIE-BAR";
    static final String verduras = "verduras";
    static final String aguacate = "aguacate";
    static final int postreAguacate = 8;
    static final int postreNormal = 5;

    public static void main(String[] args) {
        System.out.printf("Bienvenido a %s!%n", barName);
        byte paso = 1;
        String tempString;
        String tempString2;
        int tempInt = 0;
        int tempInt2;

        //PASO 1: PRIMER PLATO
        System.out.printf("PASO %d: PRIMER PLATO%n", paso);
        paso++;
        System.out.print("¿Cuántos platos tendrá el menú?\n");
        String[] pPlato = new String[Integer.parseInt(sc.nextLine())];
        int[] precios = new int[pPlato.length];
        for (int i = 0; i < pPlato.length; i++) {
            System.out.printf("Introduzca el plato %d de %d:%n", i + 1, pPlato.length);
            tempString = sc.nextLine();
            do {
                if (!tempString.toLowerCase().contains(verduras)) {
                    System.out.printf("Ojo, este plato no contiene %s!%n", verduras);
                    System.out.printf("Introduzca el plato %d de %d:%n", i + 1, pPlato.length);
                    tempString = sc.nextLine();
                    continue;
                } else {
                    pPlato[i] = tempString;
                    System.out.printf("Introduzca el precio para %s:%n", pPlato[i]);
                    precios[i] = Integer.parseInt(sc.nextLine());
                    System.out.printf("Se ha dado de alta el plato %s que cuesta %d€.%n", pPlato[i], precios[i]);
                    break;
                }
            } while (true);
        }

        //PASO 2: POSTRES
        System.out.printf("%nPASO %d: POSTRES%n", paso);
        paso++;
        System.out.print("¿Cuántos postres tendrá el menú?\n");
        String[] postre = new String[Integer.parseInt(sc.nextLine())];
        int[] precioPostre = new int[postre.length];
        for (int i = 0; i < postre.length; i++) {
            System.out.printf("Introduzca el postre %d:%n", i + 1);
            postre[i] = sc.nextLine();
            if (!postre[i].contains(aguacate)) {
                System.out.printf("Se ha dado de alta el postre %s que cuesta %d€.%n", postre[i], postreNormal);
                precioPostre[i] = postreNormal;
            } else {
                System.out.printf("Se ha dado de alta el postre %s que cuesta %d€.%n", postre[i], postreAguacate);
                precioPostre[i] = postreAguacate;
            }
        }

        //PASO 3: Se ha dado de alta el siguiente menú...
        System.out.printf("PASO %d: Se ha dado de alta el siguiente menú...%n%n", paso);
        paso++;
        System.out.println("PRIMEROS PLATOS");
        for (int i = 0; i < pPlato.length; i++) {
            System.out.printf("%d : %s.....%d €.%n", i + 1, pPlato[i], precios[i]);
        }
        System.out.println("\nPOSTRES");
        for (int i = 0; i < postre.length; i++) {
            System.out.printf("%d : %s.....%d €.%n", i + 1, postre[i], precioPostre[i]);
        }

        //PASO 4: HACER UN PEDIDO
        System.out.printf("%nPASO %d: HACER UN PEDIDO%n", paso);
        System.out.println("Introduzca nombre del primer plato:");
        tempString = sc.nextLine();
        do {
            if (Arrays.asList(pPlato).contains(tempString)) {
                break;
            } else {
                System.out.println("Ese plato no existe en el menú...");
                System.out.println("Introduzca nombre del primer plato:");
                tempString = sc.nextLine();
            }
        } while (true);
        System.out.println("Introduzca nombre del postre:");
        tempString2 = sc.nextLine();
        do {
            if (Arrays.asList(postre).contains(tempString2)) {
                break;
            } else {
                System.out.println("Ese plato no existe en el menú...");
                System.out.println("Introduzca nombre del postre:");
                tempString2 = sc.nextLine();
            }
        } while (true);
        for (int i = 0; i < pPlato.length; i++) {
            if (tempString.toLowerCase().compareTo(pPlato[i]) == 0) {
                tempInt = precios[i];
                break;
            }
        }
        if (tempString2.contains(aguacate)) {
            tempInt2 = 8;
        } else {
            tempInt2 = 5;
        }
        System.out.println("\nEste es tu pedido...");
        System.out.printf("Primer plato: %s.....%d €.%n", tempString, tempInt);
        System.out.printf("Postre: %s.....%d €.%n", tempString2, tempInt2);
        System.out.printf("TOTAL: %d €.%n", tempInt + tempInt2);
        System.out.printf("Gracias por venir a %s!", barName);
    }
}