package org.hasan.filter.org.hasan.functional;

import java.util.function.Consumer;

/**
 * Created by habdelhalim on 4/29/17.
 */
public class StringConsumer implements Consumer<String> {
  @Override public void accept(String s) {
    System.out.println(s);
  }
}
