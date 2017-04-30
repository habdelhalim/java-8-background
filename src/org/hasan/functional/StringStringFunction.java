package org.hasan.functional;

import java.util.function.Function;

/**
 * Created by habdelhalim on 4/29/17.
 */
public class StringStringFunction implements Function<String, String> {
  @Override public String apply(String s) {
    return s.concat("weeee");
  }
}
