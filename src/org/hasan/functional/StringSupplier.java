package org.hasan.functional;

import java.util.function.Supplier;

/**
 * Created by habdelhalim on 4/29/17.
 */
public class StringSupplier implements Supplier<String> {
  @Override public String get() {
    return new String("new one ");
  }
}
