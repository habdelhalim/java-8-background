package org.hasan.quiz;

/**
 * Created by habdelhalim on 4/30/17.
 */
public class ThirdTest {
  void print(Integer i) {
    System.out.println("Integer");
  }

  void print(int i) {
    System.out.println("int");
  }

  void print(long i) {
    System.out.println("long");
  }

  public static void main(String[] args) {
    ThirdTest thirdTest = new ThirdTest();
    thirdTest.print(10);
  }
}
