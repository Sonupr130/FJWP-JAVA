package class_constructor;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog says bhow");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat says meows");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal obj = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

      
        obj.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
