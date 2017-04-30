package org.hasan.inheritance;

/**
 * Created by habdelhalim on 4/30/17.
 */
public class TestNumbers {

  public static double addNumber(Number[] numbers) {
    double sum = 0.0;
    for (Number num : numbers) {
      sum += num.doubleValue();
    }

    return sum;
  }

  public static void main(String[] args) {
    Number[] nums = new Number[4];
    nums[0] = new Byte((byte) 10);
    nums[1] = new Integer(10);
    nums[2] = new Double(10);
    nums[3] = new Float(10);
    System.out.println(TestNumbers.addNumber(nums));

  }
}
