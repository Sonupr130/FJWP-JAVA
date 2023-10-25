package abstract_class;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class MyAnimal {
    public static void main(String[] args) {
        Animal anml = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println("Animal: ");
        anml.makeSound(); // call the makeSound method of the Animal class.

        System.out.println("Dog: ");
        d.makeSound(); // call the overridden makeSound method in the Dog class

        System.out.println("Cat: ");
        c.makeSound(); // call the overridden makeSound method in the Cat class
    }
}

//------ OUTPUT -----------------------------------------------------

//Animal:
//The animal makes a sound.
//Dog: 
//The dog barks.
//Cat: 
//The cat meows.
