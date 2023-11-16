
package com.mycompany.polymorphism;
class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching the ball.");
    }
}



public class Polymorphism {

    public static void main(String[] args) {
          Animal myAnimal = new Dog(); 
        myAnimal.makeSound();
        
         if (myAnimal instanceof Dog myDog) { // Downcasting
            // Downcasting
            myDog.fetch(); // Calls fetch method in Dog class
        }
    }
}
