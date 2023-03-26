package basic.abstraction;

public abstract class Animal {

    private String type;
    private int age;

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public abstract void bark();

    public void move() {
        System.out.println("Move");
    }
}