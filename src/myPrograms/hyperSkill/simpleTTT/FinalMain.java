package myPrograms.hyperSkill.simpleTTT;

import java.util.Arrays;
import java.util.Scanner;

public class FinalMain {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final String separator = "---------";
        final String initGame = "_________";
        final int tttSize = 3;

        char[] gameArray = initGame.toCharArray();
        char[][] gameMatrix = new char[tttSize][tttSize];
        int k = 0;
        for (int i = 0; i < tttSize; i++) {
            for (int j = 0; j < tttSize; j++) {
                gameMatrix[i][j] = gameArray[k];
                k++;
            }
        }
        printGame(separator, tttSize, gameMatrix);
        do {
            if (returnResult(gameMatrix).matches("Game not Finished")) xPlays(gameMatrix);
            else {
                System.out.println(returnResult(gameMatrix));
                break;
            }
            if (returnResult(gameMatrix).matches("Game not Finished")) oPlays(gameMatrix);
            else {
                System.out.println(returnResult(gameMatrix));
                break;
            }
        } while (true);
    }

    private static void oPlays(char[][] gameMatrix) {
        int coordX;
        int coordY;
        String temp;
        System.out.print("Enter the coordinates: ");
        temp = sc.nextLine();
        do {
            if (temp.matches("[0-9] [0-9]")) {
                String[] parts = temp.split(" ");
                coordX = Integer.parseInt(parts[0]);
                coordY = Integer.parseInt(parts[1]);
                if (coordX >= 1 && coordX <= 3 && coordY >= 1 && coordY <= 3) {
                    if (gameMatrix[coordX - 1][coordY - 1] == '_') {
                        gameMatrix[coordX - 1][coordY - 1] = 'O';
                        printGame("---------", 3, gameMatrix);
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        System.out.print("Enter the coordinates: ");
                        temp = sc.nextLine();
                    }
                } else {
                    System.out.println("Coordinates should be from 1 to 3!");
                    System.out.print("Enter the coordinates: ");
                    temp = sc.nextLine();
                }
            } else {
                System.out.println("You should enter numbers!");
                System.out.print("Enter the coordinates: ");
                temp = sc.nextLine();
            }
        } while (true);

    }

    private static void xPlays(char[][] gameMatrix) {
        int coordX;
        int coordY;
        String temp;
        System.out.print("Enter the coordinates: ");
        temp = sc.nextLine();
        do {
            if (temp.matches("[0-9] [0-9]")) {
                String[] parts = temp.split(" ");
                coordX = Integer.parseInt(parts[0]);
                coordY = Integer.parseInt(parts[1]);
                if (coordX >= 1 && coordX <= 3 && coordY >= 1 && coordY <= 3) {
                    if (gameMatrix[coordX - 1][coordY - 1] == '_') {
                        gameMatrix[coordX - 1][coordY - 1] = 'X';
                        printGame("---------", 3, gameMatrix);
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        System.out.print("Enter the coordinates: ");
                        temp = sc.nextLine();
                    }
                } else {
                    System.out.println("Coordinates should be from 1 to 3!");
                    System.out.print("Enter the coordinates: ");
                    temp = sc.nextLine();
                }
            } else {
                System.out.println("You should enter numbers!");
                System.out.print("Enter the coordinates: ");
                temp = sc.nextLine();
            }
        } while (true);
    }

    public static void printGame(String separator, int tttSize, char[][] gameMatrix) {
        System.out.println(separator);
        for (int i = 0; i < tttSize; i++) {
            for (int j = 0; j < tttSize; j++) {
                if (j == 0) {
                    System.out.print("| " + gameMatrix[i][j] + " ");
                } else if (j == 2) {
                    System.out.print(gameMatrix[i][j] + " |\n");
                } else {
                    System.out.print(gameMatrix[i][j] + " ");
                }
            }
        }
        System.out.println(separator);
    }

    public static String returnResult(char[][] gameMatrix) {
        String s = Arrays.deepToString(gameMatrix).replace(" ", "");
        s = s.replace(",", "");
        s = s.replace("[", "");
        s = s.replace("]", "");
        boolean xWins = false;
        boolean oWins = false;
        char[] gameArray = s.toCharArray();
        //HORIZONTAL WINS
        if (gameArray[0] == 'X' && gameArray[1] == 'X' && gameArray[2] == 'X') xWins = true;
        if (gameArray[3] == 'X' && gameArray[4] == 'X' && gameArray[5] == 'X') xWins = true;
        if (gameArray[6] == 'X' && gameArray[7] == 'X' && gameArray[8] == 'X') xWins = true;
        if (gameArray[0] == 'O' && gameArray[1] == 'O' && gameArray[2] == 'O') oWins = true;
        if (gameArray[3] == 'O' && gameArray[4] == 'O' && gameArray[5] == 'O') oWins = true;
        if (gameArray[6] == 'O' && gameArray[7] == 'O' && gameArray[8] == 'O') oWins = true;
        //VERTICAL WINS
        if (gameArray[0] == 'X' && gameArray[3] == 'X' && gameArray[6] == 'X') xWins = true;
        if (gameArray[1] == 'X' && gameArray[4] == 'X' && gameArray[7] == 'X') xWins = true;
        if (gameArray[2] == 'X' && gameArray[5] == 'X' && gameArray[8] == 'X') xWins = true;
        if (gameArray[0] == 'O' && gameArray[3] == 'O' && gameArray[6] == 'O') oWins = true;
        if (gameArray[1] == 'O' && gameArray[4] == 'O' && gameArray[7] == 'O') oWins = true;
        if (gameArray[2] == 'O' && gameArray[5] == 'O' && gameArray[8] == 'O') oWins = true;
        //DIAGONAL WINS
        if (gameArray[0] == 'X' && gameArray[4] == 'X' && gameArray[8] == 'X') xWins = true;
        if (gameArray[2] == 'X' && gameArray[4] == 'X' && gameArray[6] == 'X') xWins = true;
        if (gameArray[0] == 'O' && gameArray[4] == 'O' && gameArray[8] == 'O') oWins = true;
        if (gameArray[2] == 'O' && gameArray[4] == 'O' && gameArray[6] == 'O') oWins = true;
        if (xWins) return "X wins";
        if (oWins) return "O wins";
        //GAME NOT FINISHED
        for (char c : gameArray) {
            if (c == '_') {
                return "Game not Finished";
            }
        }
        //DRAW
        return "Draw";
    }
}