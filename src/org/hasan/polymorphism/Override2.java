package org.hasan.polymorphism;

/**
 * Created by habdelhalim on 4/30/17.
 */
public class Override2 {

  class Point {
    int x;
    int y;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    //not override as the argument is downcast of Object
    public boolean equals(Point other) {
      if (other == null)
        return false;
      if (other.x == this.x && other.y == this.y)
        return true;
      else
        return false;
    }
  }

  public static void main(String[] args) {
    Point p1 = new Override2().new Point(10, 20);
    Point p2 = new Override2().new Point(20, 10);
    Point p3 = new Override2().new Point(10, 20);

    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));
    System.out.println(p2.equals(p3));

    Object p11 = new Override2().new Point(10, 20);
    Object p21 = new Override2().new Point(20, 10);
    Object p31 = new Override2().new Point(10, 20);

    System.out.println(p11.equals(p21));
    System.out.println(p11.equals(p31)); // not true o.O , object equals is called instead of Point
    System.out.println(p21.equals(p31));
  }
}
