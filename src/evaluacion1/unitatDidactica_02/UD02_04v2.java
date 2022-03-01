package evaluacion1.unitatDidactica_02;

import java.util.Scanner;

public class UD02_04v2 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UD02_04v2 program = new UD02_04v2();
        program.menu();
    }

    private void menu() {
        byte option;
        do {
            System.out.println("\nSelecciona un ejercicio ( 1 - 3 ) o salir ( 4 ):");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> ejer19();
                case 2 -> ejer20();
                case 3 -> ejer21();
                case 4 -> System.exit(0);
                default -> System.out.println("Mal input, inténtalo de nuevo.");
            }
        } while (true);

    }

    private void ejer21() {
        System.out.println("\nEjercicio 21:\n");
        System.out.println("Introduzca el nombre completo del cliente:");
        String cliente = sc.nextLine();
        System.out.println("Introduzca el NIF del clietnte:");
        String nif = sc.nextLine();
        System.out.println("Introduzca el domicilio del cliente:");
        String domicilio = sc.nextLine();
        System.out.println("Introduzca el nombre del producto 1:");
        String prod1 = sc.nextLine();
        System.out.println("Introduzca la cantidad de unidades de producto 1:");
        byte ctd1 = Byte.parseByte(sc.nextLine());
        System.out.println("Introduzca el precio de cada unidad:");
        double pre1 = Double.parseDouble(sc.nextLine());
        System.out.println("Introduzca el nombre del producto 2:");
        String prod2 = sc.nextLine();
        System.out.println("Introduzca la cantidad de unidades de producto 2:");
        byte ctd2 = Byte.parseByte(sc.nextLine());
        System.out.println("Introduzca el precio de cada unidad:");
        double pre2 = Double.parseDouble(sc.nextLine());
        System.out.println("Introduzca el nombre del producto 3:");
        String prod3 = sc.nextLine();
        System.out.println("Introduzca la cantidad de unidades de producto 3:");
        byte ctd3 = Byte.parseByte(sc.nextLine());
        System.out.println("Introduzca el precio de cada unidad:");
        double pre3 = Double.parseDouble(sc.nextLine());
        System.out.println("Introduzca el nombre del producto 4:");
        String prod4 = sc.nextLine();
        System.out.println("Introduzca la cantidad de unidades de producto 4:");
        byte ctd4 = Byte.parseByte(sc.nextLine());
        System.out.println("Introduzca el precio de cada unidad:");
        double pre4 = Double.parseDouble(sc.nextLine());
        System.out.println("Introduzca el nombre del producto 5:");
        String prod5 = sc.nextLine();
        System.out.println("Introduzca la cantidad de unidades de producto 5:");
        byte ctd5 = Byte.parseByte(sc.nextLine());
        System.out.println("Introduzca el precio de cada unidad:");
        double pre5 = Double.parseDouble(sc.nextLine());
        double imp1 = ctd1 * pre1;
        double imp2 = ctd2 * pre2;
        double imp3 = ctd3 * pre3;
        double imp4 = ctd4 * pre4;
        double imp5 = ctd5 * pre5;
        double totalBruto = imp1 + imp2 + imp3 + imp4 + imp5;
        System.out.println("Introduzca el descuento a aplicar:");
        double descuento = Double.parseDouble(sc.nextLine());
        double total = totalBruto * ((100 - descuento) / 100);
        String separadorAbsurdo = "#######################################################################################";
        System.out.println(separadorAbsurdo);
        System.out.printf("# CLIENTE: %-57s N.I.F. %-9s #\n", cliente, nif);
        System.out.printf("# DOMICILIO: %-72s #\n", domicilio);
        System.out.println(separadorAbsurdo);
        System.out.printf("# %-8s # %-50s # %-8s # %-8s #\n", "CANTIDAD", "CONCEPTO - REFERENCIA", "PRECIO", "IMPORTE");
        System.out.println(separadorAbsurdo);
        System.out.printf("# %-8d # %-50s # %-8.2f # %-8.2f #\n", ctd1, prod1, pre1, imp1);
        System.out.printf("# %-8d # %-50s # %-8.2f # %-8.2f #\n", ctd2, prod2, pre2, imp2);
        System.out.printf("# %-8d # %-50s # %-8.2f # %-8.2f #\n", ctd3, prod3, pre3, imp3);
        System.out.printf("# %-8d # %-50s # %-8.2f # %-8.2f #\n", ctd4, prod4, pre4, imp4);
        System.out.printf("# %-8d # %-50s # %-8.2f # %-8.2f #\n", ctd5, prod5, pre5, imp5);
        System.out.println(separadorAbsurdo);
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t# %-11s # %-14s # %-8s #\n", "TOTAL BRUTO", "DESCUENTO", "TOTAL");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t###########################################");
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t# %-11.2f # %% %-12.2f # %-8.2f #\n", totalBruto, descuento, total);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t###########################################");
    }

    private void ejer20() {
        System.out.println("\nEjercicio 20:\n");
        System.out.println("Inserta la base del triángulo:");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Inserte la altura vertical del triángulo:");
        int h = Integer.parseInt(sc.nextLine());
        double a = ((double) b * h) / 2;
        System.out.printf("El triángulo de base %d y altura %d tiene un área de %.4f\n", b, h, a);
    }

    private void ejer19() {
        System.out.println("\nEjercicio 19:\n");
        System.out.println("Preservativo\tPreservative");
        System.out.println("Japonesa\t\tJapanese");
        System.out.println("Alumno\t\t\tPupil");
        System.out.println("Sonrojarse\t\tto Blush");
        System.out.println("Autopsia\t\tAutopsy");
        System.out.println("Inflamar\t\tInflame");
        System.out.println("Masa\t\t\tMass");
        System.out.println("Enlazar\t\t\tLink");
        System.out.println("Altiplano\t\tPlateau");
        System.out.println("Calabozo\t\tDungeon");
    }
}