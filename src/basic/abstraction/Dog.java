package basic.abstraction;

public class Dog extends Animal {

    public Dog(String type, int age) {
        super(type, age);
    }

    @Override
    public void bark() {
        System.out.println("Bowwow");
    }
}
