public class BitPrinter {
  public static void main(String... args) {
    System.out.println(intToBits(42));
    System.out.println(intToBits(0b10101010101010101010101010101010));
    System.out.println(intToBits(0b01010101010101010101010101010101));
    System.out.println(intToBits(0b01001100011100001111000001111100));
    BitPrinter bp = new BitPrinter();
    System.out.println(bp.floatToBits(1));
    System.out.println(bp.floatToBits(2));
    System.out.println(bp.floatToBits(3));
    System.out.println(bp.floatToBits(4));
    System.out.println(bp.floatToBits(5));
    System.out.println();
    System.out.println("0.1f      " + bp.floatToBits(0.1f));
    System.out.println("0.2f      " + bp.floatToBits(0.2f));
    System.out.println("0.1f+0.2f " + bp.floatToBits(0.1f + 0.2f));
    System.out.println("0.3f      " + bp.floatToBits(0.3f));
    System.out.println("0.4f      " + bp.floatToBits(0.4f));
    System.out.println("0.3f+0.4f " + bp.floatToBits(0.3f + 0.4f));
    System.out.println("0.7f      " + bp.floatToBits(0.7f));
  }

  public static CharSequence intToBits(int num) {
    StringBuilder result = new StringBuilder(40);
    for (int bit = 31; bit >= 0; bit--) {
      result.append(((num & (1 << bit)) != 0) ? 1 : 0);
      if (bit > 0) {
        if (((bit) & 0b11) == 0) result.append('_');
        if (((bit) & 0b111) == 0) result.append('_');
      }
    }
    return result;
  }

  public CharSequence floatToBits(float num) {
    int floatAsBits = Float.floatToIntBits(num);
    StringBuilder result = new StringBuilder(40);
    for (int bit = 31; bit >= 0; bit--) {
      result.append(((floatAsBits & (1 << bit)) != 0) ? 1 : 0);
      if (bit == 31) result.append('_');
      if (bit == 23) result.append('_');
      if (((bit + 1) & 0b11) == 0) result.append('_');
    }
    return result;
  }
}