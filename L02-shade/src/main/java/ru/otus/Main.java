package ru.otus;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sergey
 * created on 01.07.18.
 */

/*
Useful link:
https://maven.apache.org/plugins/maven-shade-plugin/index.html
 */

public class Main {
  public static void main(String[] args) {
    List<Integer> example = new ArrayList<>();
    System.out.println(example);

    System.out.println("Hello, World. Shade test!");
  }
}
