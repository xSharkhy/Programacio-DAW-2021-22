package javaCourse.cinemaRoom;

import java.util.Arrays;
import java.util.Scanner;

public class CinemaRoom {
    static Scanner sc = new Scanner(System.in);
    static final int TICKET = 10;
    static final int REDUCED_TICKET = 8;
    static final int MAX_SEATS = 8;

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = sc.nextInt();
        char[][] cinema = new char[rows][seats];
//        totalIncomeCinema(rows, seats);

        fulfillCinema(cinema);
        printCinema(cinema);
        selectSeat(cinema, rows, seats);
    }

    private static void selectSeat(char[][] cinema, int rows, int seats) {
        System.out.println("\nEnter a row number:");
        int selectedRow = sc.nextInt();
        System.out.println("Enter a seat number in that row:");
        int selectedSeat = sc.nextInt();
        cinema[selectedRow - 1][selectedSeat - 1] = 'B';
        int selectedTicket = rows * seats < MAX_SEATS ? TICKET : selectedRow > rows / 2 ? REDUCED_TICKET : TICKET;
        System.out.printf("%nTicket price: $%d%n%n", selectedTicket);
        printCinema(cinema);
    }

    private static void totalIncomeCinema(int rows, int seats) {
        int smallIncome = rows * seats * TICKET;
        int largeIncome = ((rows % 2) == 0) ?
                rows / 2 * seats * TICKET + rows / 2 * seats * REDUCED_TICKET
                : rows / 2 * seats * TICKET + (rows / 2 + 1) * seats * REDUCED_TICKET;
        System.out.println("Total income:");
        if (rows * seats < 60) {
            System.out.printf("$%d%n", smallIncome);
        } else { // 7 * 9, 8 * 8, 8 * 9, 9 * 9
            System.out.printf("$%d%n", largeIncome);
        }
    }

    private static void fulfillCinema(char[][] cinema) {
        for (char[] chars : cinema) {
            Arrays.fill(chars, 'S');
        }
    }

    private static void printCinema(char[][] cinema) {
        System.out.println("Cinema:");
        for (int i = 0; i < cinema.length; i++) {
            if (i == 0) {
                for (int j = 0; j <= cinema[i].length; j++) {
                    if (j == 0) {
                        System.out.print("  ");
                    } else {
                        System.out.printf("%d ", j);
                    }
                    if (j == cinema[i].length) {
                        System.out.println();
                    }
                }
            }
            for (int j = 0; j < cinema[i].length; j++) {
                if (j == 0) {
                    System.out.printf("%d ", i + 1);
                }
                System.out.printf("%c ", cinema[i][j]);
            }
            System.out.println();
        }
    }
}
