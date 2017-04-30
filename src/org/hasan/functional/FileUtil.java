package org.hasan.functional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by habdelhalim on 4/29/17.
 */
public class FileUtil {
  public static String processFile(FileProcessor processor) throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
      return processor.process(reader);
    }
  }

  public static void main(String[] args) throws IOException {
    System.out.println(FileUtil.processFile(reader -> reader.readLine() + "\n" + reader.readLine()));
  }
}
