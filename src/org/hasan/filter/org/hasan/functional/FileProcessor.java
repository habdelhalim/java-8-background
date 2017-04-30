package org.hasan.filter.org.hasan.functional;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by habdelhalim on 4/29/17.
 */
@FunctionalInterface
public interface FileProcessor {
  String process(BufferedReader reader) throws IOException;
}
