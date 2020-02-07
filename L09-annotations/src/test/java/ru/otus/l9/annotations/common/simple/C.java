package ru.otus.l9.annotations.common.simple;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import ru.otus.l9.annotations.common.wrap.Owner;

@B
@A
@Owner("Федя")
@Retention(RUNTIME)
public @interface C {
}
