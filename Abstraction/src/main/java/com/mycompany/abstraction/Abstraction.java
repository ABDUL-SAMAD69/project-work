
package com.mycompany.abstraction;
abstract class Shape {
    
    abstract void draw();
}


class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        
    }
}
