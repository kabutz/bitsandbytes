public enum HashMapHashing {
  OLD_1_4_0 {
    public int hash(Object key) {
      int h = key == null ? 0 : key.hashCode();
      h += ~(h << 9);
      h ^= (h >>> 14);
      h += (h << 4);
      h ^= (h >>> 10);
      return h;
    }
  },
  BETTER_1_4_0 { // java 1.4.0 until 1.7.0
    public int hash(Object key) {
      int h = key == null ? 0 : key.hashCode();
      h ^= (h >>> 20) ^ (h >>> 12);
      return h ^ (h >>> 7) ^ (h >>> 4);
    }
  },
  JAVA_8 {
    public int hash(Object key) {
      int h;
      return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
  };

  public abstract int hash(Object key);
}