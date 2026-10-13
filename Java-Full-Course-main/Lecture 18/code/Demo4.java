public class Demo4 {
    public static void main(String[] args) {
        Animal a = new Dog("Bruno");
        a.makeSound();
    }
}

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("making sound");
    }

    final void sleep() {
        System.out.println("Sleeping");
    }

}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Making barking sound");
    }
}

// Abstract classes
//1. Cannot be instantiated directly
//2. Can contain abstract method (method without implementations)
//3. Can also contain normal methods.
//4. Is meant to be extended.

//. Questions:
//1. Can abstract classes have constructors?  --> Yes
//2. Can abstract classes be final ? --> No
//3. Can abstract class have static methods/variables ? --> Yes
//4. Can abstract classes private methods ? --> yes but non abstract
//5. Can abstract classes have final methods ? --> yes but non abstract
//6. Can abstract classes have no abstract method ? --> Yes

