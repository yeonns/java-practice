package basic.interfaces;

import basic.abstraction.Animal;

public class Bird extends Animal implements Flyable {

    public Bird(String type, int age) {
        super(type, age);
    }

    @Override
    public void bark() {
        System.out.println("Tweet");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
