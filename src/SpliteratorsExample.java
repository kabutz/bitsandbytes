import java.util.*;

public class SpliteratorsExample {
  public static void main(String... args) {
    Vector<String> objects = new Vector<>();
    Collections.addAll(objects, "John", "Anton", "Heinz");
    Spliterator<String> names = Spliterators.spliteratorUnknownSize(
        objects.iterator(), 1 << 30
    );
  }
}
