package ru.otus.l9.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionExample2 {
  public static void main(String... __) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
    Class<ReflectionExample> aClass = ReflectionExample.class;
    for (Method method : aClass.getDeclaredMethods()) {
      System.out.println(method.getName());
      for (Parameter parameter : method.getParameters()) {
        System.out.println(parameter.getName()); //__
      }
    }
    for (Field field : aClass.getDeclaredFields()) {
      System.out.println(field.getName());
    }

    Object instance = aClass.getDeclaredConstructors()[0].newInstance(1);
    Method getXMethod = aClass.getDeclaredMethod("getX");
    Integer integer = (Integer) getXMethod.invoke(instance);
    System.out.println(integer == 1);//true

    Method m = aClass.getDeclaredMethod("m");
    try {
      m.setAccessible(true);
      System.out.println(m.invoke(instance)); //"123"
    } finally {
      m.setAccessible(false);
    }
  }
}
