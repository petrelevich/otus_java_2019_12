package ru.otus.l9.annotations.common.complex;

@MyAnnotation("for class")
public final class Annotated {

  @MyAnnotation("for method")
  public final String getString(@MyAnnotation("for parameter") String s) {
    return s + " from method";
  }
}

