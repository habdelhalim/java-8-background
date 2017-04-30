package org.hasan.polymorphism;

/**
 * Created by habdelhalim on 4/30/17.
 */
public class StaticPolymorphism {
  class Shape {
    void defineColor(int red, int green, int blue) {
      System.out.println("define color : ints");
    }

    void defineColor(float red, float green, float blue) {
      System.out.println("define color : floats");
    }
  }

  public static void main(String[] args) {
    Shape shape = new StaticPolymorphism().new Shape();

    shape.defineColor(10, 10, 01);
    shape.defineColor(10.0f, 10.0f, 10.0f);
  }
}
