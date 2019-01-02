public class Pixel {
  private final int x, y;

  public Pixel(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Pixel pixel = (Pixel) o;
    return x == pixel.x && y == pixel.y;
  }

  public int hashCode() {
    // 1024 x 768
    // 786432 unique
    // x = 1, y = 0 -> 31
    // x = 0, y = 31 -> 31
    // x = 2, y = 0 -> 62
    // x = 1, y = 31 -> 62
    // x = 0, y = 62 -> 62
//    return x << 16 ^ y;
    return x * 768 + y;
  }
}
