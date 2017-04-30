
import org.hasan.filter.HiddenNonHiddenFilesFilter;

import java.io.File;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    File[] files = HiddenNonHiddenFilesFilter.filterNonHidden(".");
    Arrays.stream(files).forEach(System.out::println);
  }
}
