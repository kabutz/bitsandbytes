import java.util.*;

class Example {
  double d = 0.0;

  public strictfp void example() {
    float f = 0.1f;
    float g = 0.2f;
    System.out.println(f + g);
  }

  public static void main(String[] args) {
    Example ex = new Example();
    ex.example();
  }
}