package myPrograms.hyperSkill.coffeeMachine;

public class Ex3OOP {
    public static void main(String[] args) {
        System.out.println(ConstantsAndUtilities.A_CONSTANT_TTT);
        System.out.println(ConstantsAndUtilities.B_CONSTANT_QQQ);
        System.out.println(ConstantsAndUtilities.getMagicString());
        System.out.println(ConstantsAndUtilities.convertStringToAnotherString("aa"));
    }

}

class ConstantsAndUtilities {

    public static final String A_CONSTANT_TTT = "1234";

    public static final String B_CONSTANT_QQQ = "7890";

    public static String getMagicString() {
        return A_CONSTANT_TTT + B_CONSTANT_QQQ;
    }

    public static String convertStringToAnotherString(String s) {
        return A_CONSTANT_TTT + s;
    }
}

class ManufacturingController {
    static int control = 0;

    public static String requestProduct(String product) {
        control++;
        return "".concat(control + ". ").concat("Requested ").concat(product);
    }

    public static int getNumberOfProducts() {
        return control;
    }
}

class Cat {
    String name;
    int age;
    static int counter;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return counter;
    }
}