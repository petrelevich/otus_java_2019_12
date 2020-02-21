package ru.otus.singleton;

/**
 * @author sergey
 * created on 19.09.18.
 */
class Singleton {
  private Singleton() {
    System.out.println("lazy creation");
  }

  static Singleton getInstance() {
    System.out.println("getInstance");
    return SingletonHolder.instance;
  }

  private static class SingletonHolder {
    static {
      System.out.println("init SingletonHolder");
    }

    static final Singleton instance = new Singleton();
  }
}
