package ru.otus.l9.annotations.common.wrap;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import ru.otus.l9.annotations.common.AliasFor;


@Retention(RUNTIME)
public @interface Owner {

  @AliasFor("name")
  String value() default "";

  @AliasFor("value")
  String name() default "";

  boolean isLease() default false;
}
