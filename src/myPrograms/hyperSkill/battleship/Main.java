package myPrograms.hyperSkill.battleship;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final Scanner sc = new Scanner(System.in);
    static final String[] ships = {"Aircraft Carrier", "Battleship", "Submarine", "Cruiser", "Destroyer"};
    static final int[] shipCells = {5, 4, 3, 3, 2};
    static final String errorLength = "\nError! Wrong length of the %s! Try again:\n";
    static final String errorLocation = "\nError! Wrong ship location! Try again:\n";
    static final String errorTooClose = "\nError! You placed it too close to another one. Try again:\n";
    static char[][] shipTablePlayerOne = new char[10][10];
    static char[][] gameTablePlayerOne = new char[10][10];
    static char[][] shipTablePlayerTwo = new char[10][10];
    static char[][] gameTablePlayerTwo = new char[10][10];
    static int counter = 0;

    public static void main(String[] args) {
        for (char[] chars : shipTablePlayerOne) Arrays.fill(chars, '~');
        for (char[] chars : gameTablePlayerOne) Arrays.fill(chars, '~');
        for (char[] chars : shipTablePlayerTwo) Arrays.fill(chars, '~');
        for (char[] chars : gameTablePlayerTwo) Arrays.fill(chars, '~');
        placeGame(shipTablePlayerOne);
        System.out.println("Press Enter and pass the move to another player");
        sc.nextLine();
        System.out.println("...");
        placeGame(shipTablePlayerTwo);
        System.out.println("Press Enter and pass the move to another player");
        sc.nextLine();
        System.out.println("...");
        playGame();
    }

    private static void playGame() {
        boolean turn = true;
        while (checkEnd()) {
            if (turn) {
                printDoubleGame(gameTablePlayerOne, shipTablePlayerOne);
                System.out.println("\nPlayer 1, it's your turn:\n\n");
            } else {
                printDoubleGame(gameTablePlayerTwo, shipTablePlayerTwo);
                System.out.println("\nPlayer 2, it's your turn:\n\n");
            }

            //

            int x, y;
            char c;
            while (true) {
                String shot = sc.nextLine();
                x = Character.getNumericValue(shot.charAt(0)) - 10;
                y = Integer.parseInt(shot.replaceFirst("[A-Z]", "")) - 1;
                try {
                    if (turn) {
                        c = shipTablePlayerTwo[x][y];
                    } else {
                        c = shipTablePlayerOne[x][y];
                    }
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("\nError! You entered the wrong coordinates! Try again:\n");
                }
            }
            if (c == '~') {
                if (turn) {
                    shipTablePlayerTwo[x][y] = 'M';
                    gameTablePlayerOne[x][y] = 'M';
                } else {

                    shipTablePlayerOne[x][y] = 'M';
                    gameTablePlayerTwo[x][y] = 'M';
                }
                System.out.println("\nYou missed!\n");
            } else if (c == 'O') {
                if (turn) {
                    shipTablePlayerTwo[x][y] = 'X';
                    gameTablePlayerOne[x][y] = 'X';
                    if (checkShips(shipTablePlayerTwo.clone(), x, y)) System.out.println("\nYou hit a ship!\n");
                    else if (checkEnd()) System.out.println("\nYou sank a ship!\n");
                    else break;
                } else {
                    shipTablePlayerOne[x][y] = 'X';
                    gameTablePlayerTwo[x][y] = 'X';
                    if (checkShips(shipTablePlayerOne.clone(), x, y)) System.out.println("\nYou hit a ship!\n");
                    else if (checkEnd()) System.out.println("\nYou sank a ship!\n");
                    else break;
                }
            }

            //

            System.out.println("Press Enter and pass the move to another player");
            sc.nextLine();
            System.out.println("...\n");
            turn = !turn;
        }
        System.out.println("\nYou sank the last ship. You won. Congratulations!");
    }

    private static boolean checkShips(char[][] shipTable, int x, int y) {
        int cont = 8;
        try {
            for (int i = -1; i <= 1; i++) {
                for (int j = 0; j <= 1; j++) {
                    if (shipTable[x + 1][y + j] == 'O') return true;
                    if (shipTable[x + 1][y + j] == '~') cont--;
                    if (shipTable[x + 1][y + j] == 'X') {
                        x += i;
                        y += j;
                        shipTable[x][y] = '~';
                        checkShips(shipTable, x, y);
                    }
                    if (shipTable[x + 1][y + j] == '~') cont--;
                }
            }
        } catch (ArrayIndexOutOfBoundsException ignored) {

        }
        return cont == 0;
    }

    private static boolean checkEnd() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (shipTablePlayerOne[i][j] == 'O') return true;
            }
        }
        return false;
    }

    private static void placeGame(char[][] shipTable) {
        counter++;
        System.out.printf("Player %d, place your ships to the game field%n", counter);
        printGame(shipTable);
        for (int i = 0; i < ships.length; i++) {
            System.out.printf("%nEnter the coordinates of the %s (%d cells):%n%n", ships[i], shipCells[i]);
            while (true) {
                String coords = sc.nextLine();
                if (checkCoords(shipTable, coords, shipCells[i], ships[i])) break;
            }
            System.out.println();
            printGame(shipTable);
        }
    }

    private static boolean checkCoords(char[][] shipTable, String coords, int shipCells, String ship) {
        String[] coordSplit = coords.split(" ");
        if (coordSplit[0].charAt(0) == coordSplit[1].charAt(0)) { // Horizontal
            int value = Character.getNumericValue(coordSplit[0].charAt(0)) - 10;
            int x = Integer.parseInt(coordSplit[0].replaceFirst("[A-Z]", "")) - 1;
            int y = Integer.parseInt(coordSplit[1].replaceFirst("[A-Z]", "")) - 1;
            int diff = Math.abs(x - y);
            if (diff != shipCells - 1) {
                System.out.printf((errorLength) + "%n", ship);
                return false;
            } else return putShipHorizontal(shipTable, shipCells, value, Math.min(x, y));

        } else if (coordSplit[0].charAt(coordSplit[0].length() - 1) == coordSplit[1].charAt(coordSplit[1].length() - 1)) { //Vertical
            int value = Integer.parseInt(coordSplit[0].replaceFirst("[A-Z]", "")) - 1;
            int x = Character.getNumericValue(coordSplit[0].charAt(0)) - 10;
            int y = Character.getNumericValue(coordSplit[1].charAt(0)) - 10;
            int diff = Math.abs(x - y);
            if (diff != shipCells - 1) {
                System.out.printf((errorLength) + "%n", ship);
                return false;
            } else return putShipVertical(shipTable, shipCells, value, Math.min(x, y));
        } else System.out.println(errorLocation);
        return false;
    }

    private static boolean putShipVertical(char[][] shipTable, int shipCells, int value, int x) {
        switch (value) {
            case 0:
                for (int i = 0; i < shipCells; i++) {
                    if (shipTable[x + i][value] == 'O' || shipTable[x + i][value + 1] == 'O') {
                        System.out.println(errorTooClose);
                        return false;
                    }
                    if (checkVerticalOOB(shipTable, shipCells, value, x, i)) return false;
                }
                break;
            case 9:
                for (int i = 0; i < shipCells; i++) {
                    if (shipTable[x + i][value] == 'O' || shipTable[x + i][value - 1] == 'O') {
                        System.out.println(errorTooClose);
                        return false;
                    }
                    if (checkVerticalOOB(shipTable, shipCells, value, x, i)) return false;
                }

                break;
            default:
                for (int i = 0; i < shipCells; i++) {
                    if (shipTable[x + i][value] == 'O' || shipTable[x + i][value - 1] == 'O' || shipTable[x + i][value + 1] == 'O') {
                        System.out.println(errorTooClose);
                        return false;
                    }
                    if (checkVerticalOOB(shipTable, shipCells, value, x, i)) return false;
                }
        }

        for (int i = 0; i < shipCells; i++) shipTable[x + i][value] = 'O';
        return true;
    }

    private static boolean checkVerticalOOB(char[][] shipTable, int shipCells, int value, int x, int i) {
        if (i == 0 && x != 0 && shipTable[x - 1][value] == 'O') {
            System.out.println(errorTooClose);
            return true;
        } else if (i == shipCells - 1 && x + i < 9 && shipTable[x + i + 1][value] == 'O') {
            System.out.println(errorTooClose);
            return true;
        }
        return false;
    }

    private static boolean putShipHorizontal(char[][] shipTable, int shipCells, int value, int x) {
        switch (value) {
            case 0:
                for (int i = 0; i < shipCells; i++) {
                    if (shipTable[value][x + i] == 'O' || shipTable[value + 1][x + i] == 'O') {
                        System.out.println(errorTooClose);
                        return false;
                    }
                    if (checkHorizontalOOB(shipTable, shipCells, value, x, i)) return false;
                }
                break;
            case 9:
                for (int i = 0; i < shipCells; i++) {
                    if (shipTable[value][x + i] == 'O' || shipTable[value - 1][x + i] == 'O') {
                        System.out.println(errorTooClose);
                        return false;
                    }
                    if (checkHorizontalOOB(shipTable, shipCells, value, x, i)) return false;
                }
                break;
            default:
                for (int i = 0; i < shipCells; i++) {
                    if (shipTable[value][x + i] == 'O' || shipTable[value - 1][x + i] == 'O' || shipTable[value + 1][x + i] == 'O') {
                        System.out.println(errorTooClose);
                        return false;
                    }
                    if (checkHorizontalOOB(shipTable, shipCells, value, x, i)) return false;
                }
        }
        for (int i = 0; i < shipCells; i++) shipTable[value][x + i] = 'O';
        return true;
    }

    private static boolean checkHorizontalOOB(char[][] shipTable, int shipCells, int value, int x, int i) {
        if (i == 0 && x != 0 && shipTable[value][x - 1] == 'O') {
            System.out.println(errorTooClose);
            return true;
        } else if (i == shipCells - 1 && x + i < 9 && shipTable[value][x + i + 1] == 'O') {
            System.out.println(errorTooClose);
            return true;
        }
        return false;
    }

    private static void printGame(char[][] table) {
        for (int i = 0; i < table.length; i++) {
            if (i == 0) System.out.println("  1 2 3 4 5 6 7 8 9 10");
            System.out.print(Character.toChars(65 + i));
            for (int j = 0; j < table.length; j++) {
                System.out.print(" " + table[i][j]);
            }
            System.out.println();
        }
    }

    private static void printDoubleGame(char[][] table1, char[][] table2) {
        printGame(table1);
        System.out.println("---------------------");
        printGame(table2);
    }

}
