package org.hasan.modifiers.protectedDefault;

import org.hasan.modifiers.protectedDefault.sub.ProtectedDefaultClass;

/**
 * Created by habdelhalim on 4/30/17.
 */
public class TestProtectedDefaultClass extends ProtectedDefaultClass {
  public static void main(String[] args) {
    TestProtectedDefaultClass testClass = new TestProtectedDefaultClass();

    System.out.println(testClass.protectedField);
    //    System.out.println(testClass.defaultField); //  not accessible

  }
}
