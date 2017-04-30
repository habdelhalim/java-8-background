package org.hasan.inheritance;

/**
 * Created by habdelhalim on 4/30/17.
 */
public class MyImpl extends MyAbstract implements MyInterface {

  public static void main(String[] args) {
    MyImpl myImpl = new MyImpl();
    myImpl.myMethod();
  }
}
