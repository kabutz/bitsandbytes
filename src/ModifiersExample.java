import java.lang.reflect.*;
import java.util.stream.*;

public class ModifiersExample {
  public static void main(String... args) {
    Stream.of(String.class.getDeclaredFields())
        .forEach(field -> {
          int modifiers = field.getModifiers();
          System.out.println(field.getName() +
              " "
              + modifiers);
          System.out.println("\tpublic: " + Modifier.isPublic(modifiers));
        });

  }
}
