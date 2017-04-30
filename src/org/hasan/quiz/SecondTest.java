package org.hasan.quiz;

/**
 * Created by habdelhalim on 4/30/17.
 */
public class SecondTest {
  class Base {

  }

  class Dir1 extends Base {
  }

  class Dir2 extends Base {
  }

  public static void main(String[] args) {
    Base[] bases = new Dir2[3];

    bases[0] = new SecondTest().new Base(); //runtime exception
    bases[0] = new SecondTest().new Dir1();
    bases[0] = new SecondTest().new Dir2();

    System.out.println(bases.length);
  }
}
