

package com.mycompany.inheritance;
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Some generic sound");
    }
}


class Dog extends Animal {
    public Dog(String name) {
        
        super(name);
    }

  
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }
}



public class Inheritance {

    public static void main(String[] args) {
       Dog myDog = new Dog("Buddy");

        
        System.out.println("Name: " + myDog.getName());

        
        myDog.makeSound();

       
        myDog.fetch();
    }
    }

