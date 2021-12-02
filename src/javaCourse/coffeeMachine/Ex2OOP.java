package javaCourse.coffeeMachine;

import java.util.Objects;
import java.util.Scanner;

public class Ex2OOP {

    public static void main(String[] args) {

    }
}

class Army {

    public static void createArmy() {
        new Unit("Homer Simpson");
        new Unit("Seymour Skinner");
        new Unit("Moe Szyslak");
        new Unit("Lenny");
        new Unit("Carl");

        new Knight("Bart Simpson");
        new Knight("Nelson Muntz");
        new Knight("El fantástico Ralph");

        new General("Inspector Chalmers");

        new Doctor("Doctor Nick");
    }

    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;
        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;
        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;
        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;
        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }
}

class Name {
    public static String prepareFullName(String firstName, String lastName) {
        if (firstName == null) {
            return Objects.requireNonNullElse(lastName, "");
        } else {
            if (lastName == null) {
                return firstName;
            }
        }
        return firstName.concat(" ").concat(lastName);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = sc.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}

class IdentityChanger {

    static class Person {
        String name;
        int age;
    }

    static class MakingChanges {
        public static void changeIdentities(Person p1, Person p2) {
            String auxName = p1.name;
            int auxAge = p1.age;

            p1.name = p2.name;
            p1.age = p2.age;
            p2.name = auxName;
            p2.age = auxAge;
        }
    }
}