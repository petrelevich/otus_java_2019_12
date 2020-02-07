package ru.otus.l9.lombok;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.With;
import lombok.experimental.NonFinal;

@With
@AllArgsConstructor
@Builder(toBuilder = true)
@NoArgsConstructor(force = true)
@Data //@Getter, @Setter, @ToString, @EqualsAndHashCode
public class Person {

  @NonFinal
  String name;

  @NonFinal
  @EqualsAndHashCode.Exclude
  int age;

  @NonFinal
  @Singular
  List<String> contacts;
}
