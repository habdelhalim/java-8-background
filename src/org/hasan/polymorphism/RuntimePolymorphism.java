package org.hasan.polymorphism;

/**
 * Created by habdelhalim on 4/30/17.
 */
public class RuntimePolymorphism {
  class Shape {
    void defineColor(int red, int green, int blue) {
      System.out.println("Shape");
    }
  }

  class Square extends Shape {
    void defineColor(int red, int green, int blue) {
      System.out.println("Square");
    }
  }

  class Circle extends Shape {
    void defineColor(int red, int green, int blue) {
      System.out.println("Circle");
    }
  }

  public static void main(String[] args) {
    Shape shape = new RuntimePolymorphism().new Shape();
    shape.defineColor(10, 10, 10);

    Shape shape1 = new RuntimePolymorphism().new Square();
    shape1.defineColor(10, 10, 10); //square method will be called

    Shape shape2 = new RuntimePolymorphism().new Circle();
    shape2.defineColor(10, 10, 10); // circle method will be called
  }
}
