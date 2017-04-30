package org.hasan.inheritance;

/**
 * Created by habdelhalim on 4/30/17.
 */
public interface MyInterface {

  default void myMethod() {
    System.out.println("My Interface method");
  }
}
