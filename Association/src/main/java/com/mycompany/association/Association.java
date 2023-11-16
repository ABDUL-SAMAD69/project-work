

package com.mycompany.association;
class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car {
    private final String model;
    private Person owner;

    public Car(String model) {
        this.model = model;
    }

    public void setOwner(Person person) {
        this.owner = person;
    }

    public String getOwnerName() {
        if (owner != null) {
            return owner.getName();
        } else {
            return "No owner";
        }
    }
}


public class Association {

    public static void main(String[] args) {
         Person john = new Person("John");
        Car johnsCar = new Car("Toyota");

        // Association: John owns a car
        johnsCar.setOwner(john);

        // Display information
        System.out.println(john.getName() + " owns a " + johnsCar.getOwnerName() + "'s car.");
    }
    }
