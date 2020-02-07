package ru.otus.l9.annotations.common.complex;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
@MyParentAnnotation("qwerty")
public @interface MyAnnotation {
  String value();
}
