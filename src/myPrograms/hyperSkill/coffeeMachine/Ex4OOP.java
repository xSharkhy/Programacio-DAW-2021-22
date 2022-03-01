package myPrograms.hyperSkill.coffeeMachine;

import java.util.Random;

public class Ex4OOP {
}

//Examples
enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

enum UserStatus {
    PENDING, ACTIVE, BLOCKED
}

enum Role {
    ADMIN, USER
}

enum Commands {
    SIT, DOWN, STAY, COME
}

enum Currency {
    USD, EUR, GBP, RUB, UAH, KZT, CAD, JPY, CNY
}

enum Zodiac {
    ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, LIBRA, SCORPIO, SAGITTARIUS, CAPRICORN, AQUARIUS, PISCES
}

enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Secret {
    STAR, CRASH, START, CRUSH, STARTATION, CRISTOPHER
}

class aaaaa {
    public static void main(String[] args) {
        UserStatus active = UserStatus.ACTIVE;
        System.out.println(active.name());

        UserStatus blocked = UserStatus.valueOf("BLOCKED");
        //UserStatus blocked2 = UserStatus.valueOf("blocked"); //IllegalArgumentException

        UserStatus[] statuses = UserStatus.values(); // [PENDING, ACTIVE, BLOCKED]

        System.out.println(active.ordinal()); // 1 (starting with 0)
        System.out.println(UserStatus.BLOCKED.ordinal()); // 2

        System.out.println(active.equals(UserStatus.ACTIVE)); // true
        System.out.println(active == UserStatus.ACTIVE); // true

        int pick = new Random().nextInt(UserStatus.values().length);
        UserStatus status = UserStatus.values()[pick];

        switch (status) {
            case PENDING -> System.out.println("You need to wait a little.");
            case ACTIVE -> System.out.println("No problems, you may pass here.");
            case BLOCKED -> System.out.println("Stop! You can't pass here.");
            default -> System.out.println("Unsupported enum constant.");
        }

        Role role1 = Role.ADMIN;
        Role role2 = Role.ADMIN;
        Role role3 = Role.USER;
        System.out.println(role1 == Role.ADMIN);
        System.out.println(role1.equals(role2));
        System.out.println(role1 == role2);
        System.out.println(role1 == role3);

        System.out.println(Commands.STAY.ordinal());

        Zodiac capricorn = Zodiac.CAPRICORN;
        Zodiac leo = Zodiac.LEO;

        int counter = 0;
        for (int i = 0; i < Secret.values().length; i++) {
            if (Secret.values()[i].toString().indexOf("STAR") == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
