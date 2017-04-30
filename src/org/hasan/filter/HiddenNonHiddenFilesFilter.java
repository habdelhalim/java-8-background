package org.hasan.filter;

import java.io.File;
import java.util.function.Predicate;

/**
 * Created by habdelhalim on 4/29/17.
 */
public class HiddenNonHiddenFilesFilter {

  public static File[] filterNonHidden(String file) {
    return filterNonHidden(new File(file));
  }

  public static File[] filterNonHidden(File file) {
    return filterFilers(file, f -> !f.isHidden());
  }

  public static File[] filterHidden(String file) {
    return filterHidden(new File(file));
  }

  public static File[] filterHidden(File file) {
    return filterFilers(file, f -> f.isHidden());
  }

  private static File[] filterFilers(File file, Predicate<File> filterPredicate) {
    return file.listFiles(filterPredicate::test);
  }

  public static boolean NotHidden(File file) {
    return !file.isHidden();
  }
}
