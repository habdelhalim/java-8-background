package org.hasan.nested;

/**
 * Created by habdelhalim on 4/30/17.
 */
public abstract class Shape {
  public static class Color {
    private int red, green, blue;

    Color(int red, int green, int blue) {
      this.red = red;
      this.green = green;
      this.blue = blue;
    }

    @Override public String toString() {
      return "this color is " + red + " " + green + " " + blue;
    }

    void print() {
      System.out.println("this color is " + red + " " + green + " " + blue);
    }
  }

  public static void main(String[] args) {
    Color color = new Shape.Color(10, 10, 10);
    color.print();
  }
}
