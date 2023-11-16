
package com.mycompany.encapsulation;
class Animal {
    private String name; // private instance variable

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Method demonstrating encapsulation
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}


public class Encapsulation {

    public static void main(String[] args) {
      Animal myAnimal = new Animal("Tommy");

        // Accessing the encapsulated variables and methods
        System.out.println("Name of the animal: " + myAnimal.getName());

        // Changing the name using the setter
        myAnimal.setName("Buddy");

        // Making the animal sound
        myAnimal.makeSound();

        // Displaying the updated name
        System.out.println("Updated name of the animal: " + myAnimal.getName());
    }
    }

