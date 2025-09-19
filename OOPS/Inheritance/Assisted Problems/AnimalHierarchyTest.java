// Superclass Animal
class Animal {
    String name;
    int age;

    // constructor to set values
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method that will be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class inherits Animal
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age); // calling parent constructor
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Cat class inherits Animal
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Bird class inherits Animal
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }
}

public class AnimalHierarchyTest {
    public static void main(String[] args) {
        // Polymorphism--> parent reference, child object
        Animal a1 = new Dog("Tommy", 3);
        Animal a2 = new Cat("Kitty", 2);
        Animal a3 = new Bird("Tweety", 1);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
