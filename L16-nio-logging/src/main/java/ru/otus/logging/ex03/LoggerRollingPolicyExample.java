package ru.otus.logging.ex03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sergey
 * created on 13.08.18.
 */
public class LoggerRollingPolicyExample {
  private static Logger logger = LoggerFactory.getLogger(LoggerRollingPolicyExample.class);
  private long counter = 0;

  public static void main(String[] args) {
    new LoggerRollingPolicyExample().loop();
  }

  public void loop() {
    while (true) {
      logger.error("message for file:{}", counter);
      counter++;
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
