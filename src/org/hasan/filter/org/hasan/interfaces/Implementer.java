package org.hasan.filter.org.hasan.interfaces;

/**
 * Created by habdelhalim on 4/29/17.
 */
public class Implementer implements FirstInterface, SecondInterface {

  @Override public void myMethod() {
    SecondInterface.super.myMethod();
  }

  public static void main(String[] args) {
    Implementer imp = new Implementer();
    imp.myMethod();
  }
}
