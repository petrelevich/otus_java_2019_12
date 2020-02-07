package ru.otus.l9.annotations;

import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Created by tully.
 */
@Target(PACKAGE)
@Retention(RUNTIME)
public @interface PackageOwner {
  String value() default "";
  //    String owner() default "";
}
