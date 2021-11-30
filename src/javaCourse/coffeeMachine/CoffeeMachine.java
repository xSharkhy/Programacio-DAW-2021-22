package javaCourse.coffeeMachine;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner sc = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cups = 9;
    static int money = 550;

    public static void main(String[] args) {
        boolean flag = true;
        do {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String option = sc.nextLine();
            switch (option) {
                case "buy" -> buy();
                case "fill" -> fill();
                case "take" -> take();
                case "remaining" -> print();
                case "exit" -> flag = false;
                default -> System.out.println("Wrong Input!");
            }
        } while (flag);
    }

    private static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        water += Integer.parseInt(sc.nextLine());
        System.out.println("Write how many ml of milk you want to add:");
        milk += Integer.parseInt(sc.nextLine());
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeans += Integer.parseInt(sc.nextLine());
        System.out.println("Write how many disposable cups of coffee you want to add:");
        cups += Integer.parseInt(sc.nextLine());
    }

    private static void take() {
        System.out.println("I gave you $" + money);
        money -= money;
    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String option = sc.nextLine();
        switch (option) {
            case "1" -> System.out.println(espresso());
            case "2" -> System.out.println(latte());
            case "3" -> System.out.println(cappuccino());
            case "back" -> doesNothing();
            default -> System.out.println("Wrong input!");
        }
    }

    private static @NotNull String cappuccino() {
        if (water - 200 >= 0) {
            if (milk - 100 >= 0) {
                if (coffeeBeans - 12 >= 0) {
                    if (cups - 1 >= 0) {
                        water -= 200;
                        milk -= 100;
                        coffeeBeans -= 12;
                        cups -= 1;
                        money += 6;
                        return "I have enough resources, making you a coffee!";
                    } else {
                        return "Sorry, not enough cups!";
                    }
                } else {
                    return "Sorry, not enough coffee beans!";
                }
            } else {
                return "Sorry, not enough milk!";
            }
        } else {
            return "Sorry, not enough water!";
        }
    }

    private static void doesNothing() {
    }

    private static @NotNull String latte() {
        if (water - 350 >= 0) {
            if (milk - 75 >= 0) {
                if (coffeeBeans - 16 >= 0) {
                    if (cups - 1 >= 0) {
                        water -= 350;
                        milk -= 75;
                        coffeeBeans -= 20;
                        cups -= 1;
                        money += 7;
                        return "I have enough resources, making you a coffee!";
                    } else {
                        return "Sorry, not enough cups!";
                    }
                } else {
                    return "Sorry, not enough coffee beans!";
                }
            } else {
                return "Sorry, not enough milk!";
            }
        } else {
            return "Sorry, not enough water!";
        }
    }

    private static @NotNull String espresso() {
        if (water - 250 >= 0) {
            if (coffeeBeans - 16 >= 0) {
                if (cups - 1 >= 0) {
                    water -= 250;
                    coffeeBeans -= 16;
                    cups -= 1;
                    money += 4;
                    return "I have enough resources, making you a coffee!";
                } else {
                    return "Sorry, not enough cups!";
                }
            } else {
                return "Sorry, not enough coffee beans!";
            }
        } else {
            return "Sorry, not enough water!";
        }
    }

    private static void print() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();
    }
}

//    private static void howSupplies() {
//        System.out.println("Write how many ml of water the coffee machine has:");
//        int howWater = sc.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        int howMilk = sc.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine has:");
//        int howBeans = sc.nextInt();
//        System.out.println("Write how many cups of coffee you will need:");
//        int howMany = sc.nextInt();
//        int[] values = {calculateWater(howWater), calculateMilk(howMilk), calculateBeans(howBeans)};
//        int maxCoffees = Arrays.stream(values).min().getAsInt();
//        if (maxCoffees == howMany) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if (maxCoffees > howMany) {
//            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", maxCoffees - howMany);
//        } else if (maxCoffees < howBeans) {
//            System.out.printf("No, I can make only %d cup(s) of coffee", maxCoffees);
//        } else if (maxCoffees == 0) {
//            System.out.println("No, I can make only 0 cup(s) of coffee");
//        }
//    }
//
//    private static int calculateMilk(int howMilk) {
//        return howMilk / milk;
//    }
//
//    private static int calculateBeans(int howBeans) {
//        return howBeans / coffeeBeans;
//    }
//
//    private static int calculateWater(int howWater) {
//        return howWater / water;
//    }
//
//    private static void calculateCoffee() {
//        System.out.println("Write how many cups of coffee you will need:");
//        int howMany = sc.nextInt();
//        System.out.printf("For %d cups of coffee you will need:%n", howMany);
//        System.out.printf("%d ml of water%n", howMany * water);
//        System.out.printf("%d ml of milk%n", howMany * milk);
//        System.out.printf("%d g of coffee beans%n", howMany * coffeeBeans);
//    }
//}
