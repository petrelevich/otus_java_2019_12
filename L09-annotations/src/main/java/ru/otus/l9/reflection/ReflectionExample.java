package ru.otus.l9.reflection;

//import lombok.experimental.NonFinal;

import java.lang.reflect.Field;

public class ReflectionExample {

  //  @NonFinal
  private final int x;

  public ReflectionExample(int x) {
    this.x = x;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) throws NoSuchFieldException, IllegalAccessException {
    //    this.x = x;
    Field field = ReflectionExample.class.getDeclaredField("x");
    field.setAccessible(true);
    field.set(this, x);
  }
}
