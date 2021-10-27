package myPrograms.inmobiliaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pro = new Main();
        pro.inici();
    }

    public void inici() {
        ArrayList<Inmoble> inmobles = new ArrayList<>();

        Inmoble pis1 = new Pis("IDENTIFICADOR1", "ADREÇA1", 50.8, true, 1248, "17/02/2020", 2);
        Inmoble pis2 = new Pis("IDENTIFICADOR2", "ADREÇA2", 85, false, 3248, "16/03/2019", 3);
        Inmoble pis3 = new Pis("IDENTIFICADOR3", "ADREÇA3", 40.5, true, 940, "15/04/2018", 1);

        Inmoble local1 = new Local("IDENTIFICADOR4", "ADREÇA4", 120.5, false, 5692, "18/01/2017", 2);
        Inmoble local2 = new Local("IDENTIFICADOR5", "ADREÇA5", 250, false, 7034, "19/02/2016", 2);
        Inmoble local3 = new Local("IDENTIFICADOR6", "ADREÇA6", 320.5, true, 10459, "30/03/2015", 2);

        inmobles.add(pis1);
        inmobles.add(pis2);
        inmobles.add(pis3);
        inmobles.add(local1);
        inmobles.add(local2);
        inmobles.add(local3);

        Scanner lector = new Scanner(System.in);
        boolean exit = false;
        System.out.println(" * BENVINGUT A INMOBILIARIA ITB * ");
        while (!exit) {
            System.out.println("""
                    1. Mostrar tots els inmobles.\s
                    2. Mostrar locals.\s
                    3. Mostrar pisos\s
                    4. Mostrar pisos ordenats per metres cuadrats\s
                    5. Mostrar locals ordenats per preu.\s
                    Que vols fer?\s""");
            int select = lector.nextInt();
            switch (select) {
                case 1 -> {
                    System.out.println(" * Inmobles * ");
                    for (Inmoble cInmoble : inmobles) {
                        System.out.println(cInmoble);
                    }
                }
                case 2 -> {
                    System.out.println(" * Locals * ");
                    for (Inmoble cLocal : inmobles) {
                        if (cLocal instanceof Local) {
                            System.out.println(cLocal);
                        }
                    }
                }
                case 3 -> {
                    System.out.println(" * Pisos * ");
                    for (Inmoble cPis : inmobles) {
                        if (cPis instanceof Pis) {
                            System.out.println(cPis);
                        }
                    }
                }
                case 4 -> {
                    //Collections.sort(inmobles);

                    System.out.println(" * Locals (Ordenats per preu) * ");
                    for (Inmoble cLocal : inmobles) {
                        if (cLocal instanceof Local) {
                            System.out.println(cLocal);
                        }
                    }
                }
                case 5 -> {
                    //Collections.sort(inmobles);

                    System.out.println(" * Pisos (Ordenats per metres quadrats) * ");
                    for (Inmoble cPis : inmobles) {
                        if (cPis instanceof Pis) {
                            System.out.println(cPis);
                        }
                    }
                }
                default -> {
                    System.out.println("FINS AVIAT!");
                    exit = true;
                }
            }
        }
    }
}
