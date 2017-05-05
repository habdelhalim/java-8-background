package org.hasan.functional;

/**
 * Created by habdelhalim on 4/30/17.
 */
@FunctionalInterface
public interface MyFunctionalInterface {
  //any method of Object is not considered as abstract method for the functional interface, nor default methods
  boolean equals(Object other);

  // void wait(); cant have it in interface
  int hashCode();

  default void someMethod() {
    System.out.println("some method");
  }

  void overrideMe();
}
