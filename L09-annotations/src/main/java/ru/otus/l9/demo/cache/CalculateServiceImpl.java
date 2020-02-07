package ru.otus.l9.demo.cache;

public class CalculateServiceImpl implements CalculateService {

  @Override
  public int add(Operation operation) {
    return operation.getA() + operation.getB();
  }
}
