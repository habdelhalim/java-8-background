package org.hasan.polymorphism;

/**
 * Created by habdelhalim on 4/30/17.
 */
public class Override {
  class Base {
    @java.lang.Override public boolean equals(Object obj) {
      return super.equals(obj);
    }

    Base overrideMe() {
      return new Base();
    }
  }

  class Sub extends Base {
    //since java5 can have sub type as return
    @java.lang.Override Sub overrideMe() {
      return new Sub();
    }
  }

  public static void main(String[] args) {
    Base base = new Override().new Base();
    Base sub = new Override().new Sub();

    System.out.println(base.overrideMe());
    System.out.println(sub.overrideMe());
  }
}
