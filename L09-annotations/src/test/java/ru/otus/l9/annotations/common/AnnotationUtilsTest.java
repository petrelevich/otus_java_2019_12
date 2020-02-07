package ru.otus.l9.annotations.common;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Optional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.otus.l9.annotations.common.complex.Annotated;
import ru.otus.l9.annotations.common.complex.MyParentAnnotation;
import ru.otus.l9.annotations.common.simple.A;
import ru.otus.l9.annotations.common.simple.D;
import ru.otus.l9.annotations.common.wrap.Entity;
import ru.otus.l9.annotations.common.wrap.Entity2;
import ru.otus.l9.annotations.common.wrap.Owner;

class AnnotationUtilsTest {

  @Test
  @DisplayName("AnnotationHelper works correctly")
  void annotationHelper() {
    // given
    Class<Annotated> annotatedClass = Annotated.class;

    // when
    Optional<MyParentAnnotation> optionalMyParentAnnotation =
        AnnotationUtils.getDeepAnnotation(annotatedClass, MyParentAnnotation.class);

    // then
    Assertions.assertThat(optionalMyParentAnnotation)
        .isPresent()
        .containsInstanceOf(MyParentAnnotation.class)
        .map(MyParentAnnotation::value)
        .contains("qwerty");
  }

  @Test
  @DisplayName("getDeepAnnotation methods works correctly")
  void getDeepAnnotations() {
    assertThat(AnnotationUtils.getDeepAnnotation(D.class, A.class))
        .isPresent()
        .containsInstanceOf(A.class);
  }

  @Test
  @DisplayName("deepAnnotations method works correctly")
  void deepAnnotations() {
    assertThat(AnnotationUtils.deepAnnotations(Arrays.stream(D.class.getAnnotations()))
                   .filter(annotation -> annotation.annotationType().equals(A.class)).findFirst())
        .isPresent()
        .containsInstanceOf(A.class);
  }

  @Test
  @DisplayName("wrapAnnotationWithAliasForFunctionality method works correctly")
  void wrapAnnotationWithAliasForFunctionality() {
    //given, when
    Owner vasyaOwner = AnnotationUtils.wrapAnnotationWithAliasForFunctionality(
        Entity.class.getAnnotation(Owner.class));

    Owner petyaOwner = AnnotationUtils.wrapAnnotationWithAliasForFunctionality(
        Entity2.class.getAnnotation(Owner.class));

    //then
    assertThat(vasyaOwner.name()).isEqualTo("Вася");
    assertThat(vasyaOwner.value()).isEqualTo("Вася");
    assertThat(vasyaOwner.isLease()).isEqualTo(false);

    assertThat(petyaOwner.name()).isEqualTo("Петя");
    assertThat(petyaOwner.value()).isEqualTo("Петя");
    assertThat(petyaOwner.isLease()).isEqualTo(true);
  }
}
