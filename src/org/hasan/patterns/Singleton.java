package org.hasan.patterns;

/**
 * Created by habdelhalim on 4/30/17.
 */
public class Singleton {

  private Singleton() {
    System.out.println("Calling constructor");
  }

  private static class SingletonHolder {
    static Singleton instance = new Singleton();
  }

  public static Singleton getInstance() {
    return SingletonHolder.instance;
  }

  public void log(String logmessage) {
    System.out.println("logging log message: " + logmessage);
  }

  public static void main(String[] args) {
    Singleton singleton = null;
    System.out.println("before constructor");
    singleton = Singleton.getInstance();
    System.out.println("after instance");
    singleton.log("my message is being logged");
  }
}
