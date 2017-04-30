package org.hasan.filter.org.hasan.interfaces;

/**
 * Created by habdelhalim on 4/29/17.
 */
public interface FirstInterface {
  default void myMethod() {
    System.out.println(FirstInterface.class.getCanonicalName());
  }
}
