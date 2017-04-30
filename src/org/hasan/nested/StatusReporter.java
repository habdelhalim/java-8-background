package org.hasan.nested;

/**
 * Created by habdelhalim on 4/30/17.
 */
public class StatusReporter {
  public static Shape.Color getDescriptiveColor(final Shape.Color color) {
    class DescriptiveColor extends Shape.Color {

      DescriptiveColor(int red, int green, int blue) {
        super(red, green, blue);
      }

      @Override void print() {
        System.out.println("overriden color" + color);
      }
    }

    return new DescriptiveColor(0, 0, 0);
  }

  public static void main(String[] args) {
    Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(100, 100, 100));
    descriptiveColor.print();
  }
}
