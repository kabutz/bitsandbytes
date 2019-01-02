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

  public CharSequence intToBits(int num) {
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
