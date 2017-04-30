package org.hasan.interfaces;

/**
 * Created by habdelhalim on 4/29/17.
 */
public interface SecondInterface {
  default void myMethod() {
    System.out.println(SecondInterface.class.getCanonicalName());
  }
}
