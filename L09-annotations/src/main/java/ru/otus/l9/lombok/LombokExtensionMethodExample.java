package ru.otus.l9.lombok;

import java.util.Arrays;
import lombok.SneakyThrows;
import lombok.experimental.ExtensionMethod;
import org.jetbrains.annotations.NotNull;

@ExtensionMethod({Arrays.class, Extensions.class})
class LombokExtensionMethodExample {
  String useExtensionMethods() {
    String iAmNull = null;

    return Extensions.or(iAmNull, Extensions.toTitleCase("hELlO, WORlD!"));
    //    return iAmNull.or("hELlO, WORlD!".toTitleCase());
  }

  @SneakyThrows
  public final @NotNull int[] getSortedArray() {
    int[] intArray = {5, 3, 8, 2};

    Arrays.sort(intArray);
    //    intArray.sort();

    return intArray;
  }


}
