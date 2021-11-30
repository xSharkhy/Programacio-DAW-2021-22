package javaCourse.cinemaRoom;

import java.util.Arrays;
import java.util.Scanner;

public class CinemaRoom {
    static Scanner sc = new Scanner(System.in);
    static final int TICKET = 10;
    static final int REDUCED_TICKET = 8;
    static final int MAX_SEATS = 60;
    static int income = 0;

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the number of seats in each row:");
        int seats = Integer.parseInt(sc.nextLine());
        char[][] cinema = new char[rows][seats];
        fulfillCinema(cinema);
        CinemaRoom program = new CinemaRoom();
        program.menu(cinema, rows, seats);
    }

    private void menu(char[][] cinema, int rows, int seats) {
        byte option;
        boolean control = true;
        do {
            System.out.println("\n1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            option = Byte.parseByte(sc.nextLine());
            switch (option) {
                case 1 -> printCinema(cinema);
                case 2 -> selectSeat(cinema, rows, seats);
                case 3 -> printStatistics(cinema, rows, seats);
                case 0 -> control = false;
                default -> System.out.println("Bad input, Try again.");
            }
        } while (control);
    }

    private static void selectSeat(char[][] cinema, int rows, int seats) {
        int selectedRow, selectedSeat;
        do {
            System.out.println("\nEnter a row number:");
            selectedRow = Integer.parseInt(sc.nextLine());
            System.out.println("Enter a seat number in that row:");
            selectedSeat = Integer.parseInt(sc.nextLine());
            try {
                if (cinema[selectedRow - 1][selectedSeat - 1] == 'B') {
                    System.out.println("That ticket has already been purchased!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Wrong input!");
            }
        } while (true);
        cinema[selectedRow - 1][selectedSeat - 1] = 'B';
        int selectedTicket = rows * seats < MAX_SEATS ? TICKET : selectedRow > rows / 2 ? REDUCED_TICKET : TICKET;
        System.out.printf("%nTicket price: $%d%n%n", selectedTicket);
        income += selectedTicket;
    }

    private static int totalIncomeCinema(int rows, int seats) {
        int smallIncome = rows * seats * TICKET;
        int largeIncome = ((rows % 2) == 0) ?
                rows / 2 * seats * TICKET + rows / 2 * seats * REDUCED_TICKET
                : rows / 2 * seats * TICKET + (rows / 2 + 1) * seats * REDUCED_TICKET;
        if (rows * seats < 60) {
            return smallIncome;
        } else { // 7 * 9, 8 * 8, 8 * 9, 9 * 9
            return largeIncome;
        }
    }

    private static void printStatistics(char[][] cinema, int rows, int seats) {
        System.out.println();
        int counter = 0;
        int totalSeats = rows * seats;
        for (char[] chars : cinema) {
            for (char aChar : chars) {
                if (aChar == 'B') {
                    counter++;
                }
            }
        }
        double percentage = ((double) counter / totalSeats) * 100;
        System.out.printf("Number of purchased tickets: %d%n", counter);
        System.out.printf("Percentage: %.2f%% %n", percentage);
        System.out.printf("Current income: $%d%n", income);
        System.out.printf("Total income: $%d%n", totalIncomeCinema(rows, seats));
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
