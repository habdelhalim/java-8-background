package org.hasan.lambda;

/**
 * Created by habdelhalim on 5/5/17.
 */
public class TestAnonymous {

  interface CallMe {
    String call(int weee);
  }

  public static void main(String[] args) {
    String word = "hi There ";
    CallMe callMe = (weee) -> word + weee + "ya";

    // word = "hi there" ; // compile error due as word is effectively final
    System.out.println(callMe.call(123123));
  }
}

