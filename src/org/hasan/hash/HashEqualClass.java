package org.hasan.hash;

import java.util.HashSet;

/**
 * Created by habdelhalim on 4/30/17.
 */
public class HashEqualClass {
  class HashClass {
    int x;
    int y;

    HashClass(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override public boolean equals(Object obj) {
      if (obj == null)
        return false;

      if (obj instanceof HashClass) {
        return (((HashClass) obj).x == this.x && ((HashClass) obj).y == this.y);
      } else {
        return false;
      }
    }
  }

  class HashEqual {
    int x;
    int y;

    HashEqual(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override public boolean equals(Object obj) {
      if (obj == null)
        return false;

      if (obj instanceof HashEqual) {
        return (((HashEqual) obj).x == this.x && ((HashEqual) obj).y == this.y);
      } else {
        return false;
      }
    }

    @Override public int hashCode() {
      return (x * 7) ^ (y * 15);
    }
  }

  public static void main(String[] args) {
    HashSet<HashClass> set = new HashSet<>();
    set.add(new HashEqualClass().new HashClass(10, 20));
    set.add(new HashEqualClass().new HashClass(10, 20));
    set.add(new HashEqualClass().new HashClass(10, 20));
    System.out.println(set.size()); //size is 3

    HashSet<HashEqual> set2 = new HashSet<>();
    set2.add(new HashEqualClass().new HashEqual(10, 20));
    set2.add(new HashEqualClass().new HashEqual(10, 20));
    set2.add(new HashEqualClass().new HashEqual(10, 20));
    System.out.println(set2.size()); // size is 1
  }
}
