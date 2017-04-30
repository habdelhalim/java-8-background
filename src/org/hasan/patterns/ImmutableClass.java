package org.hasan.patterns;

/**
 * Created by habdelhalim on 4/30/17.
 */
public final class ImmutableClass {
  private String privateField;

  public ImmutableClass(String field) {
    this.privateField = field;
  }

  public String getPrivateField() {
    return privateField;
  }

  public ImmutableClass copy() {
    return new ImmutableClass(this.privateField);
  }

  public static void main(String[] args) {
    ImmutableClass immutableClass = new ImmutableClass("somevalue2");
    System.out.println(immutableClass.getPrivateField());
    ImmutableClass copy = immutableClass.copy();
    System.out.println(copy.getPrivateField());
  }
}
