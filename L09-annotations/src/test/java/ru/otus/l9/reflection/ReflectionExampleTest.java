package ru.otus.l9.reflection;

import static org.assertj.core.api.Assertions.assertThat;

import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReflectionExampleTest {

  ReflectionExample example = new ReflectionExample(10);

  @Test
  @SneakyThrows
  @DisplayName("SetX method works correctly")
  void setX() {
    assertThat(example.getX()).isEqualTo(10);
    example.setX(15);
    assertThat(example.getX()).isEqualTo(15);
  }
}
