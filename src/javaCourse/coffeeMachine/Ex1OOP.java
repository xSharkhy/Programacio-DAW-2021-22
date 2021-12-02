package javaCourse.coffeeMachine;

public class Ex1OOP {
    public static void main(String[] args) {
        System.out.println("hey");
        new Complex().add(new Complex());
        new Complex().subtract(new Complex());
        System.out.println(new Circle().getArea());
        new Patient().say();
        new Clock().next();
    }
}

class Complex {
    double real;
    double image;

    public void add(Complex num) {
        this.real += num.real;
        this.image += num.image;
    }

    public void subtract(Complex num) {
        this.real -= num.real;
        this.image -= num.image;
    }
}

class Circle {
    double radius;

    public double getLength() {
        return 2 * this.radius * Math.PI;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}

class Patient {
    String name;

    public void say() {
        System.out.printf("Hello, my name is %s, I need a doctor.", this.name);
    }
}

class Clock {
    int hours = 12;
    int minutes = 0;

    public void next() {
        this.minutes++;
        if (this.minutes == 60) {
            this.minutes = 0;
            this.hours++;
            if (this.hours == 13) {
                this.hours = 1;
            }
        }
    }
}