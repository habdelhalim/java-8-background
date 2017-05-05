package org.hasan.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by habdelhalim on 5/5/17.
 */
public class TestGenerics {
  public static void main(String[] args) {
    List<?> wildCardlist = new ArrayList<Integer>();
    //    wildCardlist.add(new Integer(10)); // can not be assigned to wildcard , or read functinos work
  }
}
