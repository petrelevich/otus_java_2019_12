package ru.otus.l9.annotations.processor;

@ClassAnnotation
public final class DataClass {

  private final int value;

  public DataClass(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
