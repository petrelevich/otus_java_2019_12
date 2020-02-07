package ru.otus.l9.demo.cache;

import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@Builder
@With
public class Operation {

  private final int a;
  private final int b;

  public int getA() {
    System.out.println("Getting a");
    return a;
  }
}
