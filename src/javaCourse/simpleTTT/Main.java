package javaCourse.simpleTTT;

import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final String separator = "---------";
        final int tttSize = 3;

        System.out.print("Enter cells: ");
        while (!sc.hasNext("[_OX][_OX][_OX][_OX][_OX][_OX][_OX][_OX][_OX]")) {
            System.out.println("Invalid input!");
            sc.next();
            System.out.print("Enter cells: ");
        }
        char[] gameArray = sc.next().toCharArray();
        char[][] gameMatrix = new char[tttSize][tttSize];
        int k = 0;
        for (int i = 0; i < tttSize; i++) {
            for (int j = 0; j < tttSize; j++) {
                gameMatrix[i][j] = gameArray[k];
                k++;
            }
        }

        printGame(separator, tttSize, gameMatrix);
        sc.nextLine();

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
                        printGame(separator, tttSize, gameMatrix);
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

//        System.out.println(returnResult(gameArray));
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
/*
    public static String returnResult(char[] gameArray) {
        boolean xWins = false;
        boolean oWins = false;
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
        //IMPOSSIBLE
        byte countX = 0;
        byte countO = 0;
        for (char c : gameArray) {
            if (c == 'X') countX++;
            if (c == 'O') countO++;
        }
        if (countX - countO > 1 || countO - countX > 1) return "Impossible";
        if (xWins && oWins) return "Impossible";
        else if (xWins) return "X Wins";
        else if (oWins) return "O Wins";
        //GAME NOT FINISHED
        for (char c : gameArray) {
            if (c == '_') {
                return "Game not Finished";
            }
        }
        //DRAW
        return "Draw";
    }
*/
}