package org.hasan.quiz;

/**
 * Created by habdelhalim on 4/30/17.
 */
public class Color {
  int x, y, z;

  void Color() {
    x = 10;
    y = 10;
    z = 10;
  }

  void print() {
    System.out.println("print x " + x + " y " + y + " z " + z);
  }

  @Override public String toString() {
    return "color is " + x + y + z;
  }

  public static void main(String[] args) {
    Color color = new Color();
    color.print();
    System.out.println(color.toString());
  }
}
