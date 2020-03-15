package ru.otus.l9.annotations;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by tully.
 * <p>
 * https://dzone.com/articles/java-8-type-annotations
 * @deprecated just for demo :)
 */
@SuppressWarnings("UnusedReturnValue")
@Deprecated(since = "2018-06")                                       //ElementType.TYPE @Default
@Unfinished(
    priority = Unfinished.Priority.LOW,
    value = "too old to rock too young to die",
    lastChanged = "2018-07-26",
    lastChangedBy = "tully"
)
public class AnnotationUsageDemo<T extends @Email String> { //ElementType.TYPE_USE
  @SuppressWarnings({"unused", "FieldCanBeLocal"}) //ElementType.FIELD @Default
  private final int size;

  @Deprecated //ElementType.CONSTRUCTOR @Default
  public AnnotationUsageDemo(int size) {
    this.size = size;
  }

  @Deprecated //ElementType.METHOD @Default
  public static void main(@Immutable String... args) //ElementType.PARAMETER @Default
      throws NoSuchMethodException {
    @Immutable List<String> list = //ElementType.LOCAL_VARIABLE @Default
        Collections.unmodifiableList(
            new @NonEmpty ArrayList<>()); //ElementType.TYPE_USE

    AnnotationUsageDemo.<@Email String>cast(list); //ElementType.TYPE_USE

    final Method method = AnnotationUsageDemo.class.getDeclaredMethod("doNothing");
    final Role.List roleList = method.getDeclaredAnnotation(Role.List.class);
    for (Role role : roleList.value()) {
      System.out.println("role: " + role.value());
    }

    //    final Package aPackage = PackageLevelClass.class.getPackage();
    //    final PackageOwner packageOwner = aPackage.getDeclaredAnnotation(PackageOwner.class);
    //    System.out.println("package owner: " + packageOwner.value());
  }

  private static <@Immutable E> E cast(Object object) { //ElementType.TYPE_PARAMETER
    //noinspection unchecked
    return (E) object;
  }

  //  @Role.List({@Role("admin"), @Role("user")})
  @Role("admin")
  @Role("user")
  @SuppressWarnings("unused")
  private void doNothing() {

  }
}
