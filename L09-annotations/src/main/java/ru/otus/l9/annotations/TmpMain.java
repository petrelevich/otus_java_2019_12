package ru.otus.l9.annotations;

import java.sql.Connection;
import java.sql.SQLException;
import lombok.experimental.Delegate;
import lombok.experimental.NonFinal;

//@Slf4j
@Default(author = "otus")
public class TmpMain implements Connection {

  @Delegate(excludes = AutoCloseable.class)
  @NonFinal
  Connection connection;

  //  @SneakyThrows
  public static void main(String[] args) {
    final Class<TmpMain> tmpMainClass = TmpMain.class;
    final Default aDefault = tmpMainClass.getDeclaredAnnotation(Default.class);
    System.out.println(aDefault.author());
    try {
      Class<?> aClass = Class.forName(args[0]);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

    //    new TmpMain().setSavepoint()

  }

  @Override
  public void close() throws SQLException {
    //...
  }
}
