package myPrograms.hyperSkill.coffeeMachine;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        CoffeeMachineConfig coffeeMachine = new CoffeeMachineConfig(400, 540, 120, 9, 550);
    }
}

class CoffeeMachineConfig {

    static Scanner sc = new Scanner(System.in);

    int water;
    int milk;
    int coffeeBeans;
    int cups;
    int money;

    public CoffeeMachineConfig(int water, int milk, int coffeeBeans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
        this.money = money;

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

    private void buy() {
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

    public void fill() {
        System.out.println("Write how many ml of water you want to add:");
        water += Integer.parseInt(sc.nextLine());
        System.out.println("Write how many ml of milk you want to add:");
        milk += Integer.parseInt(sc.nextLine());
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeans += Integer.parseInt(sc.nextLine());
        System.out.println("Write how many disposable cups of coffee you want to add:");
        cups += Integer.parseInt(sc.nextLine());
    }

    public void take() {
        System.out.println("I gave you $" + money);
        money -= money;
    }


    private @NotNull String cappuccino() {
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

    private void doesNothing() {
    }

    private @NotNull String latte() {
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

    private @NotNull String espresso() {
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

    private void print() {
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

enum Direction {
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    private final String shortCode;

    Direction(String code) {
        this.shortCode = code;
    }

    public String getShortCode() {
        return this.shortCode;
    }

    public static void main(String[] args) {

        System.out.println(Direction.NORTH.getShortCode());
    }
}