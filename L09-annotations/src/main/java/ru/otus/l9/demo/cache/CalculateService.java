package ru.otus.l9.demo.cache;

public interface CalculateService {

  @Cache
  int add(Operation operation);

}
