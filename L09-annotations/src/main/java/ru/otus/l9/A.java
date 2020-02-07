package ru.otus.l9;

import java.lang.reflect.Method;

public class A {

  public static void main(String... __) {
    Method declaredMethod = A.class.getDeclaredMethods()[0];
    System.out.println(declaredMethod.getName());
    System.out.println(declaredMethod.getParameters()[0].getName());
  }
}
