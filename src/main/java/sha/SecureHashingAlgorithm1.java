package sha;

public class SecureHashingAlgorithm1 {
  private long K0 = 0x5a827999, K1 = 0x6ed9eba1, K2 = 0x8f1bbcdc, K3 = 0xca62c1d6;

  /*
   * Constructor for instanciation
   */
  public SecureHashingAlgorithm1() {}

  public String hash(String message) {
    // Initial hash-values
    long H0 = Long.parseLong("67452301", 16);
    long H1 = Long.parseLong("efcdab89", 16);
    long H2 = Long.parseLong("98badcfe", 16);
    long H3 = Long.parseLong("10325476", 16);
    long H4 = Long.parseLong("c3d2e1f0", 16);

    // Working variables
    long a, b, c, d, e, T;
    DataPreprocessor dataPreprocessor = new DataPreprocessor();
    long[][] parsedMessage = dataPreprocessor.parseMessage(message);
    long[] w = new long[80];
    for (int i = 0; i < parsedMessage.length; i++) {
      for (int t = 0; t < 80; t++) {
        if (t <= 15) {
          w[t] = parsedMessage[i][t];
        } else {
          w[t] = rotateLeft(1, (w[t - 3] ^ w[t - 8] ^ w[t - 14] ^ w[t - 16]));
        }
      }

      // 11 0000 1110 0010 1100 0111

      a = H0;
      b = H1;
      c = H2;
      d = H3;
      e = H4;

      for (int t = 0; t < 80; t++) {

        T = (long) ((rotateLeft(5, a) + f(b, c, d, t) + e + k(t) + w[t]) % Math.pow(2, 32));
        e = d;
        d = c;
        c = rotateLeft(30, b);
        b = a;
        a = T;
      }

      H0 = (long) ((a + H0) % Math.pow(2, 32));
      H1 = (long) ((b + H1) % Math.pow(2, 32));
      H2 = (long) ((c + H2) % Math.pow(2, 32));
      H3 = (long) ((d + H3) % Math.pow(2, 32));
      H4 = (long) ((e + H4) % Math.pow(2, 32));
    }
    return Long.toHexString(H0)
        + " "
        + Long.toHexString(H1)
        + " "
        + Long.toHexString(H2)
        + " "
        + Long.toHexString(H3)
        + " "
        + Long.toHexString(H4);
  }

  private long f(long x, long y, long z, int t) {
    if (t <= 19) {
      return ch(x, y, z);
    } else if ((20 <= t && t <= 39) || (60 <= t && t <= 79)) {
      return parity(x, y, z);
    } else {
      return maj(x, y, z);
    }
  }

  private long k(int t) {
    if (t <= 19) {
      return K0;
    } else if (20 <= t && t <= 39) {
      return K1;
    } else if (40 <= t && t <= 59) {
      return K2;
    } else {
      return K3;
    }
  }
  /**
   * Method for Rotate Left
   *
   * @param x
   * @return long for rotating binary values to the left, x being w-bit
   */
  public long rotateLeft(int num, long x) {
    String intermediate = Long.toBinaryString(x);
    String result = "";

    while (intermediate.length() < 32) {
      intermediate = "0" + intermediate;
    }

    result = intermediate.substring(num, 32) + intermediate.substring(0, num);
    x = Long.parseLong(result, 2);
    return x;
  }
  /**
   * Method Ch(x,y,z) for 0 <= t <= 19
   *
   * @param x,y,z
   * @return long (x && y) xor (!x && z)
   */
  public long ch(long x, long y, long z) {
    return (long) ((((x & y) ^ (~x & z)) % Math.pow(2, 32)));
  }
  /**
   * Method for parity, 20 <= t <= 39 60 <= t <= 79
   *
   * @param x,y,z
   * @return long x xor y xor z
   */
  public long parity(long x, long y, long z) {
    return (long) (x ^ y ^ z);
  }

  /**
   * Method for Major(x,y,z) 40 <= t <= 59
   *
   * @param x,y,z
   * @return long (x && y) xor (x && z) xor (y && z)
   */
  public long maj(long x, long y, long z) {
    return (long) ((x & y) ^ (x & z) ^ (y & z));
  }
}
