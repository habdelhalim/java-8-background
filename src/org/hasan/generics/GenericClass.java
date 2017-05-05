package org.hasan.generics;

/**
 * Created by habdelhalim on 5/5/17.
 */
public class GenericClass<T> {

  //  class GenericException<T> extends Throwable {} not allowed

  //  static T myValue ; not allowed

  void testMe(T value) {
    System.out.println("found value" + value);

    //    new T(); not allowed
    // T[] = new T[100]; not allowed

  }
}
