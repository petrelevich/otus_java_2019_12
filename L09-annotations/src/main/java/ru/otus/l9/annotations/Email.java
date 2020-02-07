package ru.otus.l9.annotations;

import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Created by tully.
 */
@Retention(CLASS)
@Target(TYPE_USE)
public @interface Email {
  String value() default "dsf@kjdf.com";
}
