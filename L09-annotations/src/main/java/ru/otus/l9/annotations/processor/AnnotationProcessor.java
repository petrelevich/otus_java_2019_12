package ru.otus.l9.annotations.processor;

import static javax.lang.model.SourceVersion.RELEASE_13;

import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

/**
 * cd L09-annotations
 * javac -d target/classes -cp src/main/java src/main/java/ru/otus/l6/annotations/processor/AnnotationProcessor.java
 * javac -d target/classes -cp target/classes:src/main/java/ -processor ru.otus.l6.annotations.processor.AnnotationProcessor src/main/java/ru/otus/l6/annotations/processor/DataClass.java
 */
@SuppressWarnings("unused")
@SupportedSourceVersion(RELEASE_13)
@SupportedAnnotationTypes("ru.otus.l9.annotations.processor.ClassAnnotation")
public class AnnotationProcessor extends AbstractProcessor {

  @Override
  public boolean process(Set<? extends TypeElement> annotations,
                         RoundEnvironment roundEnv) {

    System.out.println(roundEnv);
    System.out.println("Annotations size: " + annotations.size());

    Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(ClassAnnotation.class);

    System.out.printf("Total elements annotated with %s: %d\n",
        ClassAnnotation.class.getCanonicalName(),
        elements.size());

    for (var element : elements)
      System.out.println(element.getSimpleName());

    return false;
  }
}
