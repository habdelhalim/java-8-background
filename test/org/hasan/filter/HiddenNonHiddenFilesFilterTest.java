package org.hasan.filter;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

/**
 * Created by habdelhalim on 4/29/17.
 */
public class HiddenNonHiddenFilesFilterTest {
  @Test
  public void listFiles() throws Exception {
    Assert.assertNotNull(HiddenNonHiddenFilesFilter.filterNonHidden("src"));
  }

  @Test
  public void listFiles1() throws Exception {
    Assert.assertNotNull(HiddenNonHiddenFilesFilter.filterNonHidden(new File("src")));
  }

  @Test
  public void notHidden() throws Exception {
    Assert.assertTrue("Not hidden file ", HiddenNonHiddenFilesFilter.NotHidden(new File("src")));
    Assert.assertFalse("hidden file ", HiddenNonHiddenFilesFilter.NotHidden(new File(".idea")));
  }

}