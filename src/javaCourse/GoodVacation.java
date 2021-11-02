package javaCourse;

import java.util.Scanner;

public class GoodVacation {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int duration = sc.nextInt();
        int foodPerDay = sc.nextInt();
        int flightCost = sc.nextInt();
        int nightHotel = sc.nextInt();
        int cost = foodPerDay * duration + 2 * flightCost + nightHotel * (duration - 1);
        System.out.println(cost);
    }
}
