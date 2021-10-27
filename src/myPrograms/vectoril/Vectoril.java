package myPrograms.vectoril;

import java.util.Scanner;

public class Vectoril {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Vectoril programa = new Vectoril();
        programa.InicialitzarVector();
    }

    public void InicialitzarVector() {
        System.out.println("Selecciona la mida que vols donar al vector: ");
        int midaV = sc.nextInt();
        int[] vectoril = new int[midaV];
        IntroduirValorsV(vectoril);
    }

    public void IntroduirValorsV(int[] v) {
        System.out.println("Introdueix els valors dins del vector: ");
        for (int x = 0; x < v.length; x++) {
            v[x] = IntroduirValorsTeclat();
        }
        Menu(v);
    }

    public int IntroduirValorsTeclat() {
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Valor no vàlid. ");
        }
        return sc.nextInt();
    }

    public void Menu(int[] vector) {
        System.out.println("""
                Aquestes són les funcions possibles a aplicar al teu vector:
                ==============================================
                1) Visualització de tots els elements (Llistat)\s
                2) Visualització de l’element que es troba en una determinada posició (Consulta per Posició)
                3) Visualitzar la suma total dels elements del vector ( Suma )\s
                4) Visualitzar la mitjana aritmètica dels elements del vector ( Mitjana )\s
                5) Visualitzar el valor màxim, mínim i la mitjana ( MaxMitMin )\s
                Introdueix qualsevol altre número per a sortir del programa.\s
                ==============================================""");
        boolean surt = false;
        while (!surt) {
            System.out.println("Que vols fer?");
            int select = sc.nextInt();
            switch (select) {
                case 1 -> Llistat(vector);
                case 2 -> ConsultarPosicio(vector);
                case 3 -> Suma(vector);
                case 4 -> Mitjana(vector);
                case 5 -> MaxMitMin(vector);
                default -> surt = true;
            }
        }
    }

    public void Llistat(int[] vectoril) {
        System.out.println("Aquest és el vector llistat: ");
        System.out.print("[ ");
        for (int i : vectoril) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public void ConsultarPosicio(int[] vectoril) {
        System.out.println("Introdueix la posició que vols cercar:");
        int posArray = IntroduirValorsTeclat();
        if (posArray < vectoril.length && 0 < posArray) {
            System.out.println("El valor que hi ha a la posició cercada és: " + vectoril[posArray]);
        } else {
            System.out.println("Posició no trobada. ");
        }
    }

    public void Suma(int[] vectoril) {
        int num;
        int suma = 0;
        for (int j : vectoril) {
            num = j;
            suma += num;
        }
        System.out.println("La suma de tots els valors del vector és: " + suma);
    }

    public void Mitjana(int[] vectoril) {
        float num;
        float suma = 0;
        for (int j : vectoril) {
            num = j;
            suma += num;
        }
        float mitjana = suma / vectoril.length;
        System.out.println("La mitjana del vector és: " + mitjana);
    }

    public void MaxMitMin(int[] vectoril) {
        int max;
        int min;
        max = min = vectoril[0];
        for (int i : vectoril) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("El valor màxim del vector és: " + max);
        System.out.println("El valor mínim del vector és: " + min);
    }
}
