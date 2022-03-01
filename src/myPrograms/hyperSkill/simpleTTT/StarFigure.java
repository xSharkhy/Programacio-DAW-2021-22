package myPrograms.hyperSkill.simpleTTT;

import java.util.Scanner;

public class StarFigure {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (!sc.hasNext("^[0-9]*[13579]$")) {
            System.out.println("Invalid input!");
            sc.next();
        }
        int arrayLenght = Integer.parseInt(sc.next());
        char[][] starArray = new char[arrayLenght][arrayLenght];
        for (int i = 0; i < starArray.length; i++) {
            for (int j = 0; j < starArray[i].length; j++) {
                starArray[i][j] = i == j || i == (arrayLenght / 2) ||
                        j == (arrayLenght / 2) || i + j ==
                        arrayLenght - 1 ? '*' : '.';
            }
        }
        for (char[] chars : starArray) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }
}
