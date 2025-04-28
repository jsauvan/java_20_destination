

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

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Meow!");
    }
}