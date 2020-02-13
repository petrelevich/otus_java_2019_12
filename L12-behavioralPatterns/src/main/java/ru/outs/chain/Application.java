package ru.outs.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sergey
 * created on 11.09.18.
 */
class Application {
  private List<String> history = new ArrayList<>();

  void addHistoryRecord(String record) {
    history.add(record);
  }

  void printHistory() {
    System.out.println(history);
  }
}
