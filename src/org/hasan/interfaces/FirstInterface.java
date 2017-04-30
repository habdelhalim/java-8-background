package org.hasan.interfaces;

/**
 * Created by habdelhalim on 4/29/17.
 */
public interface FirstInterface {
  String field = "Constant";

  interface InnerInterface {
    static void printMe() {
      System.out.println("print inner interface method");
    }
  }

  default void myMethod() {
    System.out.println(FirstInterface.class.getCanonicalName());
  }

  static void printMe() {
    InnerInterface.printMe();
    System.out.println("print interface method");
  }

  public static void main(String[] args) {
    FirstInterface.printMe();
    System.out.println(FirstInterface.field);

    FirstInterface.InnerInterface.printMe();
  }
}
