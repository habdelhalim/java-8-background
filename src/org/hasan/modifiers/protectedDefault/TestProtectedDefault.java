package org.hasan.modifiers.protectedDefault;

import org.hasan.modifiers.protectedDefault.sub.ProtectedDefaultClass;

/**
 * Created by habdelhalim on 4/30/17.
 */
public class TestProtectedDefault {
  public static void main(String[] args) {
    ProtectedDefaultClass defaultClass = new ProtectedDefaultClass();
    //    System.out.println(defaultClass.protectedField); // not accessible
    //    System.out.println(defaultClass.defaultField); // not accessible
  }
}
