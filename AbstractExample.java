

import java.util.List;

// Main class to demonstrate polymorphism and abstraction
public class AbstractExample {
    public static void main(String[] args) {
        // Using var from Java 11 for local variable type inference
        var animals = List.of(new Dog("Buddy"), new Cat("Whiskers"));

        for (var animal : animals) {
            animal.makeSound();
        }
    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}